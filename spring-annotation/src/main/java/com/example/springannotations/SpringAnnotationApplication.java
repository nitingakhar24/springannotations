package com.example.springannotations;

import com.example.springannotations.controller.PizzaController;
import com.example.springannotations.lazy.LazyLoader;
import com.example.springannotations.propertysource.PropertySourceDemo;
import com.example.springannotations.scope.MyPrototypeBean;
import com.example.springannotations.scope.MySingletonBean;
import com.example.springannotations.service.VegPizza;
import com.example.springannotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationApplication.class, args);

		MySingletonBean mySingletonBean1 = context.getBean(MySingletonBean.class);
		System.out.println(mySingletonBean1.hashCode());

		MySingletonBean mySingletonBean2 = context.getBean(MySingletonBean.class);
		System.out.println(mySingletonBean2.hashCode());


		MySingletonBean mySingletonBean3 = context.getBean(MySingletonBean.class);
		System.out.println(mySingletonBean3.hashCode());


		MyPrototypeBean myPrototypeBean1 = context.getBean(MyPrototypeBean.class);
		System.out.println(myPrototypeBean1.hashCode());


		MyPrototypeBean myPrototypeBean2 = context.getBean(MyPrototypeBean.class);
		System.out.println(myPrototypeBean2.hashCode());


		MyPrototypeBean myPrototypeBean3 = context.getBean(MyPrototypeBean.class);
		System.out.println(myPrototypeBean3.hashCode());


		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getHost());
		System.out.println(valueAnnotationDemo.getEmail());
		System.out.println(valueAnnotationDemo.getPassword());


		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDesc());



	}

}
