package com.itic.facturation;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.itic.facturation.entities.Client;
import com.itic.facturation.entities.Facture;
import com.itic.facturation.entities.LigneFacture;
import com.itic.facturation.repository.ClientRepository;
import com.itic.facturation.repository.FactureRepository;
import com.itic.facturation.repository.LigneFactureRepository;

@SpringBootApplication
public class FacturationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturationApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(ClientRepository clientRepository, FactureRepository factureRepository, LigneFactureRepository ligneFactureRepository) {
	    return args -> {
	        Client client = clientRepository.save(new Client(null, "Jean Dupont", "jean.dupont@email.com", "123 Rue Principale", null));
	        Facture facture = factureRepository.save(new Facture(null, "2025-02-12", 200.0, client, null));
	        ligneFactureRepository.saveAll(List.of(
	            new LigneFacture(null, "Service A", 50.0, 2, facture),
	            new LigneFacture(null, "Service B", 100.0, 1, facture)
	        ));
	    };
	}

}
