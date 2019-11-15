package com.hcl.flightamericanapi.controller;

import com.hcl.flightamericanapi.entity.Flight;
import com.hcl.flightamericanapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight")
    public Iterable<Flight> helloWorld() {

        return flightService.getFlightData();
    }

}
