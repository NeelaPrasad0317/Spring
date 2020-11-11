package com.nnp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.nnp.service.EmployeeMgmtService;
import com.nnp.service.IEmployeeMgmtService;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		IEmployeeMgmtService service = null;

		ctx = new ClassPathXmlApplicationContext("com/nnp/cfgs/applicationContext.xml");
		service = ctx.getBean("service", EmployeeMgmtService.class);
		
		try {
			System.out.println(service.fetchEmp(7900));
			System.out.println("=======================");
			service.fetchEmpByDesg("MANAGER", "CLERK", "ANALYST").forEach(System.out::println);
			System.out.println("========================");
			service.fetchEmpByDepts(30).forEach(System.out::println);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("No record Found");

		}

		((AbstractApplicationContext) ctx).close();
	}
}
