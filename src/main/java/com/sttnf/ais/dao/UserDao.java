package com.sttnf.ais.dao;

import com.sttnf.ais.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Users, Long> {
    Users findByUsername(String username);
}
