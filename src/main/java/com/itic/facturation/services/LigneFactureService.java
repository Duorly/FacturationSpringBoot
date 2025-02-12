package com.itic.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itic.facturation.entities.LigneFacture;
import com.itic.facturation.repository.LigneFactureRepository;

@Service
public class LigneFactureService {
    @Autowired
    private LigneFactureRepository ligneFactureRepository;

    public List<LigneFacture> getLignesByFactureId(Long factureId) {
        return ligneFactureRepository.findAll();
    }

    public LigneFacture createLigneFacture(LigneFacture ligneFacture) {
        return ligneFactureRepository.save(ligneFacture);
    }
}
