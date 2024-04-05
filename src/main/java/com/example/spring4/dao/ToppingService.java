package com.example.spring4.dao;
import com.example.spring4.entities.Topping;
import com.example.spring4.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ToppingService {

    @Autowired
    private ToppingDao toppingDao;


    public void saveTopping(Topping topping) {
        toppingDao.save(topping);
        System.out.println("Pizza salvata correttamente");
        System.out.println(topping);
    }

    public List<Topping> findAll() {
        return toppingDao.findAll();
    }

    public Topping findById(long toppingId) {
        return toppingDao.findById(toppingId).orElseThrow(() -> new ItemNotFoundException(toppingId));
    }

    public void findByIdAndDelete(long toppingId) {
        Topping found = this.findById(toppingId);
        toppingDao.delete(found);
        log.info("Il drink con l'id " + toppingId + " è stato cancellato correttamente!");
    }
}
