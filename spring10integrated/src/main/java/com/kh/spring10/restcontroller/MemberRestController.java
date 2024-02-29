package com.kh.spring10.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.MemberDto;

@RestController
@RequestMapping("/rest/member")
public class MemberRestController {

		@Autowired
		private MemberDao memberDao;
		
		@RequestMapping("/checkId")
		public String checkId(@RequestParam String memberId) {
			MemberDto memberDto = memberDao.selectOne(memberId);
			
			if(memberDto == null) {//DB에 없다면
				return "NNNNY";//사용 가능한 경우(DB)에 없는 경우
			}
			else {//DB에 있다면
				return "NNNNN";//사용 불가능한 경우(DB)에 있는 경우
			}
		}
		
		@RequestMapping("/checkMemberNick")
		public boolean checkMemberNick(@RequestParam String memberNick) {
			MemberDto memberDto = memberDao.selectOneByMemberNick(memberNick);
			return memberDto == null;

		}
}
