package com.example.springannotations.controller;

import org.springframework.stereotype.Component;

@Component
//@Component("myPizzaController")
public class PizzaController {
    public String getPizza() {
        return "Hot Pizza !";
    }
}
