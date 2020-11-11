package com.nnp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnp.bo.CoronaPatientBO;
import com.nnp.dao.CoronaPatientDAO;
import com.nnp.dto.CoronaPatientDTO;

@Service("service")
public class CoronaPatientMgmtServiceImpl implements CoronaPatientMgmtService {
	@Autowired
	private CoronaPatientDAO cdao;

	@Override
	public List<CoronaPatientDTO> getPatientsListByStatus(String status1, String status2) throws Exception {
		List<CoronaPatientDTO> lidtos=new ArrayList();
		List<CoronaPatientBO> libos=null;
		
		//convert inputs lowercase
		status1=status1.toLowerCase();
		status2=status2.toLowerCase();
		
		
		libos=cdao.getPatientList(status1, status2);
		
		/*	for(CoronaPatientBO bo:libos) {
				CoronaPatientDTO dto=new CoronaPatientDTO();
				BeanUtils.copyProperties(bo, dto);
				dto.setSerialNo(lidtos.size()+1);
				lidtos.add(dto);
			}*/
		//convert bo to dto
		libos.forEach(bo->{
			CoronaPatientDTO dto=new CoronaPatientDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSerialNo(lidtos.size()+1);
			lidtos.add(dto);
		});
		
		return lidtos;
	}

}











