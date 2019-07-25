package com.aaa.er;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakeRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeRegistryApplication.class, args);
	}

}
