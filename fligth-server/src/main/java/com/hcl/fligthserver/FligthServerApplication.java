package com.hcl.fligthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FligthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FligthServerApplication.class, args);
	}

}
