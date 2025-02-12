package com.itic.facturation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itic.facturation.entities.LigneFacture;
import com.itic.facturation.services.LigneFactureService;

@RestController
@RequestMapping("/lignes")
public class LigneFactureController {
    @Autowired
    private LigneFactureService ligneFactureService;

    @PostMapping
    public LigneFacture createLigneFacture(@RequestBody LigneFacture ligneFacture) {
        return ligneFactureService.createLigneFacture(ligneFacture);
    }
}
