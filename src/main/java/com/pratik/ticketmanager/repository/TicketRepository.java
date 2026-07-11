package com.pratik.ticketmanager.repository;

import com.pratik.ticketmanager.model.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Page<Ticket> findByStatus(String status, Pageable pageable);
    Page<Ticket> findByPriority(String priority, Pageable pageable);
    Page<Ticket> findByStatusAndPriority(String status, String priority, Pageable pageable);
}