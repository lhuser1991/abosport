package com.example.abosport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abosport.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer>{

}
