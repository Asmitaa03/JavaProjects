package com.ticketmicroservice.ticketservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tickets")
public class TicketModel {
    @Id
    private String ticketId;
    private String userId;
    private String trainName;
}

