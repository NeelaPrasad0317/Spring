package com.nnp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.nnp.config.AppConfig;
import com.nnp.service.EmployeeMgmtService;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		EmployeeMgmtService service = null;

		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		service = ctx.getBean("service", EmployeeMgmtService.class);
		System.out.println(service.fetchEmpCount());
		System.out.println("=================");
		try {
//			System.out.println("EName::" + service.fetchEmpNameById(7099));

			System.out.println("=================");
			System.out.println("EmpDetails::" + service.fetchEmpDetailsByEmpNo(7499));

			System.out.println("=================");
			
			/*service.fetchEmpByDesg("CLERK", "MANAGER").forEach(map->{
				System.out.println(map);
			});;*/
			service.fetchEmpByDesg("CLERK", "MANAGER").forEach(System.out::println);;
			System.out.println("=================");
			
//			System.out.println(service.registerEmp("runraja","dev",40000));
		} catch (EmptyResultDataAccessException e) {
			System.out.println("No record Found");

		}

		((AbstractApplicationContext) ctx).close();
	}
}
