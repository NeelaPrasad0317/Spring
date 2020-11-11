package com.nnp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.nnp.service.EmployeeMgmtService;

@SpringBootApplication(exclude= {JdbcTemplateAutoConfiguration.class,DataSourceAutoConfiguration.class})
public class DaoProj04BootJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService service=null;
		
		ctx=SpringApplication.run(DaoProj04BootJdbcTemplateDirectMethodsApplication.class, args);
		
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
	}

}
