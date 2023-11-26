package com.example.springannotations.service;

public class VegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Veg Pizza";
    }
}
