package com.nnp.comps;

import java.util.Date;
import java.util.Map;

public class UniversityInfo {
	private Map<Integer, String> faculty;
	private Map<String, Date> dates;

	public UniversityInfo(Map<Integer, String> faculty, Map<String, Date> dates) {
		super();
		this.faculty = faculty;
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "UniversityInfo [faculty=" + faculty + ", dates=" + dates + "]";
	}

}
