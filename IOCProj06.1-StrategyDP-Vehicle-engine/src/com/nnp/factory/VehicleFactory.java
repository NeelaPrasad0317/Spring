package com.nnp.factory;

import com.nnp.comp.DieselEngine;
import com.nnp.comp.Engine;
import com.nnp.comp.PetrolEngine;
import com.nnp.comp.Vehicle;

public class VehicleFactory {

	public static Vehicle getInstance(String engineType) {
		Vehicle v = null;
		Engine e = null;

		v = new Vehicle();
		if (engineType.equalsIgnoreCase("petrol")) {
			e = new PetrolEngine();
		} else if (engineType.equalsIgnoreCase("deisel")) {
			e = new DieselEngine();
		} else
			throw new IllegalArgumentException("Invalid endine type");

		v.setEn(e);

		return v;
	}

}
