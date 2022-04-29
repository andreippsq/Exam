package com.example.Javatest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Table(name="events")
@Entity
public class Event {
    @Id
    private int id;
    private String description;
    //@JoinColumn(name = "clients")
    @ManyToMany
    private List<Client> clients;

    /*public Event(Client client) {
        this.clientId = client.getId();
    }*/

    public void addClient(Client client) {
        clients.add(client);
    }

}
