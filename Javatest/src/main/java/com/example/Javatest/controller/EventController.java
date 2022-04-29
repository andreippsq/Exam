package com.example.Javatest.controller;


import com.example.Javatest.model.Client;
import com.example.Javatest.model.Event;
import com.example.Javatest.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @PostMapping("/events/add")
    public void addEvents(@RequestBody Event event) {
        eventRepository.save(event);
    }

    /*@PostMapping("/events/addclient/{id}")
    public void addClientEvent(@PathVariable int id, @RequestBody Client client) {
        Optional<Event> event = eventRepository.findById(id);
        if(event.isPresent()) {
            event.get().addClient(client);
        }
    }*/

    @GetMapping("/events/get/{id}")
    public List<Event> findEventsByUserId(@PathVariable int id) {
        /*Optional<List<Event>> events = Optional.ofNullable(eventRepository.findByClientId(id));
        if(events.isPresent()){
            return events.get();
        }else {
            throw new ClientNotFoundException;
        }*/
        return eventRepository.findByClientId(id);
    }
}
