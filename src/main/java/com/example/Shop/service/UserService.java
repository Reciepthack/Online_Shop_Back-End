package com.example.Shop.service;


import com.example.Shop.model.User;

import java.util.List;


public interface UserService {
    User getOne(Long id);

    List<User> findAll();

    User findByUsernameAndPassword(String username, String password);
}
