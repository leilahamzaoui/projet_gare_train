/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author sony
 */
public class Train {
    private int id;
    private int heure_depart;
    private int heure_arrive;
    private int date_depart;
    private int date_arrive;
    private String ville_depart;
    private String ville_arrivee;
    private Gare gare_Depart;
    private Gare gare_Arrivee;
    private List<Gare> gares_Arret;
    
    public Train() {
    }

    public Train(int id) {
        this.id = id;
    }

    public Train(int id, int heure_depart, int heure_arrive, int date_depart, int date_arrive, String ville_depart, String ville_arrivee, Gare gare_Depart, Gare gare_Arrivee, List<Gare> gares_Arret) {
        this.id = id;
        this.heure_depart = heure_depart;
        this.heure_arrive = heure_arrive;
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
        this.gare_Depart = gare_Depart;
        this.gare_Arrivee = gare_Arrivee;
        this.gares_Arret = gares_Arret;
    }

    public Train(int heure_depart, int heure_arrive, int date_depart, int date_arrive, String ville_depart, String ville_arrivee, Gare gare_Depart, Gare gare_Arrivee, List<Gare> gares_Arret) {
        this.heure_depart = heure_depart;
        this.heure_arrive = heure_arrive;
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
        this.gare_Depart = gare_Depart;
        this.gare_Arrivee = gare_Arrivee;
        this.gares_Arret = gares_Arret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(int heure_depart) {
        this.heure_depart = heure_depart;
    }

    public int getHeure_arrive() {
        return heure_arrive;
    }

    public void setHeure_arrive(int heure_arrive) {
        this.heure_arrive = heure_arrive;
    }

    public int getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(int date_depart) {
        this.date_depart = date_depart;
    }

    public int getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(int date_arrive) {
        this.date_arrive = date_arrive;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public String getVille_arrivee() {
        return ville_arrivee;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public Gare getGare_Depart() {
        return gare_Depart;
    }

    public void setGare_Depart(Gare gare_Depart) {
        this.gare_Depart = gare_Depart;
    }

    public Gare getGare_Arrivee() {
        return gare_Arrivee;
    }

    public void setGare_Arrivee(Gare gare_Arrivee) {
        this.gare_Arrivee = gare_Arrivee;
    }

    public List<Gare> getGares_Arret() {
        return gares_Arret;
    }

    public void setGares_Arret(List<Gare> gares_Arret) {
        this.gares_Arret = gares_Arret;
    }

    @Override
    public String toString() {
        return "Train{" + "id=" + id + ", heure_depart=" + heure_depart + ", heure_arrive=" + heure_arrive + ", date_depart=" + date_depart + ", date_arrive=" + date_arrive + ", ville_depart=" + ville_depart + ", ville_arrivee=" + ville_arrivee + '}';
    }

    
    
}
