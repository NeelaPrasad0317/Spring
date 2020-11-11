package com.sp.controller;

import com.sp.dto.CustomerDTO;
import com.sp.service.CustomerMgmtService;
import com.sp.vo.CustomerVO;

public class MainController {
	private CustomerMgmtService cms;

	// constructor injection of service
	public MainController(CustomerMgmtService cms) {
		this.cms = cms;
	}
	
	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDTO dto = null;
		String result = null;

		// create dto obj
		dto = new CustomerDTO();
		dto.setName(vo.getName());
		dto.setAdd(vo.getAdd());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));

		result = cms.calSimpleintr(dto);

		return result;

	}

}
