package org.apache.apex.malhar.lib.utils.serde;

public class SliceUtils
{
  private SliceUtils()
  {
  }

  public static byte[] concatenate(byte[] a, byte[] b)
  {
    byte[] output = new byte[a.length + b.length];

    System.arraycopy(a, 0, output, 0, a.length);
    System.arraycopy(b, 0, output, a.length, b.length);
    return output;
  }
}
