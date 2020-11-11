
package com.nnp.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nnp.comp.Courier;
import com.nnp.comp.Flipkart;

public class FlipkartFactory {
	private static Properties prop = null;
	static {
		try {
			InputStream is = new FileInputStream("src/com/nnp/commons/info.properties");
			prop = new Properties();
//			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Flipkart getInstance() throws Exception {
		Flipkart fpkt = null;
		Courier co = null;
		// get dependent class from prop file
		/*
		 * String className = prop.getProperty("sdp.dependent");
		 * Class c1 = Class.forName(className);
		 * Object obj = c1.newInstance();
		 * co = (Courier) obj;
		 */

		co = (Courier) Class.forName(prop.getProperty("sdp.dependent")).newInstance();
		fpkt = new Flipkart(co);

		return fpkt;
	}
}


