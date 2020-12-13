package com.qa.controllers;

//Interface
import com.qa.vehicles.Vehicle;
//Importing relating classes
import com.qa.vehicles.Car;
import com.qa.dao.CarDAO;
//
import java.util.List;
import com.qa.utils.UserInput;

public class CarController implements GarageController {

	UserInput input = new UserInput();
	private CarDAO carDao;

	// Constructor which takes in an object of Car data access object which has been
	// assigned information.
	public CarController(CarDAO carDao) {
		this.carDao = carDao;
	}

	public Car create() {
		// Asks
		System.out.println("what is the brand?");
		String brand = input.getString();
		//
		System.out.println("what colour is it?");
		String colour = input.getString();
		//
		System.out.println("How many doors?");
		int doors = input.getInt();
		//
		System.out.println("what is the model?");
		String model = input.getString();
		//
		Car fredo = new Car(brand, colour, doors, model);
		//
		Car car = carDao.create(fredo);
		//
		System.out.println(car.toString());
		//
		return car;
	}

	public Car read() {
		System.out.println("What is the ID?");
		int id = input.getInt();
		Car car = carDao.read(id);
		return car;
	}

	public List<Car> readAll() {
		List<Car> cars = carDao.readAll();
		for (Car x : cars) {
			System.out.println(x.toString());
		}
		return cars;
	}

	public Car update() {
		System.out.println("what is the id of the car you want to delete?");
		int id = input.getInt();

		System.out.println("what is the brand?");
		String brand = input.getString();
		//
		System.out.println("what colour is it?");
		String colour = input.getString();
		//
		System.out.println("How many doors?");
		int doors = input.getInt();
		//
		System.out.println("what is the model?");
		String model = input.getString();
		//
		Car fredo = new Car(brand, colour, doors, model);

		if (carDao.delete(id)) {
			return carDao.create(fredo);
		} else {
			System.out.println("Failed");
			return null;
		}
	}

	public boolean delete() {
		System.out.println("what is the id of the car you want to delete?");
		int id = input.getInt();
		if (id != 0) {
			boolean answer = carDao.delete(id);
			return answer;

		} else {
			return false;
		}
	}

}
