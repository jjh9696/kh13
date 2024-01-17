package com.kh.spring05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.EmpDao;
import com.kh.spring05.dto.EmpDto;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/emp")
public class EmpController {
	/*
	spring05jdbc 프로젝트에 emp 등록 관련된 파일과 코드를 추가

	EmpDao : 사원 등록 처리 클래스
	EmpDto : 사원 데이터 통합 클래스
	EmpMapper : 사원 데이터 변환 클래스
	EmpController : 사원 관련 처리 페이지 제공 클래스

	필요한 모든 클래스를 등록한 뒤 연동하여 사용

	등록 주소 : /emp/insert
	*/
	
	@Autowired
	private EmpDao dao;

	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		return "직원 등록 완료";
	}


	@RequestMapping("/edit")
	public String edit(@ModelAttribute EmpDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			
			return "직원 수정 완료";
		}
		else {
			return "존재하지 않는 직원 번호";
		}
	}
	
	@RequestMapping("/delete")
	public String delete (@RequestParam int empNo) {
		if(dao.delete(empNo)) {
			return "직원 삭제 완료";
		}
		else {
			return "존재하지 않는 직원";
		}
	}
	
	@RequestMapping("/list")
	public String list(@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column != null && keyword != null;
		List<EmpDto> list;
		if(isSearch) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		
		StringBuffer buffer = new StringBuffer();
		for(EmpDto dto : list) {
			buffer.append(dto.getEmpNo());
			buffer.append(", ");
			buffer.append(dto.getEmpName());
			buffer.append(", ");
			buffer.append(dto.getEmpDept());
			buffer.append(", ");
			buffer.append(dto.getEmpDate());
			buffer.append(", ");
			buffer.append(dto.getEmpSal());
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String detail (@RequestParam int empNo) {
		EmpDto dto = dao.selectOne(empNo);
		if (dto != null) {
			StringBuffer buffer= new StringBuffer();
			buffer.append(dto.getEmpName());
			buffer.append(", ");
			buffer.append(dto.getEmpDept());
			buffer.append(", ");
			buffer.append(dto.getEmpDate());
			buffer.append(", ");
			buffer.append(dto.getEmpSal());
			return buffer.toString();
		}
		else {
			return "존재하지 않는 직원 번호 입니다";
		}
	}
	
	
	
	
	
}
