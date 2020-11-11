package com.nnp.service;

import java.util.List;
import java.util.Map;

import com.nnp.bo.EmployeeBO;
import com.nnp.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	
	EmployeeDTO fetchEmp(int empNo);
	List<EmployeeDTO> fetchEmpByDesg(String desg1,String desg2,String dsg3);
	List<EmployeeDTO> fetchEmpByDepts(int deptNo);
}
