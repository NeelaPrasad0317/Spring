package com.nnp.comps;

import java.util.Date;
import java.util.List;

public class College {

	private List<String> names;
	private List<Date> dates;

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "College [names=" + names + ", dates=" + dates + "]";
	}

}
