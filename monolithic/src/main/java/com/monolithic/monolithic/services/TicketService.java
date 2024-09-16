package com.monolithic.monolithic.services;

import com.monolithic.monolithic.model.TicketModel;
import com.monolithic.monolithic.model.UserModel;
import com.monolithic.monolithic.repo.TicketRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TicketService {
    @Autowired
    private TicketRepo repo;

    //create ticket
    public TicketModel createTicket(TicketModel model){
        String ticketid = UUID.randomUUID().toString();
        return repo.save(model);
    }

    //get user by id
    public TicketModel getTicketById(String ticketId){
        return repo.findById(ticketId).get();
    }

    //get all tickets
    public List<TicketModel> getAllTickets()
    {
        return repo.findAll();
    }

}
