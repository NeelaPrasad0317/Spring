package com.nnp.comps;

import java.util.Arrays;

public class MarksInfo {
	private int[] marks;

	public MarksInfo(int[] marks) {
		super();
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + "]";
	}
	
	
}
