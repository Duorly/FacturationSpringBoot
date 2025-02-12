package com.itic.facturation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itic.facturation.entities.Facture;
import com.itic.facturation.services.FactureService;

@RestController
@RequestMapping("/factures")
public class FactureController {
    @Autowired
    private FactureService factureService;
    
    public FactureController() {
    	this.factureService = new FactureService();
    }

    @GetMapping("/client/{clientId}")
    public List<Facture> getFacturesByClientId(@PathVariable Long clientId) {
        return factureService.getFacturesByClientId(clientId);
    }

    @PostMapping
    public Facture createFacture(@RequestBody Facture facture) {
        return factureService.createFacture(facture);
    }
}