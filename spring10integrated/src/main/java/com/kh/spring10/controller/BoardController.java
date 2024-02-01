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

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.MemberDto;
import com.kh.spring10.vo.PageVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {

	//게시판에서는 empty string으로 전달되는 파라미터를 null로 간주하도록 설정
	//@InitBinder 설정으로 구현
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));//true면 공백==null
	}
	
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
						HttpSession session) {
		String loginId= (String)session.getAttribute("loginId");
		boardDto.setBoardWriter(loginId);
		int seq = boardDao.getSeq();//번호를 미리 받고
		boardDto.setBoardNo(seq);//번호를 Dto에 넣고
		boardDao.insert(boardDto);//구문을 실행한다
		return "redirect:detail?boardNo="+seq; 
	}
	
	/*
	//목록
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword,
			@RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "10") int size,
			Model model) {
		boolean isSearch = column != null && keyword != null;
		
		
		
//		화면에 네비게이터를 보여주는 데 필요한 값들을 계산
//		- blockSize : 화면에 표시할 네비게이터 개수 (10으로 설정)
//		- beginBlock : 네비게이터의 처음 숫자 , (페이지-1) / 10 * 10 + 1 (10은 blockSize)
//		- endBlock : 네비게이터의 마지막 숫자 , (페이지-1) / 10 * 10 + 10 (10은 blockSize)
//		- count : 게시글 개수
//		- totalPage : 전체 페이지 개수
		 
		
		int blockSize = 10;
		int beginBlock = (page-1) / blockSize * blockSize + 1;
		int endBlock = (page-1) / blockSize * blockSize + blockSize;
		model.addAttribute("beginBlock", beginBlock);//네비게이터 시작번호
		model.addAttribute("endBlock", endBlock);//네비게이터 종료번호
		model.addAttribute("page", page);//현재 페이지 번호
		
		int count = isSearch ? 
				boardDao.count(column, keyword):boardDao.count() ;
		int totalPage = (count-1) / size + 1;
		model.addAttribute("count",count);//게시글 개수
		model.addAttribute("totalPage",totalPage);//총 페이지 수 
		
		model.addAttribute("size", size);//현재 게시글 표시 개수
		
		if(isSearch) {//검색이면
			model.addAttribute("list", boardDao.selectListByPaging(column, keyword, page, size));
		}
		else {//목록이면
//			model.addAttribute("list", boardDao.selectList());
			model.addAttribute("list", boardDao.selectListByPaging(page, size));
			
		}
		return "/WEB-INF/views/board/list.jsp";
	}
	*/
	
//	Paging 처리를 별도의 VO 클래스로 구현
//	(참고) @ModelAttribute에 옵션을 주면 자동으로 모델에 첨부된다
	@RequestMapping("/list")
//	public String list(@ModelAttribute(value = "pageVO") PageVO vo, 
//			Model model) {
	public String list(
			@ModelAttribute PageVO pageVO,
			Model model) {
		//세부 계산은 클래스에서 수행하도록 하고 count, list만 처리
		int count = boardDao.count(pageVO);
		pageVO.setCount(count);
		model.addAttribute("pageVO", pageVO);
		
		List<BoardDto> list = boardDao.selectListByPaging(pageVO);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/board/list2.jsp";
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
	
	//수정
    @GetMapping("/edit")
    public String edit(@RequestParam int boardNo, Model model) {
        BoardDto boardDto = boardDao.selectOne(boardNo);//게시글번호조회
        model.addAttribute("boardDto", boardDto);//화면에 넘겨
        return "/WEB-INF/views/board/edit.jsp";
        
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute BoardDto boardDto) {
        boardDao.update(boardDto);
        return "redirect:detail?boardNo="+boardDto.getBoardNo();//수정한 게시글 번호 상세로 이동
    }
    
    
	
}