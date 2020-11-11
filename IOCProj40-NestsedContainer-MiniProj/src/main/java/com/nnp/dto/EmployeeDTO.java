package com.nnp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable{
	private Integer empno;
	private String ename;
	private Float Sal;
	private String Job;
	private Integer deptno;
}
