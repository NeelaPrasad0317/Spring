package com.nnp.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nnp.controller.MainController;

public class EmployeeTest2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext bctx = null,pctx=null;
		MainController mc = null;

		// get application context container for service tier
		bctx = new AnnotationConfigApplicationContext(com.nnp.config.BusinessAppConfig.class);
		//get application context container for presentation tier
		pctx=new AnnotationConfigApplicationContext();
		pctx.setParent(bctx);
		pctx.register(com.nnp.config.PresentationAppCofig.class);
		pctx.refresh();
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
