package com.esgi;

import java.util.ArrayList;

public class Objectif {

    private int id;
    private String libelle;

    public Objectif() {}

    public Objectif(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Objectif{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
