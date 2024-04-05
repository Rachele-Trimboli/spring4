package com.example.spring4.entities;



public class Tavolo {

    private int id;
    private int maxCoperti;

    private Stato stato;

    public Tavolo(int id, int maxCoperti, Stato stato) {
        this.id = id;
        this.maxCoperti = maxCoperti;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "id=" + id +
                ", maxCoperti=" + maxCoperti +
                ", stato=" + stato +
                '}';
    }
}
