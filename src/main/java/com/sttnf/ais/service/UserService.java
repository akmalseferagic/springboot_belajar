package com.sttnf.ais.service;


import com.sttnf.ais.model.Users;
import java.util.List;

public interface UserService {

    Users save(Users user);
    List<Users> findAll();
    void delete(long id);
}
