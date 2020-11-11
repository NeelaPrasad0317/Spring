package com.nnp.comps;

import java.util.Properties;

public class FruitsInfo {
	private Properties colors;

	public FruitsInfo(Properties colors) {
		super();
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "FruitsInfo [colors=" + colors + "]";
	}

}
