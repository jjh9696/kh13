package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.StudentDao;
import com.kh.spring10.dto.StudentDto;



@Controller
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
	private StudentDao studentDao;
	
	//등록
//	@RequestMapping("/add")
//	public String add(@ModelAttribute StudentDto dto) {
//		dao.insert(dto);
//		return "학생 정보 등록 완료";
//	}
	
	//등록
	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/views/student/add.jsp";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute StudentDto studentdto) {
		studentDao.insert(studentdto);
		return "redirect:list";
	}
	
	//수정
//	@RequestMapping("/edit")
//	public String edit(@ModelAttribute StudentDto dto) {
//		if(dao.update(dto)) {
//			return "학생 정보 수정 완료";
//		}
//		else {
//			return "없는 학생 번호";
//		}
//	}
	
	//수정
	@GetMapping("/edit")
	public String edit() {
		return "WEB-INF/views/student/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute StudentDto studentDto) {
		studentDao.update(studentDto);
		return "redirect:detail";
	}
	
	//삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam int studentId) {
		studentDao.delete(studentId);
		return "redirect:list";
	}
	
	//목록
//	@RequestMapping("/list")
//	public String list(
//			@RequestParam(required = false) String column,
//			@RequestParam(required = false) String keyword
//			) {
//		boolean isSearch = column != null && keyword != null;
//		List<StudentDto> list;
//		list= isSearch ? dao.selectList(column, keyword) : dao.selectList();
//		
//		StringBuffer buffer = new StringBuffer();
//		for(StudentDto dto : list) {
//			buffer.append(dto.getStudentId());
//			buffer.append(". ");
//			buffer.append(dto.getName());
//			buffer.append("(국어 : ");
//			buffer.append(dto.getKoreanScore());
//			buffer.append("), ");
//			buffer.append("(수학 : ");
//			buffer.append(dto.getMathScore());
//			buffer.append("), ");
//			buffer.append("(영어 : ");
//			buffer.append(dto.getEnglishScore());
//			buffer.append(")");
//			buffer.append("총점-"+dto.getTotal()+"점 / ");
//			buffer.append("평균-"+dto.getAverage()+"점");
//			buffer.append("<br>");
//		}
//		return buffer.toString();
//	}
	
	//목록
	@RequestMapping("/list")
	public String list(@RequestParam(required = false)String column,
			@RequestParam(required = false)String keyword,
			Model model) {
		boolean isSearch = column != null && keyword != null;
		List<StudentDto> list = isSearch ? 
				studentDao.selectList(column, keyword) : studentDao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/student/list.jsp";
	}
	
	//상세
//	@RequestMapping("/detail")
//	public String detail(@RequestParam int studentId) {
//		StudentDto dto = dao.selectOne(studentId);
//		StringBuffer buffer = new StringBuffer();
//		if(dto != null) {
//			buffer.append(dto.getStudentId());
//			buffer.append(". ");
//			buffer.append(dto.getName());
//			buffer.append("(국어 : ");
//			buffer.append(dto.getKoreanScore());
//			buffer.append("), ");
//			buffer.append("(수학 : ");
//			buffer.append(dto.getMathScore());
//			buffer.append("), ");
//			buffer.append("(영어 : ");
//			buffer.append(dto.getEnglishScore());
//			buffer.append(")");
//			buffer.append("총점-"+dto.getTotal()+"점 / ");
//			buffer.append("평균-"+dto.getAverage()+"점");
//			return buffer.toString();
//		}
//		else {
//			return "존재하지 않는 학생 번호";
//			
//		}
//	}
	
	//상세
	@RequestMapping("/detail")
	public String detail(@RequestParam int studentId, Model model) {
		StudentDto studentDto = studentDao.selectOne(studentId);
		model.addAttribute("studentDto", studentDto);
		return "/WEB-INF/views/student/detail.jsp";
	}
	

}