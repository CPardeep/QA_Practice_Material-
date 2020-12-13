package com.qa.controllers;
import java.util.List;
import com.qa.vehicles.Vehicle;

public interface GarageController<T extends Vehicle> {
	
	T create();
	
	T read();
	
	List<T> readAll();
	
	T update();
	
	boolean delete();
	
}
