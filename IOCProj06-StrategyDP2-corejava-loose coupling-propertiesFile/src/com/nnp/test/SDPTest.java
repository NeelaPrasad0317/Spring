package com.nnp.test;

import com.nnp.comp.Flipkart;
import com.nnp.factory.FlipkartFactory;

public class SDPTest {
	public static void main(String[] args) {
		Flipkart fpkt = null;
		String status = null;
		// get flipkart instance
		try {
			fpkt = FlipkartFactory.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in dependency management");
		}
		// call shopping method
		status = fpkt.Shopping(new String[] { "raincote", "umbrella", "tablets" }, new float[] { 1200, 500, 200 });
		// display status
		System.out.println(status);
	}
}
