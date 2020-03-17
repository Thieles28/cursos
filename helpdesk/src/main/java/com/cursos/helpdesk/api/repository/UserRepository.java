package com.cursos.helpdesk.api.repository;

import com.cursos.helpdesk.api.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
