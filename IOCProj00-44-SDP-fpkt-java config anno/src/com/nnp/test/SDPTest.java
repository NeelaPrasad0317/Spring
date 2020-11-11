package com.nnp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nnp.comp.Flipkart;

public class SDPTest {
	public static void main(String[] args) {
		Flipkart fpkt = null;
		String status = null;
		ApplicationContext ctx=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nnp/cfgs/applicationContext.xml");
		// get flipkart instance
		fpkt=ctx.getBean("fpkt", Flipkart.class);
	
		// call shopping method
		status = fpkt.Shopping(new String[] { "raincote", "umbrella", "tablets" }, new float[] { 1200, 500, 200 });
		// display status
		System.out.println(status);
		((AbstractApplicationContext) ctx).close();
	}
}
