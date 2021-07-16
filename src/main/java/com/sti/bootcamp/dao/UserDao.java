package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Users, Long> {
    Users findByUsername(String username);
}
