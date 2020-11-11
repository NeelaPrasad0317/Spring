package com.nnp.comp;

import javax.inject.Named;

import org.springframework.context.annotation.Lazy;

@Named("fFlight")
@Lazy
public final class FirstFlight implements Courier { // Rule3:must be closed for modification
	public FirstFlight() {
		System.out.println("FirstFlight::0-param Constructor");
	}
	@Override
	public String deliver(int oid) {
		return "FirstFlight will deliver orderNo:" + oid + " items to your home soon.";
	}
}
