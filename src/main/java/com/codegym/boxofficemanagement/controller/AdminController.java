package com.codegym.boxofficemanagement.controller;

import com.codegym.boxofficemanagement.model.Ticket;
import com.codegym.boxofficemanagement.repository.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    private ITicketRepository iTicketRepository;

    @GetMapping("/admin")
    public ModelAndView findAllTickets() {
        ModelAndView modelAndView = new ModelAndView("/admin/index");
        Iterable<Ticket> tickets = iTicketRepository.findAll();
        modelAndView.addObject("tickets", tickets);
        return modelAndView;
    }
    @GetMapping("/admin/{id}")
    public ModelAndView getTicket(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/admin/view");
        Optional<Ticket> ticket = iTicketRepository.findById(id);
        modelAndView.addObject("ticket",ticket.get());
        return modelAndView;
    }
    @GetMapping("/admin/create")
    public ModelAndView createTicket(){
        public ModelAndView createTicket(@ModelAttribute Ticket ticket){}
    }

}
