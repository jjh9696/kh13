package com.kh.spring19.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @Builder @NoArgsConstructor @AllArgsConstructor 
@ToString(exclude = {"memberPw"})
public class MemberDto {
	//필드
		private String memberId;//회원아이디
		private String memberPw;//회원비밀번호
		private String memberNick;//회원닉네임
		private String memberBirth;//회원생년월일
		private String memberContact;//회원연락처
		private String memberEmail;//회원이메일
		private String memberPost;//주소(우편번호)
		private String memberAddress1;//주소(기본주소)
		private String memberAddress2;//주소(상세주소)
		private String memberLevel;//회원등급(일반회원/우수회원/관리자)
		private int memberPoint;//회원포인트
		private Date memberJoin;//가입일시
		private Date memberLogin;//로그인일시
		public String getMemberId() {
			return memberId;
		}

		public String getMemberBirthStr() {
			if(memberBirth==null)return "";
			return memberBirth;
		}

		public String getMemberContactStr() {
			if(memberContact==null)return "";
			return memberContact;
		}

		public String getMemberPostStr() {
			if(memberPost==null)return "";
			return memberPost;
		}

		public String getMemberAddress1Str() {
			if(memberAddress1==null)return "";
			return memberAddress1;
		}

		public String getMemberAddress2Str() {
			if(memberAddress2==null)return "";
			return memberAddress2;
		}
		
		public String getMemberLoginStr() {
			if(memberLogin == null)
				return "";
			else 
				return memberLogin.toString();
		}
}