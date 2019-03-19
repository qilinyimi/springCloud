package com.example.config.client.cfgClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyFirstController {
    @Value("${foo}")
    private String v;
    @RequestMapping("/world")
    public String helloWorld(){
        return "hello world! " +v;
    }
}
