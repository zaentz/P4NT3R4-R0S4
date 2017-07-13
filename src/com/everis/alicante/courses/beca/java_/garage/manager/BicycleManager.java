package com.everis.alicante.courses.beca.java_.garage.manager;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.java_.garage.domain.Bicycle;

public class BicycleManager {

	private List<Bicycle> elements = new ArrayList<>();

	public List<Bicycle> list() {
		return elements;
	}

	public void save(final Bicycle element) {
		elements.add(element);
	}

	public void delete(final Bicycle element) {
		elements.remove(element);
	}

	public Bicycle get(final int i) {
		return elements.get(i);
	}
}
