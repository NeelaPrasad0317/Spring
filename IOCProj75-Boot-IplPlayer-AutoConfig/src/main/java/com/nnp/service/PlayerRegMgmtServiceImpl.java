package com.nnp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nnp.bo.PlayerBO;
import com.nnp.dao.PlayerRegDAO;
import com.nnp.dto.PlayerDTO;

@Service("service")
public class PlayerRegMgmtServiceImpl implements PlayerRegMgmtService {
	
	@Autowired
	@Qualifier("oraDao")
	private PlayerRegDAO dao;

	@Override
	public String Register(PlayerDTO dto) throws Exception {
		String result = null;
		double batAvg=0.0f,bowlAvg=0.0f;
		PlayerBO bo=null;
		int count=0;
		try {
		//calculate player batting avg
		batAvg=dto.getRunsscored()/dto.getInnings();
		}catch (Exception e) {
			batAvg=0;
		}
		try {
		//calculate player bowling avg
		bowlAvg=dto.getRunsCon()/dto.getWickets();
		}catch (Exception e) {
			bowlAvg=0;
		}
		//create bo obj
		bo=new PlayerBO();
		//copy values to bo
		bo.setName(dto.getName());
		bo.setTeam(dto.getTeam());
		bo.setMatches(dto.getMatches());
		bo.setBatAvg(batAvg);
		bo.setBowlAvg(bowlAvg);
		
		//insert player info into db
		count=dao.insert(bo);
		
		if(count==0) {
			result="Player Registration is failed & bat.avg="+batAvg+" ,bowl.avg="+bowlAvg;
		}else
			result="Player Registration is successful & bat.avg="+batAvg+" ,bowl.avg="+bowlAvg;
		return result;
	}

}
