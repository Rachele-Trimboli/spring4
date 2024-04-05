package com.example.spring4.entities;

import com.example.spring4.dao.DrinkService;
import com.example.spring4.dao.PizzaService;
import com.example.spring4.dao.ToppingService;
import com.example.spring4.exception.ItemNotFoundException;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PizzaRunner implements CommandLineRunner {
    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------SALVATAGGIO PIZZE NEL DATABASE--------");
        System.out.println();

         AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);


        // Pizza pizza1 = (Pizza) ctx.getBean("pizza_margherita");
        //Pizza pizza2 = (Pizza) pizzaService.findByName("Hawaiian Pizza");
        //Pizza pizza3 = (Pizza) pizzaService.findByName("Salami Pizza");


        // pizzaService.savePizza(pizza2);
        // pizzaService.savePizza(pizza3);

        System.out.println("--------------SALVATAGGIO DRINK----------------");
        Drink drink1 = (Drink) ctx.getBean("lemonade");
        Drink drink2 = (Drink) ctx.getBean("water");
        Drink drink3 = (Drink) ctx.getBean("wine");

        drinkService.saveDrink(drink1);
        drinkService.saveDrink(drink2);
        drinkService.saveDrink(drink3);


        System.out.println("--------------SALVATAGGIO TOPPING---------------");

        Topping topping1 = (Topping) ctx.getBean("toppings_tomato");
        Topping topping2 = (Topping) ctx.getBean("toppings_cheese");
        Topping topping3 = (Topping) ctx.getBean("toppings_ham");

        toppingService.saveTopping(topping1);
        toppingService.saveTopping(topping2);
        toppingService.saveTopping(topping3);



    }
}
