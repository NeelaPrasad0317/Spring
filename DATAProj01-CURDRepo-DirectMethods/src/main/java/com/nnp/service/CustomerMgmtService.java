package com.nnp.service;

import java.util.List;

import com.nnp.dto.CustomerDTO;

public interface CustomerMgmtService {
	public String registerCustomer(CustomerDTO dto);
	public String registerGroupCustomers(List<CustomerDTO> listDTO);
	public String removeEmployeeById(int cno);
}
