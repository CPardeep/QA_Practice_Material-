package com.qa.vehicles;

import java.util.List;

public class Car extends Vehicle{
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", model=" + model + super.toString() +"]";
	}

	private int doors;
	private String model;
	
	public Car(String brand, String colour, int doors, String model) {
		super(brand, colour);
		this.doors = doors;
		this.model = model;
		this.type = "Car";
	}
	
	@Override
	public double cost() {
		return this.getId()+25;
	}

	public int getDoors() {
		return doors;
	}

	public String getModel() {
		return model;
	}


}
