package com.example.Javatest.repositories;

import com.example.Javatest.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
    @Query(value = "SELECT * FROM clients", nativeQuery = true)
    Optional<List<Client>> getClients();
}
