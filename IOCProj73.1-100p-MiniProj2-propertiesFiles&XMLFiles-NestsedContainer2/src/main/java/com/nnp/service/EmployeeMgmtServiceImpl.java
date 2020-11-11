package com.nnp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnp.bo.EmployeeBO;
import com.nnp.dao.EmployeeDAO;
import com.nnp.dto.EmployeeDTO;

@Service
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	@Autowired
	private EmployeeDAO empDao;

	@Override
	public List<EmployeeDTO> getAllEmployeeDetails() {
		List<EmployeeBO> liBos=null;
		List<EmployeeDTO> liDtos=new ArrayList<EmployeeDTO>();
		EmployeeDTO dto=null;
		
		//get the details 
		liBos = empDao.getDetails();
		for(EmployeeBO bo:liBos) {
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			liDtos.add(dto);
		}
		return liDtos;
	}

}
