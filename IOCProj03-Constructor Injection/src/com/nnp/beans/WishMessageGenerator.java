package com.nnp.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; // springbean property
	private String name;

	static {
		System.out.println("WMG::static");
	}

	public WishMessageGenerator() {
		System.out.println("WMG::0- param constructor");
	}

	public WishMessageGenerator(Date date) {
		super();
		System.out.println("WMG::1-param  Constructor");
		this.date = date;
//		this.name=""+n;
	}

	// setter method to set dependent class to target class
	public void setDate(Date date) {
		System.out.println("WMG::Setter");
		this.date = date;
	}

	// b.logic using injected Date onj
	public String getWishMessage() {
		int hour = 0;
		// get current hour of day
		hour = date.getHours();
		// generate msg acc to hour
		System.out.println(date);
		if (hour < 12) {
			return "Good Morning " + name;
		} else if (hour < 4) {
			return "Good AfterNoon " + name;
		} else if (hour < 8) {
			return "Good Evening " + name;
		} else
			return "Good Night " + name;

	}
}
