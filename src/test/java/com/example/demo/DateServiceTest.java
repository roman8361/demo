package com.example.demo;

import com.example.demo.service.DateService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DateServiceTest {

    @Autowired
    DateService dateService;

    @Test
    public void dateTest(){
        System.out.println(dateService.getCurrentDate());
    }

}
