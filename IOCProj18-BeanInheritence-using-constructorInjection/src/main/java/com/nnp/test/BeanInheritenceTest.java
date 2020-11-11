package com.nnp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nnp.comps.Car;

public class BeanInheritenceTest {
public static void main(String[] args) {
	DefaultListableBeanFactory fac=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(fac);
	reader.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");
	
	Car c1=fac.getBean("car1", Car.class);
	System.out.println(c1);
	System.out.println("================================");
	
	Car c2=fac.getBean("car2", Car.class);
	System.out.println(c2);
	System.out.println("================================");
	
	Car c=fac.getBean("car", Car.class);
	System.out.println(c);
}

}
