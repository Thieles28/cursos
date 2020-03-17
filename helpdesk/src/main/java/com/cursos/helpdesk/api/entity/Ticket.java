package com.cursos.helpdesk.api.entity;

import com.cursos.helpdesk.api.enums.PriorityEnum;
import com.cursos.helpdesk.api.enums.StatusEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
public class Ticket {

    @Id
    private String id;

    @DBRef(lazy = true)
    private User user;

    private Date date;

    private String title;

    private Integer number;

    private StatusEnum status;

    private PriorityEnum priority;

    @DBRef(lazy = true)
    private User assigneUser;

    private String image;

    @Transient
    private List<ChangeStatus> changes;
}
