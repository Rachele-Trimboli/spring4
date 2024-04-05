package com.example.spring4.entities;

import java.util.List;

public class Ordine {


    private int tavoloId;
    private int id;

    private StatoOrdine stato;
    private List<Item> itemOrdinati;
    private int coperti;
    private String orario;
    private double conto;

    public Ordine(int id,int tavoloId, StatoOrdine stato, List<Item> itemOrdinati, int coperti, String orario) {
        this.id = id;
        this.tavoloId = tavoloId;
        this.stato = stato;
        this.itemOrdinati = itemOrdinati;
        this.coperti = coperti;
        this.orario = orario;
        this.conto = setConto();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    public List<Item> getItemOrdinati() {
        return itemOrdinati;
    }

    public void setItemOrdinati(List<Item> itemOrdinati) {
        this.itemOrdinati = itemOrdinati;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public double getConto() {
        return conto;
    }

    public double setConto() {
        double costo = 0;
        for (int i =0; i<itemOrdinati.size();i++){
            costo += itemOrdinati.get(i).getPrice();
        }
        return costo;
    }

    public void printOrdine() {
        System.out.println("Numero ordine: " + id);
        System.out.println("Tavolo: " + tavoloId);
        System.out.println("Stato: " + stato);
        System.out.println("Numero coperti: " + coperti);
        System.out.println("Orario di acquisizione: " + orario);
        System.out.println("Importo totale: " + conto);
        System.out.println("Dettagli degli item ordinati:");
        for (Item item : itemOrdinati) {
            System.out.println(item);
        }
    }


}
