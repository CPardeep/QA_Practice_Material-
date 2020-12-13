package com.qa.vehicles;

public class Truck extends Vehicle {
	private String cabinType;
	
	public Truck(String brand, String colour, String cabinType) {
		super(brand, colour);
		this.cabinType = cabinType;
		this.type = "Truck";
	}
	@Override
	public String toString() {
		return "Truck [cabinType=" + cabinType + super.toString()+"]";
	}
	@Override
	public double cost() {
		return this.getId()+25;
	}

	public String getCabinType() {
		return cabinType;
	}

	public void setCabinType(String cabinType) {
		this.cabinType = cabinType;
	}
	
	
}