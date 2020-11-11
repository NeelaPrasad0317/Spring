package com.nnp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nnp.beans.WishMessageGenerator;

public class ConstructorInjectiionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator wmg = null;
		//locate and hold spring bean cnfg file
		res = new FileSystemResource("applicationContext.xml");
//		res=new ClassPathResource("applicationContext.xml");
		//create container
		factory=new XmlBeanFactory(res);
		//get the bean object
		wmg=(WishMessageGenerator)factory.getBean("wmg");
		//call wmg
		System.out.println(wmg.getWishMessage());
		
	}

}























