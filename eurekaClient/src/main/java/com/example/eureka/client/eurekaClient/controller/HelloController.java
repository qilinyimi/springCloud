package com.example.eureka.client.eurekaClient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
        @RequestMapping("/w")
        public String helloWorld(){
            return "hello world";
        }
}
