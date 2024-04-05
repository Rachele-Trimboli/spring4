package com.example.spring4.dao;

import com.example.spring4.entities.Drink;
import com.example.spring4.entities.Pizza;
import com.example.spring4.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PizzaService {

    @Autowired
    private PizzaDao pizzaDao;


    public void savePizza(Pizza pizza){
        pizzaDao.save(pizza);
        System.out.println("Pizza salvata correttamente");
        System.out.println(pizza);
    }

    public List<Pizza> findAll(){
        return pizzaDao.findAll();
    }

    public Pizza findById(long pizzaId){
        return pizzaDao.findById(pizzaId).orElseThrow(() -> new ItemNotFoundException(pizzaId));
    }

    public void findByIdAndDelete(long pizzaId){
        Pizza found = this.findById(pizzaId);
        pizzaDao.delete(found);
        log.info("Il drink con l'id " + pizzaId + " è stato cancellato correttamente!");
    }
}
