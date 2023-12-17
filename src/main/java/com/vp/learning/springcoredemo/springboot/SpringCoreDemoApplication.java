package com.vp.learning.springcoredemo.springboot;

import com.vp.learning.springcoredemo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vp.learning.springcoredemo")
public class SpringCoreDemoApplication {

	public static void main(String[] args) {

	ApplicationContext ctx= SpringApplication.run(SpringCoreDemoApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}

}
