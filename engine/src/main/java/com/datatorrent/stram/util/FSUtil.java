/*
 *  Copyright (c) 2012-2013 DataTorrent, Inc.
 *  All Rights Reserved.
 */
package com.datatorrent.stram.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsPermission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>FSUtil class.</p>
 *
 * @since 1.0.1
 */
public class FSUtil
{
  private static final Logger LOG = LoggerFactory.getLogger(FSUtil.class);

  /**
   * Copied from FileUtil to transfer ownership
   * @param srcFS
   * @param srcStatus
   * @param dstFS
   * @param dst
   * @param deleteSource
   * @param overwrite
   * @param conf
   * @return
   * @throws IOException
   */
  public static boolean copy(FileSystem srcFS, FileStatus srcStatus,
                              FileSystem dstFS, Path dst,
                              boolean deleteSource,
                              boolean overwrite,
                              Configuration conf) throws IOException {
    Path src = srcStatus.getPath();
    //dst = checkDest(src.getName(), dstFS, dst, overwrite);
    if (srcStatus.isDirectory()) {
      //checkDependencies(srcFS, src, dstFS, dst);
      if (!mkdirs(dstFS, dst)) {
        return false;
      }

      FileStatus contents[] = srcFS.listStatus(src);
      for (int i = 0; i < contents.length; i++) {
        copy(srcFS, contents[i], dstFS,
             new Path(dst, contents[i].getPath().getName()),
             deleteSource, overwrite, conf);
      }
    } else {
      InputStream in=null;
      OutputStream out = null;
      try {
        in = srcFS.open(src);
        out = dstFS.create(dst, overwrite);
        org.apache.hadoop.io.IOUtils.copyBytes(in, out, conf, true);
      } catch (IOException e) {
        org.apache.hadoop.io.IOUtils.closeStream(out);
        org.apache.hadoop.io.IOUtils.closeStream(in);
        throw e;
      }
    }

    // TODO: change group and limit write to group
    if (srcStatus.isDirectory()) {
      dstFS.setPermission(dst, new FsPermission((short) 0777));
    } else {
      dstFS.setPermission(dst, new FsPermission((short) 0777)/*"ugo+w"*/);
    }
    //dstFS.setOwner(dst, null, srcStatus.getGroup());

/*
    try {
      // transfer owner
      // DOES NOT WORK only super user can change file owner
      dstFS.setOwner(dst, srcStatus.getOwner(), srcStatus.getGroup());
    } catch (IOException e) {
      LOG.warn("Failed to change owner on {} to {}", dst, srcStatus.getOwner(), e);
      throw e;
    }
*/
    if (deleteSource) {
      return srcFS.delete(src, true);
    } else {
      return true;
    }

  }

  public static void setPermission(FileSystem fs, Path dst, FsPermission permission) throws IOException
  {
    FileStatus contents[] = fs.listStatus(dst);
    for (int i = 0; i < contents.length; i++) {
      fs.setPermission(contents[i].getPath(), permission);
    }
    fs.setPermission(dst, permission);
  }
  
  
  public static boolean mkdirs(FileSystem fs, Path dest) throws IOException {
    try {
      return fs.mkdirs(dest);
    } catch (IOException e) {
      // some file system (MapR) throw exception if folder exists
      if (!fs.exists(dest)) {
        throw e;
      } else {
        return false;
      }
    }
  }

}