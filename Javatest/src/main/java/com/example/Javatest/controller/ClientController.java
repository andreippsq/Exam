package com.example.Javatest.controller;

import com.example.Javatest.model.Client;
import com.example.Javatest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients/all")
    public Optional<List<Client>> getClients() {
        return clientRepository.getClients();
    }

    @PostMapping("/clients/add")
    public void addClients(@RequestBody Client client) {
        clientRepository.save(client);
    }

}
