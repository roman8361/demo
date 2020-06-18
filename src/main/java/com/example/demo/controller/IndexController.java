package com.example.demo.controller;

import com.example.demo.api.repository.UserRepository;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session")
public class IndexController {

    @Autowired
    UserRepository userRepository;


    public void insertUser() {
        final User user = new User();
        user.setName("MASSSAA");
        user.setPassword("Masik03");
        user.setPassword("mask01");

        System.out.println("insertUser");
        userRepository.save(user);
    }

}
