package com.airlinereservation.demo.airlinereservationdb.repository;

import com.airlinereservation.demo.airlinereservationdb.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
