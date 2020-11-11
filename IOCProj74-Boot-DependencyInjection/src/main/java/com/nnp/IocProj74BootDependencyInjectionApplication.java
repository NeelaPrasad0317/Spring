package com.nnp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nnp.beans.WishMessageGenerator;

@SpringBootApplication
public class IocProj74BootDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator wmg=null;
		
		ctx=SpringApplication.run(IocProj74BootDependencyInjectionApplication.class, args);
		wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(wmg.getWishMesage("Prasad"));
		
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
