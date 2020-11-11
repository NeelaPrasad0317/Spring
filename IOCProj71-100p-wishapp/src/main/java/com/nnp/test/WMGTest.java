package com.nnp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nnp.beans.WishMessageGenerator;

public class WMGTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator wmg=null;
		
		ctx=new AnnotationConfigApplicationContext(com.nnp.config.AppConfig.class);
		wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg.getWishMesage("Neela prasad"));
		
		((AbstractApplicationContext) ctx).close();
		
	}
}
