package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyController;

//import com.example.demo.MyController;

@SpringBootApplication
public class ContextProjectApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(ContextProjectApplication.class, args);
	
	 MyController controller = (MyController) ctx.getBean("myController");
	 controller.hello();
	}

}
