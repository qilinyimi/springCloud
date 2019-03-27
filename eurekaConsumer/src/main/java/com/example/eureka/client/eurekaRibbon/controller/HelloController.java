package com.example.eureka.client.eurekaRibbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
        @RequestMapping("/ribbon")
        public String helloWorld(){
            return "hello ribbon:"+   restTemplate.getForObject("http://EUREKACLIENT/getParams/",String.class);
        }
}
