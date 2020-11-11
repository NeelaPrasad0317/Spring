package com.nnp.comp;

public final class Vehicle {
	private Engine en = null;

	public Vehicle() {
		System.out.println("Vehicle::0-param constructor");

	}

	public void setEn(Engine en) {
		System.out.println("Vehicle.setEn()");
		this.en = en;
	}

	public void run() {
		System.out.println("Vehicle.run()");
		System.out.println("Vehicle ready to run::" + en.start());
	}
}

