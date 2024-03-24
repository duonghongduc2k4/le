package com.codegym.boxofficemanagement.service.impl;

import com.codegym.boxofficemanagement.model.Ticket;
import com.codegym.boxofficemanagement.repository.ITicketRepository;
import com.codegym.boxofficemanagement.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TicketService implements ITicketService {
    @Autowired
    private ITicketRepository iTicketRepository;
    @Override
    public Iterable<Ticket> findAll() {
        return iTicketRepository.findAll();
    }

    @Override
    public void save(Ticket ticket) {
        iTicketRepository.save(ticket);
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return iTicketRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iTicketRepository.deleteById(id);
    }
}
