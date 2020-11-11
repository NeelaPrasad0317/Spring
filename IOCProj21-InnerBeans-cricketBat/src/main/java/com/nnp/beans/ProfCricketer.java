package com.nnp.beans;

public class ProfCricketer {
	private ProfBat bat;
	private String name;


	public ProfCricketer(ProfBat bat, String name) {
		super();
		this.bat = bat;
		this.name = name;
	}


	public String batting() {
		return name+" has scored "+bat.scoreRuns()+" runs";
	}
}
