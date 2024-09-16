package com.ticketmicroservice.ticketservices.controller;

import com.ticketmicroservice.ticketservices.model.TicketModel;
import com.ticketmicroservice.ticketservices.repo.TicketRepo;
import com.ticketmicroservice.ticketservices.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService service;

    //call create ticket
    @PostMapping()
    public TicketModel createTicket(@RequestBody TicketModel model)
    {
        return service.createTicket(model);
    }

    //to get all tickets
    @GetMapping()
    public List<TicketModel> getAllTicket()
    {
        return service.getAllTicket();
    }

    //to get the ticket by id
    @GetMapping(value = "/{ticketId}")
    public TicketModel getTicketById(@PathVariable("ticketId") @RequestBody String ticketId)
    {
        return service.getTicketById(ticketId);
    }



}