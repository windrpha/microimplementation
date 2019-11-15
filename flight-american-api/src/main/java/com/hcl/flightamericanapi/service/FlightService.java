package com.hcl.flightamericanapi.service;

import com.hcl.flightamericanapi.entity.Flight;
import com.hcl.flightamericanapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public Iterable<Flight> getFlightData(){

        return flightRepository.findAll();

    }

}
