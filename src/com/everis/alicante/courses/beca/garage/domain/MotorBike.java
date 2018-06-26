package com.everis.alicante.courses.beca.garage.domain;

public class MotorBike {

	private String plate, color, model;
	private Integer numWheels;

	public MotorBike(String plate, String color, String model) {
		this.plate = plate;
		this.color = color;
		this.model = model;
		this.numWheels = 2;
	}

}
