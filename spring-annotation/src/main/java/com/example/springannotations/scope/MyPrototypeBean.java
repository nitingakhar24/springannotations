package com.example.springannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class MyPrototypeBean {
    public MyPrototypeBean() {
        System.out.println("My Prototype Bean...");
    }
}
