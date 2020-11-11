package com.nnp.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nnp.controller.MainController;
import com.nnp.vo.PlayerVO;

public class PlayerRegTest {
	public static void main(String[] args) {
		PlayerVO vo=null;
		Scanner sc=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		
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
		
		//create bean factory IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");
		
		//get main controller bean
		controller=factory.getBean("controller", MainController.class);
		
		//invoke method
		try {
			System.out.println(controller.PlayerProcess(vo));
		} catch (Exception e) {
			System.out.println("Internal Error");
			e.printStackTrace();
		}
		
		sc.close();
	}
}
