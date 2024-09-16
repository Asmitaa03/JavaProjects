package com.ticketmicroservice.ticketservices.repo;

import com.ticketmicroservice.ticketservices.model.TicketModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketRepo extends MongoRepository<TicketModel, String> {
}
