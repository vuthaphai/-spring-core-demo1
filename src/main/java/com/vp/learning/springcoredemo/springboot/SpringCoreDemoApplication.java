package com.vp.learning.springcoredemo.springboot;

import com.vp.learning.springcoredemo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("com.vp.learning.springcoredemo")
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringCoreDemoApplication {

	public static void main(String[] args) {

	ApplicationContext ctx= SpringApplication.run(SpringCoreDemoApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}

}
