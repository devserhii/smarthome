/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.items.dto;

import java.util.Map;

/**
 * This is a data transfer object that is used to serialize metadata for a certain namespace and item.
 *
 * @author Kai Kreuzer - Initial contribution and API
 *
 */
public class MetadataDTO {

    public String value;
    public Map<String, Object> config;

    public MetadataDTO() {
    }

}
