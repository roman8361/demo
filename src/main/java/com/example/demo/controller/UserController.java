package com.example.demo.controller;

import com.example.demo.entity.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ViewScoped
@ManagedBean
public class UserController {

    private final List<User> userList = new ArrayList<>();

    {
        userList.add(new User("Masya", "masik01", "111"));
        userList.add(new User("Filya", "fil666", "222"));
        userList.add(new User("Pafiriy", "pafik", "333"));
    }

    public List<User> getUserList() {
        return userList;
    }

    public void createUser(){
        userList.add(new User(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
                UUID.randomUUID().toString()));
    }

}
