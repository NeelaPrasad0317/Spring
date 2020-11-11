package com.nnp.beans;

import org.springframework.stereotype.Component;

@Component("dc")
public class DependentClass {
	static {
		System.out.println("Variable level injection done");
	}
}
