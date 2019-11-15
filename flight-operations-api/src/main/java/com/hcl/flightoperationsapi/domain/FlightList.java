package com.hcl.flightoperationsapi.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FlightList implements Serializable {

    private List<Flight> flights;

    public FlightList() {
        flights = new ArrayList<>();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
