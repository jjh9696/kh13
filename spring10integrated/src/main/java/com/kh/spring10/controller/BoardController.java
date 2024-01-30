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

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.MemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	//등록
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto, 
						Model model, HttpSession session) {
		String loginId=(String) session.getAttribute("loginId");
		MemberDto memberDto = memberDao.selectOne(loginId);
		model.addAttribute("memberDto",memberDto);
		int seq = boardDao.getSeq();
		boardDto.setBoardNo(seq);
		boardDao.insert(boardDto);
		return "redirect:detail?boardNo="+seq; 
	}
	
	//수정
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model, 
						HttpSession session) {
		String loginId=(String)session.getAttribute("loginId");
		MemberDto memberDto = memberDao.selectOne(loginId);
		model.addAttribute("memberDto",memberDto);
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		boardDao.update(boardDto);
		return "redirect:detail?boardNo="+boardDto.getBoardNo();
	}
	
	//목록
	@RequestMapping("/list")
	public String list(@RequestParam(required = false)String column,
						@RequestParam(required = false)String keyword,
						Model model) {
		boolean isSearch = column !=null && keyword !=null;
		List<BoardDto> list = isSearch ? 
				boardDao.selectList(column, keyword) : boardDao.selectList();
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/board/list.jsp";
	}
	
	//상세
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		//조회한 게시글 정보에 있는 회원 아이디로 작성자 정보를 불러와서 첨부
		if(boardDto.getBoardWriter() != null) {//작성자가 탈퇴하지 않았다면
			MemberDto memberDto = memberDao.selectOne(boardDto.getBoardWriter());
			model.addAttribute("memberDto", memberDto);
		}
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	//삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boardDao.delete(boardNo);
		return "redirect:list";
	}
	
}
