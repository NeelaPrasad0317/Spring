package com.nnp.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class EmployeeDTO implements Serializable {
	private int  empNo;
	private  String ename;
	private  String job;
	private float  sal;
	private int  deptNo;
}
