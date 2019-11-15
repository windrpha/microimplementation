package com.hcl.flightgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class FlightgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightgatewayApplication.class, args);
	}

}
