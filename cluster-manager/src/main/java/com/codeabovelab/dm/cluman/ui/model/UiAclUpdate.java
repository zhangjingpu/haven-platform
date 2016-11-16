/*
 * Copyright 2016 Code Above Lab LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeabovelab.dm.cluman.ui.model;

import com.codeabovelab.dm.common.security.acl.TenantSid;
import com.codeabovelab.dm.common.security.dto.PermissionData;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 */
@Data
public class UiAclUpdate {

    @Data
    public static class UiAceUpdate {
        protected boolean delete = false;
        protected String id;
        protected TenantSid sid;
        protected Boolean granting;
        protected PermissionData permission;
        protected Boolean auditFailure;
        protected Boolean auditSuccess;
    }

    private final List<UiAceUpdate> entries = new ArrayList<>();
    private TenantSid owner;
}