package com.nnp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnp.bo.EmployeeBO;
import com.nnp.dao.IEmployeeDAO;
import com.nnp.dto.EmployeeDTO;

@Service("service")
public class EmployeeMgmtService implements IEmployeeMgmtService{
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public EmployeeDTO fetchEmp(int empNo) {
		EmployeeDTO dto=new EmployeeDTO();
		EmployeeBO bo=dao.getEmp(empNo);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public List<EmployeeDTO> fetchEmpByDesg(String desg1, String desg2, String desg3) {
		List<EmployeeDTO> lidos=new ArrayList<>();
		List<EmployeeBO> libos=null;
		libos=dao.getEmpByJobs(desg1, desg2, desg3);
		libos.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			lidos.add(dto);
		});
		return lidos;
	}

	@Override
	public List<EmployeeDTO> fetchEmpByDepts(int deptNo) {
		List<EmployeeDTO> lidos=new ArrayList<>();
		List<EmployeeBO> libos=null;
		libos=dao.getEmpByDepts(deptNo);
		libos.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			lidos.add(dto);
		});
		return lidos;
	}

	
	
}
