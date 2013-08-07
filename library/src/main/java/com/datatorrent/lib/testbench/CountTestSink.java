/*
 * Copyright (c) 2013 Malhar Inc. ALL Rights Reserved.
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
package com.datatorrent.lib.testbench;

/**
 * A sink implementation to collect expected test results.
 */
public class CountTestSink<T> extends CollectorTestSink<T>
{
  public  int count = 0;

  @Override
  public void clear()
  {
    count = 0;
    super.clear();
  }

  public int getCount()
  {
    return count;
  }

  /**
   *
   * @param payload
   */
  @Override
  public void put(T payload)
  {
      count++;
  }
}