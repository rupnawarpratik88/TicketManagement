package com.pratik.ticketmanager.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String status = "OPEN"; // OPEN, IN_PROGRESS, CLOSED

    private String priority = "MEDIUM"; // LOW, MEDIUM, HIGH
}
