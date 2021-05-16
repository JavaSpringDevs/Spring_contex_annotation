package com.example.demo.compenents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Vehicle;

@Component
public class VehiclesComponents {
	
	
	@Autowired
	@Qualifier("carBean")
	private Vehicle vehicles;
	
	public void service() {
		vehicles.start();
		vehicles.stop();
		
	}
	

}
