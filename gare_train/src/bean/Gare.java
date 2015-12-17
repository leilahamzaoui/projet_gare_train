/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author maison
 */
public class Gare {
    private int id;
    private String nom_gare;
    private String adresse;
    private String ville;
    private List<Train> trains;

    public Gare() {
    }

    public Gare(int id) {
        this.id = id;
    }

    public Gare(String nom_gare, String adresse, String ville, List<Train> trains) {
        this.nom_gare = nom_gare;
        this.adresse = adresse;
        this.ville = ville;
        this.trains = trains;
    }

    public Gare(int id, String nom_gare, String adresse, String ville, List<Train> trains) {
        this.id = id;
        this.nom_gare = nom_gare;
        this.adresse = adresse;
        this.ville = ville;
        this.trains = trains;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_gare() {
        return nom_gare;
    }

    public void setNom_gare(String nom_gare) {
        this.nom_gare = nom_gare;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
     public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    @Override
    public String toString() {
        return "Gare{" + "id=" + id + ", nom_gare=" + nom_gare + ", adresse=" + adresse + ", ville=" + ville + '}';
    }
    
}
