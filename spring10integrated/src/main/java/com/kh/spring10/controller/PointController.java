package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.ItemDao;

@Controller
@RequestMapping("/point")
public class PointController {

	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping("/charge")
	public String charge(Model model) {
		model.addAttribute("list", itemDao.selectList());
		return "/WEB-INF/views/point/charge.jsp";
	}
	
    //상품번호를 전달하면 파일번호를 찾아서 리다렉이렉트 하는 페이지
    @RequestMapping("/image")
    public String image(@RequestParam int itemNo) {
    	try {
    		int attachNo = itemDao.findAttachNo(itemNo);
    		return "redirect:/download?attachNo="+attachNo;
    	}
    	catch(Exception e) {
    		//return "기본이미지 주소";
    		return "redirect:https://via.placeholder.com/200x100.png";
    	}
    }
	
}
