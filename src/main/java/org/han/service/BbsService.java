package org.han.service;

import javax.inject.Inject;

import org.han.mapper.BbsMapper;
import org.han.vo.BbsVO;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======

>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
@Service
public class BbsService {
	
	@Inject
	BbsMapper mapper;
	
<<<<<<< HEAD
	
	public void Create(BbsVO vo){
		
		mapper.setData(vo);
	}
	
	public String[] ReadAll(){
			
		return mapper.getList();
	}

	
=======
	@Inject
	BbsVO vo;
	
	public void bbsCreate(BbsVO vo){
		mapper.create(vo);
	}
	
	public BbsVO read(String bno){
		return mapper.read(bno);
	}
	
	public void update(BbsVO vo){
		mapper.update(vo);
	}
	
	public void delete(String bno){
		mapper.delete(bno);
	}
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635

}
