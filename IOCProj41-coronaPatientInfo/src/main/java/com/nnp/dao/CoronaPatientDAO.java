package com.nnp.dao;

import java.util.List;

import com.nnp.bo.CoronaPatientBO;

public interface CoronaPatientDAO {
	List<CoronaPatientBO> getPatientList(String status1,String status2)throws Exception;
}
