<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹소켓 실습 프로젝트</title>
</head>
<body>

	<h1>웹소켓 실습 프로젝트</h1>
	
	<c:choose>
		<c:when test="${sessionScope.loginId != null}">
			<h2><a href="logout">로그아웃</a></h2>
		</c:when>
		<c:otherwise>
			<form action="login" method="post">
				<input type="text" name="memberId">
				<input type="password" name="memberPw">
				<button type="submit">로그인</button>
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>