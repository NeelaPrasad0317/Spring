package com.nnp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nnp.dto.CoronaPatientDTO;
import com.nnp.service.CoronaPatientMgmtService;
import com.nnp.vo.CoronaPatientVO;

public class MainController {
	private CoronaPatientMgmtService service;

	public MainController(CoronaPatientMgmtService service) {
		super();
		this.service = service;
	}
	
	public List<CoronaPatientVO> fetchCoronaPatientByStatus(String status1,String status2)throws Exception{
		List<CoronaPatientDTO> lidtos=null;
		List<CoronaPatientVO> livos=new ArrayList();

		lidtos=service.getPatientsListByStatus(status1, status2);
		//convert dto to vo
		lidtos.forEach(dto->{
			CoronaPatientVO vo=new CoronaPatientVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setPAge(String.valueOf(dto.getPAge()));
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
			livos.add(vo);
		});
		return livos;
	}
}








