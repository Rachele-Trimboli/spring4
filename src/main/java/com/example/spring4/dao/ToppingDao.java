package com.example.spring4.dao;

import com.example.spring4.entities.Drink;
import com.example.spring4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingDao extends JpaRepository<Topping, Long> {
}
