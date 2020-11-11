package com.nnp.comp;

public final class DieselEngine implements Engine {
	public DieselEngine() {
		System.out.println("DieselEngine::0-param constructor");
}


	@Override
	public String start() {
		System.out.println("DieselEngine.start()");
		return "Diesel Engine started & good to go....";
	}

}
