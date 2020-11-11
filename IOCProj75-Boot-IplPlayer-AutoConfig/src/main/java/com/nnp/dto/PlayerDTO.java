package com.nnp.dto;

public class PlayerDTO {
	private String name;
	private String team;
	private int matches;
	private int innings;
	private int runsscored;
	private int wickets;
	private int runsCon;

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

	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}

	public int getRunsscored() {
		return runsscored;
	}

	public void setRunsscored(int runsscored) {
		this.runsscored = runsscored;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getRunsCon() {
		return runsCon;
	}

	public void setRunsCon(int runsCon) {
		this.runsCon = runsCon;
	}
}
