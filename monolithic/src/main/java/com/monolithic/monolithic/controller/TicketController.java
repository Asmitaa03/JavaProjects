package com.monolithic.monolithic.controller;

import com.monolithic.monolithic.model.TicketModel;
import com.monolithic.monolithic.model.UserModel;
import com.monolithic.monolithic.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService services;

    @PostMapping()
    public TicketModel addTicket(@RequestBody TicketModel ticketModel){
        return services.createTicket(ticketModel);

    }

    @GetMapping()
    public List<TicketModel> getAllTickets(){
        return  services.getAllTickets();

    }

    @GetMapping(value = "/{ticketId}")
    public  TicketModel getTicketById(@PathVariable("ticketId") @RequestBody String TicketId){
        return services.getTicketById(TicketId);
    }




}
