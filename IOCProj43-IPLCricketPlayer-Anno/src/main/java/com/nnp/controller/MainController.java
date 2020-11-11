package com.nnp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nnp.dto.PlayerDTO;
import com.nnp.service.PlayerRegMgmtService;
import com.nnp.vo.PlayerVO;

@Controller("controller")
public class MainController {
	@Autowired
	private PlayerRegMgmtService prs;

	public String PlayerProcess(PlayerVO vo)throws Exception{
		String result=null;
		PlayerDTO dto=null;
		
		//create dto obj
		dto=new PlayerDTO();
		//set values to dto obj
		dto.setName(vo.getName());
		dto.setTeam(vo.getTeam());
		dto.setMatches(Integer.parseInt(vo.getMatches()));
		dto.setInnings(Integer.parseInt(vo.getInnings()));
		dto.setRunsscored(Integer.parseInt(vo.getRunsscored()));
		dto.setWickets(Integer.parseInt(vo.getWickets()));
		dto.setRunsCon(Integer.parseInt(vo.getRunsCon()));
		
		//call reg process
		result=prs.Register(dto);
		
		return result;
	}
	
}
