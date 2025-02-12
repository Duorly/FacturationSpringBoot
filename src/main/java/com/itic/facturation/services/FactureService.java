package com.itic.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itic.facturation.entities.Facture;
import com.itic.facturation.repository.FactureRepository;

@Service
public class FactureService {
    @Autowired
    private FactureRepository factureRepository;

    public List<Facture> getFacturesByClientId(Long clientId) {
        return factureRepository.findByClientId(clientId);
    }

    public Facture createFacture(Facture facture) {
        return factureRepository.save(facture);
    }
}