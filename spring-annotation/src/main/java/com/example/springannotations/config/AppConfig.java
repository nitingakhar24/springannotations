package com.example.springannotations.config;

import com.example.springannotations.controller.PizzaController;
import com.example.springannotations.service.NonVegPizza;
import com.example.springannotations.service.Pizza;
import com.example.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="vegPizzaBean")
    public Pizza getVegPizza() {
            return new VegPizza();
    }
    
    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }
}
