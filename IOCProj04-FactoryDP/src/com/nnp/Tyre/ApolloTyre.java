package com.nnp.Tyre;

public class ApolloTyre implements Tyre {
	public ApolloTyre() {
		System.out.println("ApolloTyre:: 0-param constructor");
	}
	@Override
	public String RoadGrip() {
		return "Apollo tyre:;standard road grip-->suitable for any transpotation";
	}

}
