package com.nnp.service;

import java.util.List;
import java.util.Map;

import com.nnp.dao.EmployeeDAO;

public class EmployeeMgmtService {
	private EmployeeDAO dao;

	public EmployeeMgmtService(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}
	
	public String fetchEmpCount() {
		int count=0;
		count=dao.getEmpCount();
		return "Employee Count::"+count;
	}
	
	public String fetchEmpNameById(int empNo) {
		return dao.getEnameById(empNo);
	}
	public Map<String,Object> fetchEmpDetailsByEmpNo(int empNo) {
		return dao.getEmpDetails(empNo);
	}
	public List<Map<String,Object>> fetchEmpByDesg(String desg1,String desg2){
		return dao.getEmpByDesg(desg1,desg2);
	}

	public String registerEmp(String name, String job,float sal) {
		int count= dao.enterEmp(name,job,sal);
		return count==0?"record insertion failed":"record inserted";
	}
	
}
