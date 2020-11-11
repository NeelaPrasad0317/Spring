package com.nnp.factory;

import com.nnp.comp.BlueDart;
import com.nnp.comp.Courier;
import com.nnp.comp.DTDC;
import com.nnp.comp.Flipkart;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) {
		Flipkart fpkt = null;
		Courier co = null;

		// create flipkart based on given c.type
		if (courierType.equalsIgnoreCase("DTDC")) {
			co = new DTDC();
			fpkt = new Flipkart(co);
		} else if (courierType.equalsIgnoreCase("Bluedart")) {
			co = new BlueDart();
			fpkt = new Flipkart(co);
		} else {
			throw new IllegalArgumentException("Invalid courier type");
		}

		return fpkt;
	}
}


