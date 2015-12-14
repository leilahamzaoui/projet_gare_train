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
    private String id;
    private String nom_gare;
    private String adresse;
    List<Train> trains;

    public Gare() {
    }

    public Gare(String id) {
        this.id = id;
    }

    public Gare(String nom_gare, String adresse, List<Train> trains) {
        this.nom_gare = nom_gare;
        this.adresse = adresse;
        this.trains = trains;
    }

    public Gare(String id, String nom_gare, String adresse, List<Train> trains) {
        this.id = id;
        this.nom_gare = nom_gare;
        this.adresse = adresse;
        this.trains = trains;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gare other = (Gare) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gare{" + "id=" + id + ", nom_gare=" + nom_gare + ", adresse=" + adresse + '}';
    }
    
}
