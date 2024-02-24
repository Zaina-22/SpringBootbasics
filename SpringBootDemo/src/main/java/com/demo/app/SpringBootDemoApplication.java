package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//runs the spring ioc container and run command returns application context object
		//basically getting the container access
		ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		//alien obj = new alien();

		alien obj=context.getBean(alien.class);
		obj.code();


//		alien obj1=context.getBean(alien.class);
//		obj1.code();

		//ques obj and obj1 different beans in spring container or same ?
		// what if alien is dependent on other object - use autowire dependency

		//getting the laptop bean through the container access directly
//		Laptop lap=context.getBean(Laptop.class);
//		lap.compile();
;	}

}
