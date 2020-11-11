package com.nnp.comp;

import javax.inject.Named;

import org.springframework.context.annotation.Lazy;

@Named("DTDC")
@Lazy
public final class DTDC implements Courier { // Rule3:must be closed for modification
	public DTDC() {
		System.out.println("DTDC::0-param Constructor");
	}
	@Override
	public String deliver(int oid) {
		return "DTDC will deliver orderN	o:" + oid + " items to your home soon.";
	}
}
