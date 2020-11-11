package com.nnp.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; // springbean property
	
	static {
		System.out.println("WishMessageGenerator::static");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::constructor");
	}

	// setter method to set dependent class to target class
	public void setDate(Date date) {
		this.date = date;
	}

	// b.logic using injected Date onj
	public String getWishMessage(String user) {
		int hour = 0;
		// get current hour of day
		hour = date.getHours();
		//generate msg acc to hour
		if(hour<12) {
			return "Good Morning "+user; 
		}else if(hour<4) {
			return "Good AfterNoon "+user; 
		}else if(hour<8) {
			return "Good Evening "+user; 
		}else
			return "Good Night "+user; 

	}
}
