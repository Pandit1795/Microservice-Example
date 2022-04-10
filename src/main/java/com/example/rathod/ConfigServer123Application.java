package com.example.rathod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer123Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer123Application.class, args);
	}

}
