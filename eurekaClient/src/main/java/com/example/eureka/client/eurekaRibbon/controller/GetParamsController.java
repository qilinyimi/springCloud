package com.example.eureka.client.eurekaRibbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/getParams")
@RestController
public class GetParamsController {
    @RequestMapping("/")
    public String getParams(){
        return "params";
    }
}
