<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	
	<h1>회원 가입</h1>
	
	<form action="join" method="post">
		아이디 <input type="text" name="memberId"> <br><br>
		비밀번호 <input type="text" name="memberPw"> <br><br>
		닉네임 <input type="text" name="memberNick"> <br><br>
		<button type="submit">회원가입</button>
	</form>
	
</body>
</html>