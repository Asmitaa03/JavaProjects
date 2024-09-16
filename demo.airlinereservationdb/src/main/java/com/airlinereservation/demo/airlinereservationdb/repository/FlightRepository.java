package com.airlinereservation.demo.airlinereservationdb.repository;


import com.airlinereservation.demo.airlinereservationdb.model.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlightRepository extends MongoRepository<Flight, String> {
}

