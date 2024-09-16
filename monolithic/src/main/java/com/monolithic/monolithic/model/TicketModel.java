package com.monolithic.monolithic.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "tickets" )
public class TicketModel {
    @Id
    private String ticketId;
    private String userId;
    private String trainName;
}
