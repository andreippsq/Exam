package com.example.Javatest.model;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Table(name="clients")
@Entity
public class Client {
    @Id
    private int id;
    private String username;
    private String password;

}
