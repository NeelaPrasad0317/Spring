package com.nnp.comps;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {
	private Set<Long> phnos;
	private Set<Date> dates;

	public ContactsInfo(Set<Long> phnos, Set<Date> dates) {
		super();
		this.phnos = phnos;
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactsInfo [phnos=" + phnos + ", dates=" + dates + "]";
	}

}
