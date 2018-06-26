package com.everis.alicante.courses.beca.garage.domain;

public class Car {

	private String plate, color, model;
	private Integer numWheels;

	public Car(String plate, String color, String model) {
		this.plate = plate;
		this.color = color;
		this.model = model;
		this.numWheels = 4;
	}
	
	
}
