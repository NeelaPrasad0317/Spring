package com.nnp.comp;

import java.util.Arrays;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

@Named("fpkt")
public class Flipkart {
	
	@Inject
	@Named(value = "couri")
	private Courier co; // Rule1:prefer composition over inheritance

	
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
