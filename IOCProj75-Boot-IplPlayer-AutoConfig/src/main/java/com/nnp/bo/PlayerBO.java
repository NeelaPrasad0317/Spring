package com.nnp.bo;

public class PlayerBO {
	private String name;
	private String team;
	private Integer matches;
	private Double batAvg;
	private Double bowlAvg;

	
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


	public Integer getMatches() {
		return matches;
	}


	public void setMatches(Integer matches) {
		this.matches = matches;
	}


	public Double getBatAvg() {
		return batAvg;
	}


	public void setBatAvg(Double batAvg) {
		this.batAvg = batAvg;
	}


	public Double getBowlAvg() {
		return bowlAvg;
	}


	public void setBowlAvg(Double bowlAvg) {
		this.bowlAvg = bowlAvg;
	}


	@Override
	public String toString() {
		return "PlayerBO [name=" + name + ", team=" + team + ", matches=" + matches + ", batAvg=" + batAvg
				+ ", bowlAvg=" + bowlAvg + "]";
	}
	

}
