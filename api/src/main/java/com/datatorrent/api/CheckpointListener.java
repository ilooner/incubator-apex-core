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

/**
 * Operators must implement this interface if they are interested in being notified as
 * soon as the operator state is checkpointed or committed.
 *
 * @since 0.3.2
 */
public interface CheckpointListener
{
  /**
   * <p>checkpointed.</p>
   */
  public void checkpointed(long windowId);

  /**
   * <p>committed.</p>
   */
  public void committed(long windowId);

}