package com.example.demo.controller;


import com.example.demo.service.DateService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@Getter
//@Component
//@Scope(value = "session")

@ViewScoped
@ManagedBean
public class DateController {

    private Date sbDate;

    private Date jsfDate;

    @Autowired
    DateService dateService;

    public void initSbDate(){
        System.out.println("initCurrentDate");
        sbDate = dateService.getCurrentDate();
    }

    public void initJsfDate(){
        System.out.println("initJsfDate");
        jsfDate = new Date();
    }

}
