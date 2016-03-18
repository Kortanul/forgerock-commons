/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2016 ForgeRock AS.
 */
package com.forgerock.api.enums;

/**
 * Enum that represents the {@link com.forgerock.api.beans.Schema} write policies.
 *
 */
public enum WritePolicyEnum {
    /**the property MAY be set in the create request, but not thereafter*/
    WRITE_ON_CREATE,
    /**the property MAY be set only if the current value is NULL*/
    WRITE_ONCE,
    /**the property can be set at any time. This is the default value if no value is specified*/
    WRITABLE;
}
