/**
 * Copyright (C) 2015 DataTorrent, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Copyright (c) 2012-2013 DataTorrent, Inc.
 * All rights reserved.
 *
 * @since 0.3.2
 */
package com.datatorrent.stram.webapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.datatorrent.api.annotation.RecordField;

@XmlRootElement(name = "container")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContainerInfo {
  @RecordField(type = "meta")
  public String id;
  @RecordField(type = "meta", publish = false)
  public String host;
  public String state;
  @RecordField(type = "meta")
  public String jvmName;
  public long lastHeartbeat;
  @RecordField(type = "stats")
  public int numOperators;
  @RecordField(type = "meta")
  public int memoryMBAllocated;
  @RecordField(type = "stats")
  public int memoryMBFree;
  @RecordField(type = "stats")
  public long gcCollectionTime;
  @RecordField(type = "stats")
  public long gcCollectionCount;
  @RecordField(type = "meta", publish = false)
  public String containerLogsUrl;
  public long startedTime = -1;
  public long finishedTime = -1;
  @RecordField(type = "meta", publish = false)
  public String rawContainerLogsUrl;
}
