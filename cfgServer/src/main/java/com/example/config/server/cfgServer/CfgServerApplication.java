package com.example.config.server.cfgServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CfgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfgServerApplication.class, args);
	}

}
