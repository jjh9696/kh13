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

import com.kh.spring10.dao.BuyDao;
import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dao.Menudao;
import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.MemberDto;
import com.kh.spring10.vo.StatVO;


//관리자가 이용할 수 있는 기능을 제공하는 컨트롤러
@Controller
@RequestMapping("/admin")
public class AdminController {

	
	
	@Autowired
	private BuyDao buyDao;
	
	@Autowired
	private PocketmonDao pocketmonDao;
	//포켓몬스터 통계
	@RequestMapping("/stat/pocketmon")
	public String statPocketmon(Model model) {
		List<StatVO> list = pocketmonDao.statByType();
		model.addAttribute("list",list);
		return "/WEB-INF/views/admin/stat/pocketmon.jsp";
	}
	
	@Autowired
	private EmpDao empDao;
	//사원 통계
	@RequestMapping("/stat/emp")
	public String statEmp(Model model) {
		List<StatVO> list = empDao.statByDept();
		model.addAttribute("list",list);
		return "/WEB-INF/views/admin/stat/emp.jsp";
	}
	
	@Autowired
	private Menudao menuDao;
	//메뉴 통계
	@RequestMapping("/stat/menu")
	public String statMenu(Model model) {
		List<StatVO> list = menuDao.statByType();
		model.addAttribute("list",list);
		return "/WEB-INF/views/admin/stat/menu.jsp";
	}
	
	@Autowired
	private MemberDao memberDao;
	//회원 통계
	@RequestMapping("/stat/member")
	public String statMember(Model model) {
		List<StatVO> list = memberDao.statByLevel();
		model.addAttribute("list",list);
		return "/WEB-INF/views/admin/stat/member.jsp";
	}
	
	//회원 관리 페이지
	@RequestMapping("/member/search")
	public String memberSearch(@RequestParam(required = false)String column,
						@RequestParam(required = false)String keyword,
						Model model) {
		//원래는 컬럼과 키워드가 없으면 목록을 출력했으나 지금은 아니다
		boolean isSearch = column != null && keyword != null;
		if(isSearch) {
			//지정한 항목에서만 검색이 가능하도록 구현
			switch(column) {
//			case "member_id", "member_nick", "member_contact", "member_email","member_birth":
			case "member_id": case "member_nick": case "member_contact": case "member_email": case "member_birth":
				List<MemberDto> list = memberDao.selectList(column, keyword);
				model.addAttribute("list", list);
			}
		} 
		return "/WEB-INF/views/admin/member/search.jsp";
	}
	
	//회원 상세 페이지
	@RequestMapping("/member/detail")
	public String memberDetail(@RequestParam String memberId, Model model) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto", memberDto);
		//회원의 구매내역을 첨부
		model.addAttribute("buyList", buyDao.selectList(memberId));
		return "/WEB-INF/views/admin/member/detail.jsp";
	}
	
	//회원 강제 탈퇴 페이지
	@GetMapping("/member/delete")
	public String memberDelete(@RequestParam String memberId) {
		memberDao.delete(memberId);
		return "redirect:/admin/member/search";
//		return "redirect:search";
	}
	
	//회원 정보 수정 페이지
	@GetMapping("/member/edit")
	public String memberEdit(@RequestParam String memberId, Model model) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto", memberDto);
		return "/WEB-INF/views/admin/member/edit.jsp";
	}
	
	@PostMapping("/member/edit")
	public String memberEdit(@ModelAttribute MemberDto memberDto, Model model) {
		memberDao.updateMemberByAdmin(memberDto);
		
//		return "redirect:/admin/member/detail?memberId="+memberDto.getMemberId();
		return "redirect:detail?memberId="+memberDto.getMemberId();
	}
	
	
}
