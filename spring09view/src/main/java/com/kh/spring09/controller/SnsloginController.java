package com.kh.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SnsloginController {

	@RequestMapping("/snslogin")
	public String snslogin() {
		return "/WEB-INF/views/snslogin.jsp";
	}
	
}
