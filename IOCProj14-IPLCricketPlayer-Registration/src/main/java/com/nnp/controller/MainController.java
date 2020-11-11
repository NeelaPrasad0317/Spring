package com.nnp.controller;

import com.nnp.dto.PlayerDTO;
import com.nnp.service.PlayerRegMgmtService;
import com.nnp.vo.PlayerVO;

public class MainController {
	private PlayerRegMgmtService prs;

	//constructor injection of service class
	public MainController(PlayerRegMgmtService prs) {
		this.prs = prs;
	}

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
