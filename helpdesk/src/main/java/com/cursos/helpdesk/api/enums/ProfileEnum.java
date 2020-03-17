package com.cursos.helpdesk.api.enums;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum ProfileEnum {
    ROLE_ADMIN,
    ROLE_CUSTOMER,
    ROLE_TECHNICIAN
}
