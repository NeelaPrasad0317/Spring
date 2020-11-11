package com.nnp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nnp.controller.MainController;
import com.nnp.vo.CoronaPatientVO;

public class CoronaPatientStatusTest {
	public static void main(String[] args) {
		ApplicationContext parentctx=null;
		ApplicationContext childctx=null;
		MainController controller=null;
		List<CoronaPatientVO> livos=null;
		
		//get containers
		parentctx=new ClassPathXmlApplicationContext("com/nnp/cfgs/business-beans.xml");
		childctx=new ClassPathXmlApplicationContext(new String[] {"com/nnp/cfgs/presentation-beans.xml"}, parentctx);
		
		//get main controller
		controller=childctx.getBean("controller",MainController.class);
		
		//call b.method
		try {
			livos=controller.fetchCoronaPatientByStatus("negetive","active");
			for(CoronaPatientVO vo:livos) {
				System.out.println(vo);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) childctx).close();
		((AbstractApplicationContext) parentctx).close();
	}
}
