package com.example.consumption.rest;

import com.example.consumption.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @RequestMapping("hello2")
    public String hello2(){
        return  helloWordService.hello();
    }
}
