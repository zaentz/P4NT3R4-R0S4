package com.everis.alicante.courses.beca.garage.manager;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.garage.domain.Car;

public class CarManager {

	private static CarManager instance;

	private CarManager() {
	}

	public static CarManager getInstance() {
		if (instance == null) {
			instance = new CarManager();
		}
		return instance;
	}

	private List<Car> elements = new ArrayList<>();

	public List<Car> list() {
		return elements;
	}

	public void save(final Car element) {
		elements.add(element);
	}

	public void delete(final Car element) {
		elements.remove(element);
	}

	public Car get(final int i) {
		return elements.get(i);
	}

}
