package com.sp.dao;

import com.sp.bo.CustomerBO;

public interface CustomerDAO {
	int insert(CustomerBO bo) throws Exception;
}
