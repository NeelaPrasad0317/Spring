package com.nnp.bo;

public class PlayerBO {
	private String name;
	private String team;
	private int matches;
	private float batAvg;
	private float bowlAvg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public float getBatAvg() {
		return batAvg;
	}

	public void setBatAvg(float batAvg) {
		this.batAvg = batAvg;
	}

	public float getBowlAvg() {
		return bowlAvg;
	}

	public void setBowlAvg(float bowlAvg) {
		this.bowlAvg = bowlAvg;
	}

}
