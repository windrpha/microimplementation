package com.hcl.flightdeltaapi.repository;

import com.hcl.flightdeltaapi.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {



}
