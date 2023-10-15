package com.example.abosport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.abosport.model.Personne;
import com.example.abosport.model.Sport;
import com.example.abosport.repository.PersonneRepository;
import com.example.abosport.repository.SportRepository;

@RestController
@RequestMapping("/api/v1/abosport")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonneController {
    
    @Autowired
    private PersonneRepository personneRepository;

    @Autowired
    private SportRepository sportRepository;

    @Autowired
    private AbonnementController abonnementController;

    @GetMapping("/personne")
    public List<Personne> getAllPersonnes() {
        return this.personneRepository.findAll();
    }

    @GetMapping("/personne/{id}")
    public ResponseEntity<Personne> getPersonnesById(@PathVariable Integer id) {
        Personne personne = personneRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return ResponseEntity.ok(personne);
    }

    @GetMapping("/personne/{idPersonne}/listeabonnementsport")
    public List<Sport> getListSportAbonnementByPersonne(@PathVariable Integer idPersonne) {
        return this.sportRepository.findListSportByIdPersonne(idPersonne);
    }
}
