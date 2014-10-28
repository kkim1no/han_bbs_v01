package org.han.service;

import javax.inject.Inject;

import org.han.mapper.BbsMapper;
import org.han.vo.BbsVO;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	
	@Inject
	BbsMapper mapper;
	
	
	public void Create(BbsVO vo){
		
		mapper.setData(vo);
	}
	
	public String[] ReadAll(){
			
		return mapper.getList();
	}

	

}
