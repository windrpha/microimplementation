package com.hcl.flightamericanapi;

import com.hcl.flightamericanapi.entity.Flight;
import com.hcl.flightamericanapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
public class FlightAmericanApiApplication {

	@Autowired
	private FlightRepository flightRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlightAmericanApiApplication.class, args);
	}

	@PostConstruct
	public void createData(){

		Flight flight = new Flight();
		flight.setFlight_date(new Date());
		flight.setLeg("TOR-DALL");
		flight.setPrice(203.45);
		flight.setAirline_name("AMERICAN");

		Flight flight1 = new Flight();
		flight1.setFlight_date(new Date());
		flight1.setLeg("ORL-DAL");
		flight1.setPrice(500.67);
		flight1.setAirline_name("AMERICAN");


		Flight flight2 = new Flight();
		flight2.setFlight_date(new Date());
		flight2.setLeg("EWR-ORL");
		flight2.setPrice(108.67);
		flight2.setAirline_name("AMERICAN");


		Flight flight3 = new Flight();
		flight3.setFlight_date(new Date());
		flight3.setLeg("JFK-DAL");
		flight3.setPrice(100);
		flight3.setAirline_name("AMERICAN");


		Flight flight4 = new Flight();
		flight4.setFlight_date(new Date());
		flight4.setLeg("LGA-MIA");
		flight4.setPrice(90.34);
		flight4.setAirline_name("AMERICAN");


		flightRepository.save(flight);
		flightRepository.save(flight1);
		flightRepository.save(flight2);
		flightRepository.save(flight3);
		flightRepository.save(flight4);

	}

}
