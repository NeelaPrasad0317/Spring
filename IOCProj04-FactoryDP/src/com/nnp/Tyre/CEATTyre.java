package com.nnp.Tyre;

public class CEATTyre implements Tyre {
	public CEATTyre() {
		System.out.println("CEATTyre: 0-param constructor");
	}
	@Override
	public String RoadGrip() {
		return "CEAT tyre::Smooth road grip--->suitable for luxury comfort";
	}

}
