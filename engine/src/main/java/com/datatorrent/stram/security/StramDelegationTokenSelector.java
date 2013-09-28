/*
 *  Copyright (c) 2012-2013 DataTorrent, Inc.
 *  All Rights Reserved.
 */
package com.datatorrent.stram.security;

import java.util.Collection;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.security.token.TokenIdentifier;
import org.apache.hadoop.security.token.TokenSelector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>StramDelegationTokenSelector class.</p>
 *
 * @author Pramod Immaneni <pramod@datatorrent.com>
 * @since 0.3.2
 */
public class StramDelegationTokenSelector implements TokenSelector<StramDelegationTokenIdentifier>
{

  private static final Logger LOG= LoggerFactory.getLogger(StramDelegationTokenSelector.class);

  @Override
  public Token<StramDelegationTokenIdentifier> selectToken(Text text, Collection<Token<? extends TokenIdentifier>> clctn)
  {
    Token<StramDelegationTokenIdentifier> token = null;
    if (text  != null) {
      for (Token<? extends TokenIdentifier> ctoken : clctn) {
        if (StramDelegationTokenIdentifier.IDENTIFIER_KIND.equals(ctoken.getKind()) && text.equals(ctoken.getService()))
        {
          token = (Token<StramDelegationTokenIdentifier>)ctoken;
        }
      }
    }
    return token;
  }

}