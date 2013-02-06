package com.gang.dev.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static final Logger logger=LoggerFactory.getLogger(AdminController.class);
	@RequestMapping(value="/index.html",method=RequestMethod.GET)
	public String index(){
		
		return "admin/index";
	}
	@RequestMapping(value="/userMgr.html",method=RequestMethod.GET)
	public String desktop(){
		
		return "admin/userMgr";
	}
}
