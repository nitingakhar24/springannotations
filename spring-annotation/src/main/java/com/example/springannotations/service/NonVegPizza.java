package com.example.springannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Non Veg Pizza";
    }
}
