package com.everis.alicante.courses.beca.garage.manager;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.garage.domain.Bicycle;
import com.everis.alicante.courses.beca.garage.domain.Vehicle;

public abstract class AbstractVehicleManager <T extends Vehicle>{

	
	private List<T> elements = new ArrayList<>();

	public List<T> list() {
		return elements;
	}

	public void save(final T element) {
		elements.add(element);
	}

	public void delete(final T element) {
		elements.remove(element);
	}

	public T get(final int i) {
		return elements.get(i);
	}

	public List<T> getElements() {
		return elements;
	}
	
	
}
