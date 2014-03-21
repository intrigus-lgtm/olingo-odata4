/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.client.core.op.impl.v3;

import org.apache.olingo.client.api.data.v3.LinkCollection;
import org.apache.olingo.client.api.domain.v3.ODataLinkCollection;
import org.apache.olingo.client.api.op.v3.ODataBinder;
import org.apache.olingo.client.core.op.impl.AbstractODataBinder;
import org.apache.olingo.client.core.v3.ODataClientImpl;

public class ODataBinderImpl extends AbstractODataBinder implements ODataBinder {

  private static final long serialVersionUID = 8970843539708952308L;

  public ODataBinderImpl(final ODataClientImpl client) {
    super(client);
  }

  @Override
  public ODataLinkCollection getLinkCollection(final LinkCollection linkCollection) {
    final ODataLinkCollection collection = new ODataLinkCollection(linkCollection.getNext());
    collection.setLinks(linkCollection.getLinks());
    return collection;
  }

}