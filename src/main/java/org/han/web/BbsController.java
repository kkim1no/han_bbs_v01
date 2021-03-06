package org.han.web;

import java.util.List;

import javax.inject.Inject;

import org.han.service.BbsService;
import org.han.vo.BbsVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {

	@Inject
	BbsService service;

	private static Logger logger = LoggerFactory.getLogger(BbsController.class);

	// @RequestMapping("/list")
	// public String list(@RequestParam(value="page", defaultValue="") String
	// page, Model model){
	//
	// model.addAttribute("list" , service.list(page));
	//
	// return "bbs/list";
	//
	// }

	@RequestMapping("/list")
	public @ResponseBody List<BbsVO> list(
			@RequestParam(value = "page", defaultValue = "1") String page) {

		return service.list(page);
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String list() {

		return "bbs/view"; 
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {

		return "bbs/main";
	}
	
	
	@RequestMapping("/read")
	public @ResponseBody BbsVO read(
			@RequestParam(value = "bno", defaultValue = "1") String page) {

		return service.read(page);
	}

}
