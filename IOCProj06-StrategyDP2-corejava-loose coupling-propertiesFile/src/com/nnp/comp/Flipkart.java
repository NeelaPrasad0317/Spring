package com.nnp.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier co = null; // Rule1:prefer composition over inheritance

	public Flipkart(Courier co) { // Rule2:code to interfaces/abstract classes
		System.out.println("Flipkart::1-param constructor");
		this.co = co;
	}

	public String Shopping(String[] items, float[] prices) {
		float amt = 0.0f;
		int oid = 0;
		// generate random oid
		oid = new Random().nextInt(10000);
		// add all prices
		for (float f : prices) {
			amt += f;
		}
		// return status msg
		return Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " are purchased and total bill is:"
				+ amt + " & " + co.deliver(oid);
	}
}
