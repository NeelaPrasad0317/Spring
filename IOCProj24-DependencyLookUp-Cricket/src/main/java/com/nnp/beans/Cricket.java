package com.nnp.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Cricket {
	private CricketBall ball;

	public void setBall(CricketBall ball) {
		this.ball = ball;
	}

	public void batting() {
		DefaultListableBeanFactory fac = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(fac);
		read.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");

		CricketBat bat = fac.getBean("bat", CricketBat.class);
		System.out.println("Player is ready, " + bat.getBat() + " and " + ball.getBall());
	}

	public void bowling() {
		System.out.println("Players are ready and " + ball.getBall());
	}

	public void keeping() {
		DefaultListableBeanFactory fac = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(fac);
		read.loadBeanDefinitions("com/nnp/cfgs/applicationContext.xml");

		KeepingGloves kg = fac.getBean("kg", KeepingGloves.class);
		System.out.println("keeper is ready and " + kg.getGloves()+" and "+ball.getBall());
	}
}
