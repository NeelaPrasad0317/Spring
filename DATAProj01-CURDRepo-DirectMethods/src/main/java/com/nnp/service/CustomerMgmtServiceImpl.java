package com.nnp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnp.dto.CustomerDTO;
import com.nnp.entity.Customer;
import com.nnp.repo.CustomerRepo;

@Service("custService")
public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	@Autowired
	private CustomerRepo repo;

	// register customer
	@Override
	public String registerCustomer(CustomerDTO dto) {
		System.out.println(repo.getClass() + "------>" + Arrays.toString(repo.getClass().getInterfaces()));
		Customer c = null;

		c = new Customer();
		BeanUtils.copyProperties(dto, c);
		c = repo.save(c);
		return c != null ? "customer is registered with id:: " + c.getCno() : "customer registration failed";
	}

	// register group
	@Override
	public String registerGroupCustomers(List<CustomerDTO> listDTO) {
		List<Customer> listEntities = new ArrayList<>(), listEntities1 = new ArrayList<>();
		String ids = new String();

		// convert dto to entities
		listDTO.forEach(dto -> {
			Customer entity = new Customer();
			BeanUtils.copyProperties(dto, entity);
			listEntities.add(entity);
		});

		// use repo
		listEntities1 = (List<Customer>) repo.saveAll(listEntities);

		// get cnos
		/*	for (Customer c : listEntities1) {
				ids = ids + "," + c.getCno();
			}*/
		ids = listEntities1.stream().map(e -> e.getCno()).collect(Collectors.toList()).toString();

		return listEntities1 != null ? "Group registration is sucessful with cnos" + ids : "Batch insertion is failed";

	}

	// remove employee by id
	@Override
	public String removeEmployeeById(int cno) {
		Optional<Customer> opt = null;
		// use repo
		opt = repo.findById(cno);

//		if (opt.isEmpty()) {
		if(opt.isPresent()) {
			// delete employee record
			repo.deleteById(cno);
			return "cno::" + cno + " record is removed from database";
		} else
			return "cno::" + cno + " record is not found in the database";
	}
}//class
