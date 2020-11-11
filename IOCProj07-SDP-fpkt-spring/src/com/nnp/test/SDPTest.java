package com.nnp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nnp.comp.Flipkart;

public class SDPTest {
	public static void main(String[] args) {
		Flipkart fpkt = null;
		String status = null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");
		// get flipkart instance
		fpkt=factory.getBean("fpkt", Flipkart.class);
	
		// call shopping method
		status = fpkt.Shopping(new String[] { "raincote", "umbrella", "tablets" }, new float[] { 1200, 500, 200 });
		// display status
		System.out.println(status);
	}
}
