package com.cursos.helpdesk.api.entity;

import com.cursos.helpdesk.api.enums.StatusEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class ChangeStatus {

    @Id
    private String id;
    @DBRef
    private Ticket ticket;

    private User userChange;

    private Date dateChangeStatus;

    private StatusEnum status;

}
