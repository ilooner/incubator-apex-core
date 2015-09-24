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
package com.datatorrent.contrib.memsql;

import com.datatorrent.lib.db.jdbc.AbstractJdbcInputOperator;

/**
 * This is an input operator that reads from a memsql database.
 * @param <T> The type of tuple to be processed.
 *
 * @since 1.0.5
 */
public abstract class AbstractMemsqlInputOperator<T> extends AbstractJdbcInputOperator<T>
{
  public AbstractMemsqlInputOperator()
  {
    this.store = new MemsqlStore();
  }
}