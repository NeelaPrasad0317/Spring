package com.nnp.car;

import com.nnp.Tyre.Tyre;

public class SportsCar implements Car {
	private Tyre tyre;

	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar::1-param constructor");
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("sports car having " + tyre.RoadGrip());
		
	}

}
