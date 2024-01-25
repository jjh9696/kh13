<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 변경</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	
	<h1>개인정보 변경</h1>
	
	<form action="change" method="post">
		닉네임* <input type="text" name="memberNick" required value="${memberDto.memberNick }"> <br><br>
		이메일* <input type="email" name="memberEmail" required value="${memberDto.memberEmail }"><br><br>
		생년월일 <input type="date" name="memberBirth" value="${memberDto.memberBirth }"><br><br>
		연락처 <input type="tel" name="memberContact" value="${memberDto.memberContact }"><br><br>
		주소 <br> 
		<input type="text" name="memberPost" placeholder="우편번호" value="${memberDto.memberPost}" size="6" maxlength="6"><br>
		<input type="text" name="memberAddress1" placeholder="기본주소" value="${memberDto.memberAddress1}" size="50"><br>
		<input type="text" name="memberAddress2" placeholder="상세주소" value="${memberDto.memberAddress2}" size="50"><br><br>
		비밀번호 확인* <input type="password" name="memberPw" required> <br>
		<button>변경하기</button>
		
	</form>
	
	<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
</body>
</html>