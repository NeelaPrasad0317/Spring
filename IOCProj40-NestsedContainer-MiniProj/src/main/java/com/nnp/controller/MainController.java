package com.nnp.controller;

import java.util.List;

import com.nnp.dto.EmployeeDTO;
import com.nnp.service.EmployeeMgmtService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainController {
	@NonNull
	private EmployeeMgmtService empService;
	
	
	
	public List<EmployeeDTO> processEmployee(){
		return empService.getAllEmployeeDetails();
	}
}
