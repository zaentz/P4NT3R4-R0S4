package com.everis.alicante.courses.beca.garage.manager;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.garage.domain.MotorBike;

public class MotorBikeManager {

	private List<MotorBike> elements = new ArrayList<>();

	public List<MotorBike> list() {
		return elements;
	}

	public void save(final MotorBike element) {
		elements.add(element);
	}

	public void delete(final MotorBike element) {
		elements.remove(element);
	}

	public MotorBike get(final int i) {
		return elements.get(i);
	}

}
