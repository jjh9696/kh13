package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.Menudao;
import com.kh.spring10.dto.MenuDto;


@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private Menudao dao;

	//등록
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/menu/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		return "redirect:insertComplete";
	}
	
	@RequestMapping("/insertComplete")
	public String insertComplete() {
		return "/WEB-INF/views/menu/insertComplete.jsp";
	}
	
	//수정페이지
		@GetMapping("/change")
		public String change(Model model, @RequestParam int menuNo) {
			MenuDto dto = dao.selectOne(menuNo);//번호에 대한 메뉴 조회
			if(dto == null) {//없는 메뉴면
				return "redirect:changeFail";//실패 페이지로 강제이동
			}
			else {//있는 메뉴면
				model.addAttribute("dto", dto);//JSP로 메뉴정보를 전달
				return "/WEB-INF/views/menu/change.jsp";//수정화면을 연결
			}
		}
		
		@PostMapping("/change")
		public String change(@ModelAttribute MenuDto dto) {
			dao.update(dto);
			return "redirect:changeSuccess";
		}

		@RequestMapping("/changeSuccess")
		public String changeSuccess() {
			return "/WEB-INF/views/menu/changeSuccess.jsp";
		}

		@RequestMapping("/changeFail")
		public String changeFail() {
			return "/WEB-INF/views/menu/changeFail.jsp";
		}
}
