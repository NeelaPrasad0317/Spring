package com.nnp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nnp.controller.MainController;

public class EmployeeTest1 {
	public static void main(String[] args) {
		ApplicationContext bctx = null,pctx=null;
		MainController mc = null;

		// get application context container for service tier
		bctx = new ClassPathXmlApplicationContext("com/nnp/cfgs/business-beans.xml");
		//get application context container for presentation tier
		pctx=new ClassPathXmlApplicationContext(new String[] {"com/nnp/cfgs/presentation-beans.xml"},bctx) ;
		// get main controller
		mc = pctx.getBean("controller", MainController.class);
		// call b.method\
		try {
			System.out.println("=======================================");
			mc.processEmployee().forEach(System.out::println);
			System.out.println("=======================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close ctx
		((AbstractApplicationContext) pctx).close();
		((AbstractApplicationContext) bctx).close();
	}
}
