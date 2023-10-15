package com.example.abosport.model;

import java.io.Serializable;

public class AbonnementId implements Serializable {
    
    private int id_personne;
    private int id_sport;

    public AbonnementId() {
    }

    public AbonnementId(int id_personne, int id_sport) {
        this.id_personne = id_personne;
        this.id_sport = id_sport;
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

}
