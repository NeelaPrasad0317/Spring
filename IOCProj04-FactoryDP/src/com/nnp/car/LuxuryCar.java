package com.nnp.car;

import com.nnp.Tyre.Tyre;

public class LuxuryCar implements Car {
	private Tyre tyre;

	public LuxuryCar(Tyre tyre) {
		System.out.println("LuxuryCar::1-param constructor");
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("luxury car having " + tyre.RoadGrip());
		
	}

}
