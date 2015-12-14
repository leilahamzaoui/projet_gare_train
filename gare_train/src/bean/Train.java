/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author maison
 */
public class Train {
    private int id;
    private int heure_depart;
    private int heure_arrive;
    private int date_depart;
    private int date_arrive;
    private String ville_depart;
    private String ville_arrivee;
    
    public Train() {
    }

    public Train(int id) {
        this.id = id;
    }

    public Train(int heure_depart, int heure_arrive, int date_depart, int date_arrive,String ville_depart,String ville_arrivee) {
        this.heure_depart = heure_depart;
        this.heure_arrive = heure_arrive;
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.ville_arrivee= ville_arrivee;
        this.ville_depart= ville_depart;
    }

    public Train(int id, int heure_depart, int heure_arrive, int date_depart, int date_arrive,String ville_depart,String ville_arrivee) {
        this.id = id;
        this.heure_depart = heure_depart;
        this.heure_arrive = heure_arrive;
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.ville_arrivee= ville_arrivee;
        this.ville_depart= ville_depart;
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

    @Override
    public String toString() {
        return "Train{" + "id=" + id + ", heure_depart=" + heure_depart + ", heure_arrive=" + heure_arrive + ", date_depart=" + date_depart + ", date_arrive=" + date_arrive + ", ville_depart=" + ville_depart + ", ville_arrivee=" + ville_arrivee + '}';
    }

    
    
}
