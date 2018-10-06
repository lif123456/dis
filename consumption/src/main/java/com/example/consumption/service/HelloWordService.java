package com.example.consumption.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "dis",path = "/dis")
public interface HelloWordService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
