package com.sp.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sp.controller.MainController;
import com.sp.vo.CustomerVO;

@SuppressWarnings("deprecation")
public class RealTimeDITest {
	public static void main(String[] args) {
		Scanner sc = null;
		CustomerVO vo = null;
		MainController mc = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;

		// get scanner
		sc = new Scanner(System.in);
		// create vo obj
		vo = new CustomerVO();

		/*System.out.print("Enter CustomerName::");
		vo.setName(sc.nextLine());
		System.out.print("Enter CustomerAddr::");
		vo.setAdd(sc.nextLine());
		System.out.print("Enter PrincipleAmount::");
		vo.setPamt(sc.nextLine());
		System.out.print("Enter Rate of Interest::");
		vo.setRate(sc.nextLine());
		System.out.print("Enter Time::");
		vo.setTime(sc.nextLine());
		*/
		vo.setName("NNp");
		vo.setAdd("ctg");
		vo.setPamt("50000");
		vo.setRate("5");
		vo.setTime("12");

		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sp/cfgs/applicationContext.xml");
		// get spring bean
		mc = factory.getBean("controller", MainController.class);
		try {
			String msg = mc.processCustomer(vo);
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println("Internal Error");
			e.printStackTrace();
		}
	}

}
