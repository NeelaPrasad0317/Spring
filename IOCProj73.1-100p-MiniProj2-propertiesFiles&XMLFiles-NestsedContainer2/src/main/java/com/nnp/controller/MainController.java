package com.nnp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.nnp.dto.EmployeeDTO;
import com.nnp.service.EmployeeMgmtService;

@Controller("controller")
public class MainController {
	@Autowired
//	@Lazy
	private EmployeeMgmtService empService;

	public List<EmployeeDTO> processEmployee(){
		return empService.getAllEmployeeDetails();
	}
}
