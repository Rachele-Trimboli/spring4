package com.example.spring4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "drink")
@Getter
@Setter
@ToString
public class Drink extends Item {

    @Id
    @GeneratedValue
    private long id;


    private String name;



    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }


}
