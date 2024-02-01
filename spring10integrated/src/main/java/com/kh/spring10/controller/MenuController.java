package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.Menudao;
import com.kh.spring10.dto.MenuDto;
import com.kh.spring10.vo.PageVO;


@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));//true면 공백==null
	}
	
	@Autowired
	private Menudao menuDao;

	//등록
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/menu/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		menuDao.insert(dto);
		return "redirect:insertComplete";
	}
	
	@RequestMapping("/insertComplete")
	public String insertComplete() {
		return "/WEB-INF/views/menu/insertComplete.jsp";
	}
	
	//수정페이지
		@GetMapping("/change")
		public String change(Model model, @RequestParam int menuNo) {
			MenuDto dto = menuDao.selectOne(menuNo);//번호에 대한 메뉴 조회
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
			menuDao.update(dto);
//			return "redirect:changeSuccess";//수정 성공 페이지
			return "redirect:detail?menuNo="+dto.getMenuNo();
		}

		@RequestMapping("/changeSuccess")
		public String changeSuccess() {
			return "/WEB-INF/views/menu/changeSuccess.jsp";
		}

		@RequestMapping("/changeFail")
		public String changeFail() {
			return "/WEB-INF/views/menu/changeFail.jsp";
		}
		
//		@RequestMapping("/list")
//		public String list(@RequestParam(required = false)String column,
//							@RequestParam(required = false)String keyword,
//							Model model) {
//			boolean isSearch = column != null && keyword != null;
//			List<MenuDto> list = isSearch ? 
//					menuDao.selectList(column, keyword) : menuDao.selectList();
//			model.addAttribute("list", list);
//			return "/WEB-INF/views/menu/list.jsp";
//		}
		@RequestMapping("/list")
		public String list(
				@ModelAttribute PageVO pageVO,
				Model model) {
			int count = menuDao.count(pageVO);
			pageVO.setCount(count);
			model.addAttribute("pageVO", pageVO);
			
			List<MenuDto> list = menuDao.selectListByPaging(pageVO);
			model.addAttribute("list", list);
			
			return "/WEB-INF/views/menu/list2.jsp";
		}
		
		//상세
		@RequestMapping("/detail")
		public String detail(@RequestParam int menuNo, Model model) {
			MenuDto dto = menuDao.selectOne(menuNo);
			model.addAttribute("dto", dto);
			return "/WEB-INF/views/menu/detail.jsp";
			
		}
		
		//삭제
		@RequestMapping("/delete")
		public String delete(@RequestParam int menuNo) {
			menuDao.delete(menuNo);
			return "redirect:list";
		}
		
}
