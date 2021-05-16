package com.example.demo.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {
	
	@Override

	public void start() {
		System.out.print("carro iniciou");
	}
	
	@Override
	public void stop() {
		System.out.print("carro parrou");
		
	}

}
