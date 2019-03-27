package com.example.eureka.client.eurekaRibbon.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
        private EurekaClient eurekaClient;
        @RequestMapping("/w")
        public String helloWorld(){
            final InstanceInfo serverInstance = eurekaClient.getNextServerFromEureka("EUREKACLIENT", false);
            return "hello world:"+  serverInstance.getHomePageUrl();
        }
}
