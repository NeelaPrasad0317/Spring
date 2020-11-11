package com.nnp.Factory;

import com.nnp.Tyre.ApolloTyre;
import com.nnp.Tyre.CEATTyre;
import com.nnp.Tyre.MRFTyre;
import com.nnp.Tyre.Tyre;
import com.nnp.car.BudgetCar;
import com.nnp.car.Car;
import com.nnp.car.LuxuryCar;
import com.nnp.car.SportsCar;

public class carFactory {
	public carFactory() {
		System.out.println("carFactory::0-param constructor");
	}

	public static Car getCar(String carType) {
		Tyre tyre = null;
		Car car = null;
		if (carType.equalsIgnoreCase("sportscar")) {
			tyre = new MRFTyre();
			car = new SportsCar(tyre);
		} else if (carType.equalsIgnoreCase("luxurycar")) {
			tyre = new CEATTyre();
			car = new LuxuryCar(tyre);
		} else if (carType.equalsIgnoreCase("budgetcar")) {
			tyre = new ApolloTyre();
			car = new BudgetCar(tyre);
		} else
			throw new IllegalArgumentException("Invalid car name");

		return car;
	}

}
