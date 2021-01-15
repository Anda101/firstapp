package com.zen.firstbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbappApplication.class, args);

		ApplicationContext context = SpringApplication.run(FirstbappApplication.class, args);

		GreetingService gs = context.getBean("greetingService", GreetingService.class);
		gs.greet();
	}

}
