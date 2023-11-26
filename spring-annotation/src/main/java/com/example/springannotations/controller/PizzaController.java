package com.example.springannotations.controller;

import com.example.springannotations.service.Pizza;
import com.example.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myPizzaController")
public class PizzaController {

    //@Autowired annotation is used to inject dependency using constructor injection,setter injection and field injection.

    //comment out the @Autowired annotation in case you want to perform constructor
    // or setter injection and uncomment constructor or setter injection part

    private Pizza pizza;

    //@Qualifier annotation is used in conjuction with Autowired to avoid confusion when we have 2 or more beans configured for the same type.

    //Uncomment this code to showcase Constructor Annotation
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    //Uncomment this code to showcase Setter Annotation
    /*@Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    public String getPizza() {
        return pizza.getPizza();
    }

    /*public String getVegPizza() {
        return vegPizza.getPizza();

    }*/
}
