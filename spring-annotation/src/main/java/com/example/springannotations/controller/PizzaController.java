package com.example.springannotations.controller;

import com.example.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Component("myPizzaController")
public class PizzaController {

    //@Autowired annotation is used to inject dependency using constructor injection,setter injection and field injection.

    //comment out the @Autowired annotation in case you want to perform constructor
    // or setter injection and uncomment constructor or setter injection part
    @Autowired
    private VegPizza vegPizza;

    //Uncomment this code to showcase Constructor Annotation
   /* @Autowired
    public PizzaController(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    //Uncomment this code to showcase Setter Annotation
    /*@Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    public String getPizza() {
        return "Hot Pizza !";
    }

    public String getVegPizza() {
        return vegPizza.getPizza();

    }
}
