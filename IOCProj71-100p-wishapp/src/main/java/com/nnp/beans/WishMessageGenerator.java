package com.nnp.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalTime time;
	
	public String getWishMesage(String user) {
		int hour=time.getHour()+1;
		if(hour<12)
			return "GoodMorning "+user;
		else if(hour<16)
			return "GoodAfternoon "+user;
		else if(hour<20)
			return "GoodEvening "+user;
		else
			return "GoodNight "+user;
	}

}
