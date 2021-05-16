package com.example.demo.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.print("bicicleta começou");
		
	}

	@Override
	public void stop() {
		System.out.print("bicicleta parou");
		
	}
	
	

}
