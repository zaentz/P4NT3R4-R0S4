package com.everis.alicante.courses.beca.garage.manager;

import java.util.List;

import com.everis.alicante.courses.beca.garage.domain.Bicycle;

public abstract class AbstractVehicleManager <T>{

	
	private List<T> elements;

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
}
