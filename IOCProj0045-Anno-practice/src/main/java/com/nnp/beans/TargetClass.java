package com.nnp.beans;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tc")
public class TargetClass {
	
	private Date date;
	private DataSource ds;
	private Date dob;
	@Autowired
	public TargetClass(Date date) {
		System.out.println("Constructor level injection done");
		this.date = date;
	}
	
	@Autowired
	public void setDs(DataSource ds) {
		System.out.println("Setter level injection done");
		this.ds = ds;
	}

	@Autowired
	private DependentClass dc;

	private void setDob(Date dob) {
		System.out.println("Setter method method");
	}
	
	private void orbitory 
	
}
