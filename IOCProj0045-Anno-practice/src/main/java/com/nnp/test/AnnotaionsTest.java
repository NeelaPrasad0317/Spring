package com.nnp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nnp.beans.TargetClass;

public class AnnotaionsTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		TargetClass tc=null;
		ctx=new ClassPathXmlApplicationContext("com/nnp/cfgs/applicationContext.xml");
		
		tc=ctx.getBean("tc",TargetClass.class);
		
		((AbstractApplicationContext) ctx).close();
	}
}
