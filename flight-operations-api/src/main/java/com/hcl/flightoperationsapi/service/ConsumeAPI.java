package com.hcl.flightoperationsapi.service;

import com.hcl.flightoperationsapi.domain.Flight;
import com.hcl.flightoperationsapi.domain.FlightList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumeAPI {

    @Autowired
    private RestTemplate restTemplate;

    String uriAmerican = "http://localhost:8090/flight";
    String uriDelta = "http://localhost:8091/flight";

    @HystrixCommand(fallbackMethod = "fallback")
    public List<Flight> consumeDeltaApi(){

        ResponseEntity<List<Flight>> responseEntity = restTemplate.exchange(uriAmerican, HttpMethod.GET, null, new ParameterizedTypeReference<List<Flight>>() {
        });
        List<Flight> flights = responseEntity.getBody();

        return flights;
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public List<Flight> consumeAmericanApi(){

        ResponseEntity<List<Flight>> responseEntity = restTemplate.exchange(uriDelta, HttpMethod.GET, null, new ParameterizedTypeReference<List<Flight>>() {
        });
        List<Flight> flights = responseEntity.getBody();

        return flights;

    }

    public List<Flight> mergeResults(){

        List<Flight> delta = consumeDeltaApi();
        List<Flight> american = consumeAmericanApi();

        delta.addAll(american);
        return delta;
    }


    private List<Flight> fallback(Throwable e){
        return new ArrayList<>();
    }


}
