package com.everis.alicante.courses.beca.garage.domain;

public abstract class Vehicle {

	protected String plate;

	protected String color;

	protected String model;
	
	protected Integer numWheels;

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(Integer numWheels) {
		this.numWheels = numWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]";
	}

	
	
	
}
