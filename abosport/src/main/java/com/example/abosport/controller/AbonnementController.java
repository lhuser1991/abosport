package com.example.abosport.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.abosport.model.Abonnement;
import com.example.abosport.repository.AbonnementRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class AbonnementController {
    
    @Autowired
    private AbonnementRepository abonnementRepository;

    @GetMapping("/abonnements")
    public List<Abonnement> getAllAbonnements() {
        return this.abonnementRepository.findAll();
    }
}
