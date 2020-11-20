package com.esgi;

import java.util.ArrayList;
import java.util.Arrays;

public class Coach {

    private String nom;
    private String prenom;
    private int codepostal;
    private  ArrayList<Cours> cours;

    public Coach() {}

    public Coach(String nom, String prenom, int codepostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.codepostal = codepostal;
        this.cours = new ArrayList<Cours>();
    }

    public ArrayList<Cours> getCours() {
        return cours;
    }

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afficher(){
        Arrays.toString(cours.toArray());
        System.out.println("Coach{" +
                "nom=" + nom +", " +
                "prenom='" + prenom +", "+
                "cours=" + Arrays.toString(cours.toArray())  +", "+
                "code postal ='" +codepostal+ '\'' +
                '}');
    }

    public void addCours(Cours c) {
        this.cours.add(c);
    }

}
