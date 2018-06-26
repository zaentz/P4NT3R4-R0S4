package com.everis.alicante.courses.beca.garage;

import java.util.Scanner;

import com.everis.alicante.courses.beca.garage.domain.Bicycle;
import com.everis.alicante.courses.beca.garage.domain.Car;
import com.everis.alicante.courses.beca.garage.domain.MotorBike;
import com.everis.alicante.courses.beca.garage.manager.BicycleManager;
import com.everis.alicante.courses.beca.garage.manager.CarManager;
import com.everis.alicante.courses.beca.garage.manager.MotorBikeManager;
import com.everis.alicante.courses.becajava.garage.ui.GarageMenu;

public class GarageRunner {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String option;

		final MotorBikeManager motorBikeManager = new MotorBikeManager();
		final BicycleManager bicycleManager = new BicycleManager();
		loadData(motorBikeManager, bicycleManager);

		do {
			option = GarageMenu.getInstance().play();
			switch (option) {
			case "1.1":
				System.out.println(CarManager.getInstance().list());
				break;
			case "1.2":
				CarManager.getInstance().save(carBuilder());
				break;
			case "1.3":
				CarManager.getInstance().delete(selectCar());
				break;
			case "2.1":
				System.out.println(motorBikeManager.list());
				break;
			case "3.1":
				System.out.println(bicycleManager.list());
				break;
			}
		} while (!option.equals("0"));

	}

	private static Car carBuilder() {
		System.out.println("Introduzca matr�cula");
		String matricula = in.nextLine();
		System.out.println("Introduzca color");
		String color = in.nextLine();
		System.out.println("Introduzca modelo");
		String modelo = in.nextLine();

		return new Car(matricula, color, modelo);
	}

	private static Car selectCar() {
		System.out.println(CarManager.getInstance().list());
		System.out.println("Selecciona un elemento de la lista");
		int elemento = in.nextInt();
		return CarManager.getInstance().get(elemento - 1);
	}

	private static MotorBike motorBikeBuilder() {
		System.out.println("Introduzca matr�cula");
		String matricula = in.nextLine();
		System.out.println("Introduzca color");
		String color = in.nextLine();
		System.out.println("Introduzca modelo");
		String modelo = in.nextLine();

		return new MotorBike(matricula, color, modelo);
	}

	private static void loadData(MotorBikeManager motorBikeManager, BicycleManager bicycleManager) {
		for (int i = 0; i < 10; i++) {
			CarManager.getInstance().save(new Car("matricula" + i, "color" + i, "modelo" + i));
			motorBikeManager.save(new MotorBike("matricula" + i, "color" + i, "modelo" + i));
			bicycleManager.save(new Bicycle("color" + i, "modelo" + i));
		}
	}

}
