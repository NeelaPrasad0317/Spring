package com.nnp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nnp.beans.WishMessageGenerator;

public class test {
	public static void main(String[] args) {
		Resource res=null;
		res=new FileSystemResource("src/com/nnp/cfgs/applicationcontext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object obj = factory.getBean("wmg");
		
		WishMessageGenerator wmg=(WishMessageGenerator)obj;
		String result=wmg.getWishMessage("NNP");
		System.out.println(result);
	}
}