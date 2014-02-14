/*
 * Copyright (c) 2013 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.commons.lang.StringUtils;

import com.datatorrent.common.util.DTThrowable;

/**
 * This interface is essentially serializer/deserializer interface which works with String as
 * the serialized type. When initializing the attributes from the properties file, attribute
 * values represented as Strings are needed to be converted to POJO. This class facilitates the
 * conversion from and to String for attribute values.
 *
 * @param <T> Type of the object which can be converted to/from String.
 * @since 0.9.0
 */
public interface StringCodec<T>
{
  /**
   * Given a string representation (typically from properties file) for an object , create object from it.
   *
   * @param string Type of the POJO which is created from String representation.
   * @return POJO obtained as a result of deserialization
   */
  T fromString(String string);

  /**
   * Given a POJO, serialize it to a String object (typically to be stored in properties file).
   *
   * @param pojo The object which needs to be serialized.
   * @return Serialized representation of pojo..
   */
  String toString(T pojo);

  public class String2String implements StringCodec<String>, Serializable
  {
    @Override
    public String fromString(String string)
    {
      return string;
    }

    @Override
    public String toString(String pojo)
    {
      return pojo;
    }

    private static final long serialVersionUID = 201310141156L;
  }

  public class Integer2String implements StringCodec<Integer>, Serializable
  {
    @Override
    public Integer fromString(String string)
    {
      return Integer.valueOf(string);
    }

    @Override
    public String toString(Integer pojo)
    {
      return String.valueOf(pojo);
    }

    private static final long serialVersionUID = 201310141157L;
  }

  public class Long2String implements StringCodec<Long>, Serializable
  {
    @Override
    public Long fromString(String string)
    {
      return Long.valueOf(string);
    }

    @Override
    public String toString(Long pojo)
    {
      return String.valueOf(pojo);
    }

    private static final long serialVersionUID = 201310141158L;
  }

  public class Boolean2String implements StringCodec<Boolean>, Serializable
  {
    @Override
    public Boolean fromString(String string)
    {
      return Boolean.valueOf(string);
    }

    @Override
    public String toString(Boolean pojo)
    {
      return String.valueOf(pojo);
    }

    private static final long serialVersionUID = 201310141159L;
  }

  /**
   * The attributes which represent arbitrary objects for which the schema cannot be
   * standardized, we allow them to be represented as <ClassName>,<String> representation.
   * This allows us to instantiate the class by invoking its constructor which takes
   * <String> as argument. <String> itself can contain comma (,) character in it. If
   * Only the <ClassName> is specified, then just the class is instantiated using default
   * constructor. If comma is specified then class is instantiated using constructor with
   * empty string as an argument.
   *
   * @param <T> Type of the object which is converted to/from String
   */
  public class Object2String<T> implements StringCodec<T>, Serializable
  {
    public final String separator;

    public Object2String()
    {
      separator = ":";
    }

    public Object2String(String separator)
    {
      this.separator = separator;
    }

    @Override
    @SuppressWarnings({"UseSpecificCatch", "BroadCatchBlock", "TooBroadCatch"})
    public T fromString(String string)
    {
      String[] parts = string.split(separator, 2);

      try {
        @SuppressWarnings("unchecked")
        Class<? extends T> clazz = (Class<? extends T>)Thread.currentThread().getContextClassLoader().loadClass(parts[0]);
        if (parts.length == 1) {
          return clazz.newInstance();
        }

        return clazz.getConstructor(String.class).newInstance(parts[1]);
      }
      catch (Throwable cause) {
        DTThrowable.rethrow(cause);
      }

      return null;
    }

    @Override
    public String toString(T pojo)
    {
      String arg = pojo.toString();
      if (arg == null) {
        return pojo.getClass().getCanonicalName();
      }

      return pojo.getClass().getCanonicalName() + separator + arg;
    }

    private static final long serialVersionUID = 201311141853L;
  }

  public class Collection2String<T> implements StringCodec<Collection<T>>, Serializable
  {
    private final String separator;
    private final StringCodec<T> codec;

    public Collection2String()
    {
      separator = ",";
      codec = null;
    }

    public Collection2String(String separator, StringCodec<T> codec)
    {
      this.separator = separator;
      this.codec = codec;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<T> fromString(String string)
    {
      if (string == null) {
        return null;
      }

      if (string.isEmpty()) {
        return Collections.EMPTY_LIST;
      }

      String[] parts = string.split(separator);
      ArrayList<T> arrayList = new ArrayList<T>(parts.length);
      for (String part : parts) {
        arrayList.add(codec.fromString(part));
      }

      return arrayList;
    }

    @Override
    public String toString(Collection<T> pojo)
    {
      if (pojo == null) {
        return null;
      }

      if (pojo.isEmpty()) {
        return "";
      }

      String[] parts = new String[pojo.size()];

      int i = 0;
      for (T o : pojo) {
        parts[i++] = codec.toString(o);
      }

      return StringUtils.join(parts, separator);
    }

    private static final long serialVersionUID = 201401091806L;
  }

  public class Enum2String<T extends Enum<T>> implements StringCodec<T>, Serializable
  {
    private final Class<T> clazz;

    public Enum2String(Class<T> clazz)
    {
      this.clazz = clazz;
    }

    @Override
    public T fromString(String string)
    {
      return Enum.valueOf(clazz, string);
    }

    @Override
    public String toString(T pojo)
    {
      return pojo.name();
    }

    private static final long serialVersionUID = 201310181757L;
  }

  public class Class2String<T> implements StringCodec<Class<? extends T>>, Serializable
  {
    @Override
    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch"})
    public Class<? extends T> fromString(String string)
    {
      try {
        @SuppressWarnings({"rawtypes", "unchecked"})
        Class<? extends T> clazz = (Class)Thread.currentThread().getContextClassLoader().loadClass(string);
        return clazz;
      }
      catch (Throwable cause) {
        DTThrowable.rethrow(cause);
      }

      return null;
    }

    @Override
    public String toString(Class<? extends T> clazz)
    {
      return clazz.getCanonicalName();
    }

    private static final long serialVersionUID = 201312082053L;
  }

}