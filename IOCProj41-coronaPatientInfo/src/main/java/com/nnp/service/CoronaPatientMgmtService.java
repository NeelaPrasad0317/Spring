package com.nnp.service;

import java.util.List;

import com.nnp.dto.CoronaPatientDTO;

public interface CoronaPatientMgmtService {
	List<CoronaPatientDTO> getPatientsListByStatus(String status1,String status2)throws Exception; 
}
