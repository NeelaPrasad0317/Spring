package com.nnp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nnp.dto.CustomerDTO;
import com.nnp.service.CustomerMgmtService;

@SpringBootApplication
public class DataProj01CurdRepoDirectMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerMgmtService service=null;
		CustomerDTO dto1=null,dto2=null,dto3=null;
		
		//application context container
		ctx=SpringApplication.run(DataProj01CurdRepoDirectMethodsApplication.class, args);
		
		//get service class
		service=ctx.getBean("custService", CustomerMgmtService.class);
		
		//
		dto1=new CustomerDTO();
		dto2=new CustomerDTO();
		dto3=new CustomerDTO();
		dto1.setCname("sai");	dto1.setCadd("atp");	dto1.setBillamt(23442);
		dto2.setCname("pavan");	dto2.setCadd("sulur");	dto2.setBillamt(45360);
		dto3.setCname("gandhi");	dto3.setCadd("done");	dto3.setBillamt(21400);
		
		try {
			/*//register cutomer
			System.out.println(service.registerCustomer(dto));
			*/
			
			//register group customers
		//	System.out.println(service.registerGroupCustomers(List.of(dto1, dto2, dto3)));
	
			//delete employee 
			System.out.println(service.removeEmployeeById(6));
			
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	
		((ConfigurableApplicationContext) ctx).close();
	}

}
