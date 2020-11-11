package com.nnp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nnp.beans.ProfBat;
import com.nnp.beans.ProfCricketer;

public class InnserBeanstest {
	public static void main(String[] args) {
		DefaultListableBeanFactory fac = null;
		XmlBeanDefinitionReader reader = null;

		fac = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(fac);

		reader.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");
		
		ProfCricketer ko=fac.getBean("kohli",ProfCricketer.class);
		System.out.println(ko.batting());
		
		System.out.println("==========================");
		ProfCricketer msd=fac.getBean("msd",ProfCricketer.class);
		System.out.println(msd.batting());
		
		ProfBat bat=fac.getBean("kohli#bat",ProfBat.class);
		System.out.println(bat.scoreRuns());
	}
}
