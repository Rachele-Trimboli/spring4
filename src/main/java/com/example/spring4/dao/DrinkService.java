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
public class DrinkService {
    @Autowired
    private DrinkDao drinkDao;


    public void saveDrink(Drink drink){
        drinkDao.save(drink);
        System.out.println("Drink salvato correttamente");
        System.out.println(drink);
    }

    public List<Drink> findAll(){
        return drinkDao.findAll();
    }

    public Drink findById(long drinkId){
        return drinkDao.findById(drinkId).orElseThrow(() -> new ItemNotFoundException(drinkId));
    }

    public void findByIdAndDelete(long drinkId){
        Drink found = this.findById(drinkId);
        drinkDao.delete(found);
        log.info("Il drink con l'id " + drinkId + " è stato cancellato correttamente!");
    }
}
