package com.example.abosport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.abosport.model.Sport;

@Repository
public interface SportRepository extends JpaRepository<Sport, Integer>{
    @Query(value = "SELECT s.id, s.nom  FROM sports s LEFT JOIN abonnements a ON s.id = a.id_sport LEFT JOIN personnes p ON p.id = a.id_personne WHERE p.id = :idPersonne", nativeQuery = true)
    public List<Sport> findListSportByIdPersonne(@Param("idPersonne") Integer idPersonne);
}
