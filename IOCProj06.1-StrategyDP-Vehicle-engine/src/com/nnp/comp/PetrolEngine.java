package com.nnp.comp;

public final class PetrolEngine implements Engine {
public PetrolEngine() {
		System.out.println("PetrolEngine::0-param constructor");
}


	@Override
	public String start() {
		System.out.println("PetrolEngine.start()");
		return "Petrol Engine started & good to go....";
	}

}
