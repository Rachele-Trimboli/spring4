package com.example.spring4.entities;

import jakarta.persistence.*;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "topping")
@Getter
@Setter
@ToString

public class Topping extends Item {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }


}
