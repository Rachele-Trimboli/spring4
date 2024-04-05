package com.example.spring4.dao;

import com.example.spring4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaDao extends JpaRepository<Pizza, Long> {
}
