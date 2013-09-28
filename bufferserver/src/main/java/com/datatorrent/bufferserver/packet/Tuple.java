/*
 *  Copyright (c) 2012-2013 DataTorrent, Inc.
 *  All Rights Reserved.
 */
package com.datatorrent.bufferserver.packet;

import com.datatorrent.bufferserver.util.Codec;
import com.datatorrent.common.util.Slice;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Abstract Tuple class.</p>
 *
 * @author Chetan Narsude <chetan@datatorrent.com>
 * @since 0.3.2
 */
public abstract class Tuple
{
  public static final String CLASSIC_VERSION = "1.0";
  public static final String FAST_VERSION = "1.1";
  public final byte[] buffer;
  public final int offset;
  public final int length;

  public Tuple(byte[] array, int offset, int length)
  {
    this.buffer = array;
    this.offset = offset;
    this.length = length;
  }

  public static Tuple getTuple(byte[] buffer, int offset, int length)
  {
    if (buffer == null) {
      logger.debug("found null buffer!");
    }
    switch (MessageType.valueOf(buffer[offset])) {
      case NO_MESSAGE:
        return new NoMessageTuple(buffer, offset, length);

      case CHECKPOINT:
        return new WindowIdTuple(buffer, offset, length);

      case CODEC_STATE:
        return new DataTuple(buffer, offset, length);

      case PAYLOAD:
        return new PayloadTuple(buffer, offset, length);

      case RESET_WINDOW:
        return new ResetWindowTuple(buffer, offset, length);

      case BEGIN_WINDOW:
        return new BeginWindowTuple(buffer, offset, length);

      case END_WINDOW:
        return new EndWindowTuple(buffer, offset, length);

      case END_STREAM:
        return new WindowIdTuple(buffer, offset, length);

      case PUBLISHER_REQUEST:
        PublishRequestTuple prt = new PublishRequestTuple(buffer, offset, length);
        prt.parse();
        if (!prt.isValid()) {
          logger.error("Unparseable Generic Request Tuple of type {} received!", MessageType.valueOf(buffer[offset]));
        }
        return prt;

      case PURGE_REQUEST:
        PurgeRequestTuple purgert = new PurgeRequestTuple(buffer, offset, length);
        purgert.parse();
        if (!purgert.isValid()) {
          logger.error("Unparseable Purge Request Tuple of type {} received!", MessageType.valueOf(buffer[offset]));
        }
        return purgert;

      case RESET_REQUEST:
        ResetRequestTuple resetrt = new ResetRequestTuple(buffer, offset, length);
        resetrt.parse();
        if (!resetrt.isValid()) {
          logger.error("Unparseable Reset Request Tuple of type {} received!", MessageType.valueOf(buffer[offset]));
        }
        return resetrt;

      case SUBSCRIBER_REQUEST:
        SubscribeRequestTuple srt = new SubscribeRequestTuple(buffer, offset, length);
        srt.parse();
        if (!srt.isValid()) {
          logger.error("Unparseable Subscriber Request Tuple received!");
        }
        return srt;

      default:
        return null;
    }
  }

  public static int writeString(String identifier, byte[] array, int offset)
  {
    offset = Codec.writeRawVarint32(identifier.getBytes().length, array, offset);
    System.arraycopy(identifier.getBytes(), 0, array, offset, identifier.getBytes().length);
    return offset + identifier.getBytes().length;
  }

  public int readVarInt(int offset, int limit)
  {
    if (offset < limit) {
      byte tmp = buffer[offset++];
      if (tmp >= 0) {
        return tmp;
      }
      else if (offset < limit) {
        int integer = tmp & 0x7f;
        tmp = buffer[offset++];
        if (tmp >= 0) {
          return integer | tmp << 7;
        }
        else if (offset < limit) {
          integer |= (tmp & 0x7f) << 7;
          tmp = buffer[offset++];

          if (tmp >= 0) {
            return integer | tmp << 14;
          }
          else if (offset < limit) {
            integer |= (tmp & 0x7f) << 14;
            tmp = buffer[offset++];
            if (tmp >= 0) {
              return integer | tmp << 21;
            }
            else if (offset < limit) {
              integer |= (tmp & 0x7f) << 21;
              tmp = buffer[offset++];
              if (tmp >= 0) {
                return integer | tmp << 28;
              }
              else {
                throw new NumberFormatException("Invalid varint at location " + offset + " => "
                        + Arrays.toString(Arrays.copyOfRange(buffer, offset, limit)));
              }
            }
          }
        }
      }
    }

    return Integer.MIN_VALUE;
  }

  public MessageType getType()
  {
    return MessageType.valueOf(buffer[offset]);
  }

  public abstract int getWindowId();

  public abstract int getPartition();

  public abstract Slice getData();

  public abstract int getBaseSeconds();

  public abstract int getWindowWidth();

  private static final Logger logger = LoggerFactory.getLogger(Tuple.class);
}