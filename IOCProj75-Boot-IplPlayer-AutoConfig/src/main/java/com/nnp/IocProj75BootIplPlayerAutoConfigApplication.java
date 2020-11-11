package com.nnp;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nnp.controller.MainController;
import com.nnp.vo.PlayerVO;

@SpringBootApplication
public class IocProj75BootIplPlayerAutoConfigApplication {

	public static void main(String[] args) {
		PlayerVO vo=null;
		Scanner sc=null;
		ApplicationContext ctx=null;
		MainController controller=null;
		
		ctx=SpringApplication.run(IocProj75BootIplPlayerAutoConfigApplication.class, args);
		
		
		
		//invoke method
		try {
			//getscanner
			sc=new Scanner(System.in);
			//create vo obj
			vo=new PlayerVO();
			//read values 
			System.out.println("Enter Name::");
			vo.setName(sc.nextLine());
			System.out.println("Enter Team::");
			vo.setTeam(sc.nextLine());
			System.out.println("Enter Matches played::");
			vo.setMatches(sc.nextLine());
			System.out.println("Enter Innings played::");
			vo.setInnings(sc.nextLine());
			System.out.println("Enter Runs scored::");
			vo.setRunsscored(sc.nextLine());
			System.out.println("Enter Wickets taken::");
			vo.setWickets(sc.nextLine());
			System.out.println("Enter Runs conceded::");
			vo.setRunsCon(sc.nextLine());
			
			//get main controller bean
			controller=ctx.getBean("controller", MainController.class);
			System.out.println(controller.PlayerProcess(vo));
		} catch (Exception e) {
			System.out.println("Internal Error");
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
		sc.close();
	}

}
