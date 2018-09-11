package com.mef.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PracticaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaServiceApplication.class, args);
	}
}
