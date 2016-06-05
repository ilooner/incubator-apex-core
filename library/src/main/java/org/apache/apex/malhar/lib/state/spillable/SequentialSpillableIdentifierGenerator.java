package org.apache.apex.malhar.lib.state.spillable;

import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;

public class SequentialSpillableIdentifierGenerator implements SpillableIdentifierGenerator
{
  private boolean done = false;
  private byte currentIdentifier = 0;

  private Set<Byte> registeredIdentifier = Sets.newHashSet();

  @Override
  public byte[] next()
  {
    Preconditions.checkState(!done);

    byte nextIndentifier = currentIdentifier;
    seek();

    return new byte[]{nextIndentifier};
  }

  @Override
  public void register(byte[] identifierArray)
  {
    Preconditions.checkState(!done);
    Preconditions.checkArgument(identifierArray.length == 1);

    byte identifier = identifierArray[0];

    Preconditions.checkState(identifier >= currentIdentifier &&
                             !registeredIdentifier.contains(identifier));

    registeredIdentifier.add(identifier);

    if (currentIdentifier == identifier) {
      seek();
    }
  }

  private void seek()
  {
    if (currentIdentifier == Byte.MAX_VALUE) {
      done = true;
    } else {
      do {
        currentIdentifier++;
      } while (registeredIdentifier.contains(currentIdentifier) && currentIdentifier < Byte.MAX_VALUE);

      done = currentIdentifier == Byte.MAX_VALUE && registeredIdentifier.contains(currentIdentifier);
    }
  }
}
