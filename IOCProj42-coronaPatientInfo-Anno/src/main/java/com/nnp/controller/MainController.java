package com.nnp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nnp.dto.CoronaPatientDTO;
import com.nnp.service.CoronaPatientMgmtService;
import com.nnp.vo.CoronaPatientVO;

@Controller("controller")
public class MainController {
	@Autowired
	private CoronaPatientMgmtService service;

	public List<CoronaPatientVO> fetchCoronaPatientByStatus(String status1,String status2)throws Exception{
		List<CoronaPatientDTO> lidtos=null;
		List<CoronaPatientVO> livos=new ArrayList();

		lidtos=service.getPatientsListByStatus(status1, status2);
		//convert dto to vo
		lidtos.forEach(dto->{
			CoronaPatientVO vo=new CoronaPatientVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setpAge(String.valueOf(dto.getpAge()));
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
			livos.add(vo);
		});
		return livos;
	}
}








