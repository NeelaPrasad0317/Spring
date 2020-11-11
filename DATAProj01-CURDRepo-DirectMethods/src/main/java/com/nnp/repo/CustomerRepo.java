package com.nnp.repo;

import org.springframework.data.repository.CrudRepository;

import com.nnp.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
