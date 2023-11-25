package com.example.springannotations;

import com.example.springannotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationApplication.class, args);
		PizzaController pizzaController = context.getBean(PizzaController.class);
		//PizzaController pizzaController2 = (PizzaController) context.getBean("pizzaController");
		//PizzaController pizzaController3 = (PizzaController) context.getBean("myPizzaController");
		System.out.println(pizzaController.getPizza());
		//System.out.println(pizzaController2.getPizza());
		//System.out.println(pizzaController3.getPizza());

		System.out.println(pizzaController.getVegPizza());

	}

}
