package org.han.web;

<<<<<<< HEAD
import javax.inject.Inject;

import org.han.service.BbsService;
import org.han.vo.BbsVO;
=======
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {
<<<<<<< HEAD

	@Inject
	BbsService service;

	@Inject
	BbsVO vo;

	public void create() {
		service.Create(vo);
	}
=======
	
	private static Logger logger = LoggerFactory.getLogger(BbsController.class);
	
//	@RequestMapping("/create")

 
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635

}
