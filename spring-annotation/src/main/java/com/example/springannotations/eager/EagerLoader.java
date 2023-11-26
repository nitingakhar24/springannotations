package com.example.springannotations.eager;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public EagerLoader() {
        System.out.println("Eager Loaded Class");
    }
}
