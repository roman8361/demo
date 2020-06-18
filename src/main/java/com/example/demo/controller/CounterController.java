package com.example.demo.controller;


import com.example.demo.api.repository.UserRepository;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.NamedEntityGraph;

//
//@Named
//@Scope(WebApplicationContext.SCOPE_REQUEST)
@ViewScoped
@ManagedBean
public class CounterController {


    private Integer count = 0;

    public void increment () {
        count ++;
    }

    public Integer getCount() {
        return count;
    }

    public void insertUser() {
        final User user = new User();
        user.setName("MASSSAA");
        user.setPassword("Masik03");
        user.setPassword("mask01");

    }

}
