package com.hcl.flightamericanapi.repository;

import com.hcl.flightamericanapi.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {



}
