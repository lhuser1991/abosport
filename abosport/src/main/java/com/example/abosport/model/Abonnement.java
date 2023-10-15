package com.example.abosport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "abonnements")
@IdClass(AbonnementId.class)
public class Abonnement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personne;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sport;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_personne", referencedColumnName = "id", insertable = false, updatable = false)
    private Personne personne;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_sport", referencedColumnName = "id", insertable = false, updatable = false)
    private Sport sport;

    public Abonnement() {
    }

    public Abonnement(int id_personne, int id_sport, Personne personne, Sport sport) {
        super();
        this.id_personne = id_personne;
        this.id_sport = id_sport;
        this.personne = personne;
        this.sport = sport;
    }

    public int getId_personne() {
        return this.id_personne;
    }

    public void setId_personne(int id_personne) {
        this.id_personne = id_personne;
    }

    public int getId_sport() {
        return this.id_sport;
    }

    public void setId_sport(int id_sport) {
        this.id_sport = id_sport;
    }

    public Personne getPersonne() {
        return this.personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Sport getSport() {
        return this.sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

}
