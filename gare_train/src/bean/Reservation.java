/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;

/**
 *
 * @author maison
 */
public class Reservation {
    private int id;
    private int date_reservation;
    private String destination;
    private boolean confirme;
    private Client client;
    private Train train;
    public Reservation() {
    }

    public Reservation(int id) {
        this.id = id;
    }

    public Reservation(int date_reservation, String destination, boolean confirme, Client client,Train train) {
        this.date_reservation = date_reservation;
        this.destination = destination;
        this.confirme = confirme;
        this.client = client;
        this.train = train;
    }

    public Reservation(int id, int date_reservation, String destination, boolean confirme, Client client,Train train) {
        this.id = id;
        this.date_reservation = date_reservation;
        this.destination = destination;
        this.confirme = confirme;
        this.client = client;
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(int date_reservation) {
        this.date_reservation = date_reservation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", date_reservation=" + date_reservation + ", destination=" + destination + ", confirme=" + confirme + '}';
    }
   
    
    
    
}
