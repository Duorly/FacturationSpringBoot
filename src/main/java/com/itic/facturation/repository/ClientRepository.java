package com.itic.facturation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itic.facturation.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {}