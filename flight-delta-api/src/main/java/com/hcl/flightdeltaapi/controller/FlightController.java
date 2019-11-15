package com.hcl.flightdeltaapi.controller;

import com.hcl.flightdeltaapi.entity.Flight;
import com.hcl.flightdeltaapi.service.FlightService;
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
