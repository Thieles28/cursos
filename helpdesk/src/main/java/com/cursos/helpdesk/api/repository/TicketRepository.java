package com.cursos.helpdesk.api.repository;

import com.cursos.helpdesk.api.entity.Ticket;
import com.cursos.helpdesk.api.enums.PriorityEnum;
import com.cursos.helpdesk.api.enums.StatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {

    Page<Ticket> findByUserIdOrderByDateDesc(Pageable page, String userId);

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc
            (String title, StatusEnum status, PriorityEnum priority, Pageable pageable);

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc
            (String title, StatusEnum status, PriorityEnum priority, Pageable pageable);

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssigneUserOrderByDateDesc
            (String title, StatusEnum status, PriorityEnum priority, Pageable pageable);

    Page<Ticket> findByNumber(Integer id);
}
