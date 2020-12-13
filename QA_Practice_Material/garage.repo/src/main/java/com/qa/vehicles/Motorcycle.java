package com.qa.vehicles;

public class Motorcycle extends Vehicle {
	@Override
	public String toString() {
		return "Motorcycle [engineSize=" + engineSize + super.toString() + "]";
	}

	private int engineSize;

	public Motorcycle(String brand, String colour, int engineSize) {
		super(brand, colour);
		this.engineSize = engineSize;
		this.type = "Motorcycle";
	}

	@Override
	public double cost() {
		return this.getId() + 25;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

}