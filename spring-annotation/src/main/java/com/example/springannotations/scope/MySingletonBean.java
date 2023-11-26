package com.example.springannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MySingletonBean {
    public MySingletonBean() {
        System.out.println("My Singleton Bean...");
    }
}
