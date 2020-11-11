package com.nnp.comp;

public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return "BlueDart will deliver orderNo:" + oid + " items to your home soon.";
	}
}
