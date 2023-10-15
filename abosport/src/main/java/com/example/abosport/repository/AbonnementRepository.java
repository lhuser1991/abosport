package com.example.abosport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abosport.model.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Integer>{
    
}
