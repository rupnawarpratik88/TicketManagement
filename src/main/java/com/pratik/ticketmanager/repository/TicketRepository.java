package com.pratik.ticketmanager.repository;

import com.pratik.ticketmanager.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}