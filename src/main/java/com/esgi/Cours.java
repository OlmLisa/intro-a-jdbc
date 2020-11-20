package com.esgi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Cours implements Serializable {

    private int id;
    private String libelle;
    private ArrayList<Objectif> objectifs;

    public Cours() {}

    public Cours(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
        this.objectifs = new ArrayList<Objectif>();
    }

    public ArrayList<Objectif> getObjectifs() {
        return objectifs;
    }

    public void addObjectifs(Objectif o) {
        this.objectifs.add(o);
    }
    public void setObjectifs(ArrayList<Objectif> objectifs) {
        this.objectifs = objectifs;
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

    public void afficher(){
        Arrays.toString(objectifs.toArray());
        System.out.println("Cours{" +
                "id=" + id +
                ", acteur=" + Arrays.toString(objectifs.toArray()) +
                ", libelle='" + libelle + '\'' +

                '}');
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", objectifs=" + objectifs +
                '}';
    }
}
