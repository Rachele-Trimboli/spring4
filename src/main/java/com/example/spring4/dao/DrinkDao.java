package com.example.spring4.dao;

import com.example.spring4.entities.Drink;
import com.example.spring4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkDao extends JpaRepository<Drink, Long> {
}
