package com.nnp.comps;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MarksInfo marks=null;
		
		//create bean factory
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//read cfgs file
		reader.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");
		
		//marks
		marks=factory.getBean("marks", MarksInfo.class);
		System.out.println(marks);
		
		//college
		College clg=factory.getBean("clg", College.class);
		System.out.println(clg);
		
		//contactsinfo
		ContactsInfo cinfo=factory.getBean("cinfo", ContactsInfo.class);
		System.out.println(cinfo);
		
		//UniversityInfo
		UniversityInfo uinfo=factory.getBean("uinfo", UniversityInfo.class);
		System.out.println(uinfo);
		
		//UniversityInfo
		FruitsInfo finfo=factory.getBean("fruits", FruitsInfo.class);
		System.out.println(finfo);
		
	}
}
