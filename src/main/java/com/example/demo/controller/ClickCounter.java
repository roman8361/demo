package com.example.demo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ClickCounter {

    public void click() {
        System.out.println("CLICK!! CLICK");
    }

}
