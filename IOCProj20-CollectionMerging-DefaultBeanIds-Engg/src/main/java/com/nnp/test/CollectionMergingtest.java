package com.nnp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nnp.comps.EnggCourses;

public class CollectionMergingtest {
	public static void main(String[] args) {
		DefaultListableBeanFactory fac = null;
		XmlBeanDefinitionReader reader = null;

		fac = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(fac);

		reader.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");

		/*EnggCourses mech=fac.getBean("mech", EnggCourses.class);
		System.out.println(mech);
		
		System.out.println("===================");
		EnggCourses basic=fac.getBean("1stYear",EnggCourses.class);
		System.out.println(basic);*/

		EnggCourses mech = fac.getBean("com.nnp.comps.EnggCourses", EnggCourses.class);
		System.out.println(mech);
		System.out.println("=========================");

		EnggCourses civil = fac.getBean("com.nnp.comps.EnggCourses#1", EnggCourses.class);
		System.out.println(civil);
		System.out.println("=========================");

		EnggCourses ece = fac.getBean("com.nnp.comps.EnggCourses#2", EnggCourses.class);
		System.out.println(ece);
		System.out.println("=========================");
		
		EnggCourses mech2 = fac.getBean("com.nnp.comps.EnggCourses#0", EnggCourses.class);
		System.out.println(mech2);
	}

}
