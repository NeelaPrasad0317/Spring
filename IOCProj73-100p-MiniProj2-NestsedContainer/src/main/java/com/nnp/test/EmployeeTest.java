package com.nnp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nnp.controller.MainController;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		MainController mc = null;

		// get application context container
		ctx = new ClassPathXmlApplicationContext("com/nnp/cfgs/applicationContext.xml");

		// get main controller
		mc = ctx.getBean("controller", MainController.class);
		// call b.method\
		try {
			mc.processEmployee().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close ctx
		((AbstractApplicationContext) ctx).close();
	}
}
