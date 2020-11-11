package com.sp.service;

import com.sp.bo.CustomerBO;
import com.sp.dao.CustomerDAO;
import com.sp.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;

	// constructor injection of DAO
	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}


	@Override
	public String calSimpleintr(CustomerDTO dto) throws Exception {
		float intr=0.0f;
		CustomerBO bo=null;
		int count=0;
		
		//calculate simple interest
		intr=(dto.getPamt()*dto.getTime()*dto.getTime())/100.0f;
		//create bo obj
		bo = new CustomerBO();
		bo.setName(dto.getName());
		bo.setAdd(dto.getAdd());
		bo.setPamt(dto.getPamt());
		bo.setIntamt(intr);
		
		//insert data into DB by calling dao
		count = dao.insert(bo);

		// return msg based on count
		if (count == 0) {
			return "Customer record insertion failed and simple interest calculated is: " + intr;
		} else
			return "Customer record inserted Successfully into DB and simple interest calculated is: " + intr;
		
	}


}
