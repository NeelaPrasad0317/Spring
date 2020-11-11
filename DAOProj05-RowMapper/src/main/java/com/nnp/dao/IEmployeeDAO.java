package com.nnp.dao;

import java.util.List;

import com.nnp.bo.EmployeeBO;

public interface IEmployeeDAO {
	
	EmployeeBO getEmp(int empNo);
	List<EmployeeBO> getEmpByJobs(String desg1,String desg2,String desg3);
	List<EmployeeBO> getEmpByDepts(int deptNo);
}
