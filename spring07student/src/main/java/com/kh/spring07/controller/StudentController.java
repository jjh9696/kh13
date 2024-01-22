package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.StudentDao;
import com.kh.spring07.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/student")
public class StudentController {
	/*
	student_id는 시퀀스로 설정한다
	컨트롤러 이름은 StudentController로 하며 공용 주소는 /student로 한다
	등록페이지 - /add
	목록/검색페이지 - /list
	상세페이지 - /detail
	수정페이지 - /edit
	삭제페이지 - /delete
	정보 출력 시 합계와 평균이 같이 나오도록 구현하세요
	*/

	@Autowired
	private StudentDao dao;
	
	@RequestMapping("/add")
	public String add(@ModelAttribute StudentDto dto) {
		dao.insert(dto);
		return "학생 정보 등록 완료";
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute StudentDto dto) {
		if(dao.update(dto)) {
			return "학생 정보 수정 완료";
		}
		else {
			return "없는 학생 번호";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int studentId) {
		if(dao.delete(studentId)) {
			return "학생 정보 삭제 완료";
		}
		else {
			return "없는 학생 번호";
		}
	}
	
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column != null && keyword != null;
		List<StudentDto> list;
		list= isSearch ? dao.selectList(column, keyword) : dao.selectList();
		
		StringBuffer buffer = new StringBuffer();
		for(StudentDto dto : list) {
			buffer.append(dto.getStudentId());
			buffer.append(". ");
			buffer.append(dto.getName());
			buffer.append("(국어 : ");
			buffer.append(dto.getKoreanScore());
			buffer.append("), ");
			buffer.append("(수학 : ");
			buffer.append(dto.getMathScore());
			buffer.append("), ");
			buffer.append("(영어 : ");
			buffer.append(dto.getEnglishScore());
			buffer.append(")");
			buffer.append("총점-"+dto.getTotal()+"점 / ");
			buffer.append("평균-"+dto.getAverage()+"점");
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int studentId) {
		StudentDto dto = dao.selectOne(studentId);
		StringBuffer buffer = new StringBuffer();
		if(dto != null) {
			buffer.append(dto.getStudentId());
			buffer.append(". ");
			buffer.append(dto.getName());
			buffer.append("(국어 : ");
			buffer.append(dto.getKoreanScore());
			buffer.append("), ");
			buffer.append("(수학 : ");
			buffer.append(dto.getMathScore());
			buffer.append("), ");
			buffer.append("(영어 : ");
			buffer.append(dto.getEnglishScore());
			buffer.append(")");
			buffer.append("총점-"+dto.getTotal()+"점 / ");
			buffer.append("평균-"+dto.getAverage()+"점");
			return buffer.toString();
		}
		else {
			return "존재하지 않는 학생 번호";
			
		}
	}
	
	

}
