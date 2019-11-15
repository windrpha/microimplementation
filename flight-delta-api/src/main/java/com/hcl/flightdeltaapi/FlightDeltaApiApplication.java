package com.hcl.flightdeltaapi;

import com.hcl.flightdeltaapi.entity.Flight;
import com.hcl.flightdeltaapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class FlightDeltaApiApplication {

	@Autowired
	private FlightRepository flightRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlightDeltaApiApplication.class, args);
	}

	@PostConstruct
	public void createData(){

		Flight flight = new Flight();
		flight.setFlight_date(new Date());
		flight.setLeg("TOR-DALL");
		flight.setPrice(56.45);
		flight.setAirline_name("DELTA");

		Flight flight1 = new Flight();
		flight1.setFlight_date(new Date());
		flight1.setLeg("ORL-DAL");
		flight1.setPrice(93.45);
		flight1.setAirline_name("DELTA");

		Flight flight2 = new Flight();
		flight2.setFlight_date(new Date());
		flight2.setLeg("EWR-ORL");
		flight2.setPrice(100.90);
		flight2.setAirline_name("DELTA");

		Flight flight3 = new Flight();
		flight3.setFlight_date(new Date());
		flight3.setLeg("JFK-DAL");
		flight3.setPrice(23.45);
		flight3.setAirline_name("DELTA");

		Flight flight4 = new Flight();
		flight4.setFlight_date(new Date());
		flight4.setLeg("LGA-MIA");
		flight4.setPrice(123.34);
		flight4.setAirline_name("DELTA");

		flightRepository.save(flight);
		flightRepository.save(flight1);
		flightRepository.save(flight2);
		flightRepository.save(flight3);
		flightRepository.save(flight4);

	}

}
