package com.nnp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nnp.beans.Cricket;

public class LookUpTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory fac = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(fac);
		read.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");
		
		Cricket ckt=fac.getBean("ckt",Cricket.class);
		
		ckt.batting();
		System.out.println("======================");
		ckt.bowling();
		System.out.println("======================");
		ckt.keeping();
		System.out.println("======================");
	}
}
