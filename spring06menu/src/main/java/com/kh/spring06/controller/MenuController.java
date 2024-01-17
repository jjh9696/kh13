package com.kh.spring06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.Menudao;
import com.kh.spring06.dto.MenuDto;



@RestController
@RequestMapping("/menu")
public class MenuController {
	/*
	spring06menu 프로젝트에 menu 등록 관련된 파일과 코드를 추가

	MenuDao : 메뉴 등록 처리 클래스
	MenuDto : 메뉴 데이터 통합 클래스
	MenuMapper : 메뉴 데이터 변환 클래스
	MenuController : 메뉴 관련 처리 페이지 제공 클래스

	필요한 모든 클래스를 등록한 뒤 연동하여 사용

	등록 주소 : /menu/insert
	*/
	
	@Autowired
	private Menudao dao;
	
	@RequestMapping("/insert")
	public String menu(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		return "메뉴 등록 완료";
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute MenuDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			
			return "메뉴 수정 완료";
		}
		else {
			return "존재하지 않는 메뉴 번호";
		}
	}
	
	@RequestMapping("/delete")
	public String delete (@RequestParam int menuNo) {
		if(dao.delete(menuNo)) {
			return "메뉴 삭제 완료";
		}
		else {
			return "존재하지 않는 메뉴";
		}
	}
	
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column != null && keyword != null;
		List<MenuDto> list;
		if(isSearch) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		
		StringBuffer buffer = new StringBuffer();
		for(MenuDto dto : list) {
			buffer.append(dto.getMenuNo());
			buffer.append(", ");
			buffer.append(dto.getMenuNameKor());
			buffer.append(", ");
			buffer.append(dto.getMenuNameEng());
			buffer.append(", ");
			buffer.append(dto.getMenuType());
			buffer.append(", ");
			buffer.append(dto.getMenuPrice());
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int menuNo) {
		MenuDto dto = dao.selectOne(menuNo);
		if(dto != null) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(dto.getMenuNameKor());
			buffer.append("(");
			buffer.append(dto.getMenuNameEng());
			buffer.append(") ");
			buffer.append(dto.getMenuType());
			buffer.append(", ");
			buffer.append(dto.getMenuPrice());
			return buffer.toString();
		}
		else {
			return "존재하지 않는 메뉴 번호";
		}
	}
	
	
}
