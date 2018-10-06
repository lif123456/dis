package com.example.discovery.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWordTest {

    @RequestMapping("hello")
    public String hello(){
        return  "hello";
    }

}
