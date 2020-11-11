package com.nnp.Tyre;

public class MRFTyre implements Tyre {
	public MRFTyre() {
		System.out.println("MRFTyre:0-param constructor");
	}

	@Override
	public String RoadGrip() {
		return "MRF tyre::super road grip--->suitable for sports";
	}

}
