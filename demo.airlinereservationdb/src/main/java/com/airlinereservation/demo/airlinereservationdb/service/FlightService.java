package com.airlinereservation.demo.airlinereservationdb.service;

import com.airlinereservation.demo.airlinereservationdb.model.Flight;
import com.airlinereservation.demo.airlinereservationdb.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightById(String id) {
        return flightRepository.findById(id);
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public void deleteFlight(String id) {
        flightRepository.deleteById(id);
    }
}
