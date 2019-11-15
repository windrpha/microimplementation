package com.hcl.flightdeltaapi.service;

import com.hcl.flightdeltaapi.entity.Flight;
import com.hcl.flightdeltaapi.repository.FlightRepository;
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
