package com.airlinereservation.demo.airlinereservationdb.controller;

import com.airlinereservation.demo.airlinereservationdb.model.Reservation;
import com.airlinereservation.demo.airlinereservationdb.repository.ReservationRepository;
import com.airlinereservation.demo.airlinereservationdb.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable String id) {
        Optional<Reservation> reservation = reservationService.getReservationById(id);
        return reservation.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        return new ResponseEntity<>(reservationService.saveReservation(reservation), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable String id) {
        reservationService.deleteReservation(id);
        return ResponseEntity.noContent().build();
    }
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/testInsert")
    public String testInsert() {
        Reservation reservation = new Reservation();
        reservation.setPassengerName("Test Passenger");
        reservation.setFlightNumber("TEST123");
        reservationRepository.save(reservation);
        return "Insert successful";
    }

}

