package com.itic.facturation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itic.facturation.entities.LigneFacture;

@Repository
public interface LigneFactureRepository extends JpaRepository<LigneFacture, Long>{}
