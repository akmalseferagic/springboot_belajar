package com.sti.bootcamp.service;


import com.sti.bootcamp.model.Users;
import java.util.List;

public interface UserService {

    Users save(Users user);
    List<Users> findAll();
    void delete(long id);
}
