package com.hcl.flightoperationsapi.controller;

import com.hcl.flightoperationsapi.domain.Flight;
import com.hcl.flightoperationsapi.domain.FlightList;
import com.hcl.flightoperationsapi.service.ConsumeAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgregationController {

    @Autowired
    private ConsumeAPI consumeAPI;

    @CrossOrigin(origins = "*")
    @GetMapping("/search")
    public List<Flight> agregator(){

        return consumeAPI.mergeResults();


    }

}
