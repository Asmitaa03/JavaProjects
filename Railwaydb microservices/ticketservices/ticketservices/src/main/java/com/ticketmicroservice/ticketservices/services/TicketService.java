package com.ticketmicroservice.ticketservices.services;

import com.ticketmicroservice.ticketservices.model.TicketModel;
import com.ticketmicroservice.ticketservices.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepo repo;

    //create ticket
    public TicketModel createTicket(TicketModel model){
        return repo.save(model);
    }

    //get all tickets
    public List<TicketModel> getAllTicket()
    {
        return repo.findAll();
    }

    //get ticket by id
    public TicketModel getTicketById(String ticketId)
    {
        return repo.findById(ticketId).get();
    }
}
