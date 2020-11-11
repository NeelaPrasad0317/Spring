package com.nnp.dto;

import java.io.Serializable;


public class EmployeeDTO implements Serializable{
	private Integer empno;
	private String ename;
	private Float Sal;
	private String Job;
	private Integer deptno;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Float getSal() {
		return Sal;
	}
	public void setSal(Float sal) {
		Sal = sal;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empno=" + empno + ", ename=" + ename + ", Sal=" + Sal + ", Job=" + Job + ", deptno="
				+ deptno + "]";
	}
	
	
}
