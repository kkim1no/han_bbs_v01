package org.han.web;

import javax.inject.Inject;

import org.han.service.BbsService;
import org.han.vo.BbsVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {

	@Inject
	BbsService service;

	@Inject
	BbsVO vo;

	public void create() {
		service.Create(vo);
	}

}
