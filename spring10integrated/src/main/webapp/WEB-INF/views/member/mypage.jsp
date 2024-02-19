<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지</title>

<style>

	
</style>

</head>
<body>
	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	
	<div class="container w-1000">
	<div class="cell">
		<h3>${memberDto.memberId}님의 페이지</h3>
	</div>
	<div class="cell floating-cell">
		<div class="image-wrapper w-25 center">
			<img src="image" width="200" height="200">
			<h2><a class="link" href="/member/password">비밀번호 변경</a></h2>
			<h2><a class="link" href="/member/change">개인정보 변경</a></h2>
			<h2><a class="link" href="/member/exit">회원 탈퇴</a></h2>
		</div>
		
		<div class="infotm-wrapper w-75">
			<div class="cell">
				<h3>가입정보</h3>
			</div>
			<table class="table table-horizontal">
				<tr>
					<th width="25%">닉네임</th>
					<td>${memberDto.memberNick}</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>${memberDto.memberBirth}</td>
				</tr>
				<tr>
					<th>연락처</th>
					<td>${memberDto.memberContact}</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td>${memberDto.memberEmail}</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
						[${memberDto.memberPost}]
						${memberDto.memberAddress1}
						(${memberDto.memberAddress2})
					</td>
				</tr>
				<tr>
					<th>회원등급</th>
					<td>${memberDto.memberLevel}</td>
				</tr>
				<tr>
					<th>회원포인트</th>
					<td>${memberDto.memberPoint}</td>
				</tr>
				<tr>
					<th>가입일시</th>
					<td>
						<fmt:formatDate value="${memberDto.memberJoin}"
							pattern="y년 M월 d일 H시 m분 s초"/>
					</td>
				</tr>
				<tr>
					<th>로그인일시</th>
					<td>
						<fmt:formatDate value="${memberDto.memberLogin}"
							pattern="y년 M월 d일 H시 m분 s초"/>
					</td>
				</tr>
			</table>
			
			<h1>
				포인트 구매 내역 &nbsp;&nbsp;
				<a class="link" href="/point/charge">
				<i class="fa-solid fa-credit-card"></i>
				추가구매
				</a>
			</h1>

			<table class="table table-horizontal">
				<thead>
					<tr>
						<th>번호</th>
						<th>상품명</th>
						<th>수량</th>
						<th>구매금액</th>
						<th>구매일시</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="buyDto" items="${buyList}">
					<tr>
						<td>${buyDto.buySerial}</td>
						<td>${buyDto.itemName}</td>
						<td>${buyDto.buyQty}</td>
						<td>
							<fmt:formatNumber value="${buyDto.buyTotal}" pattern="#,##0"/>
						</td>
						<td>
							<fmt:formatDate value="${buyDto.buyTime}" pattern="yyyy-MM-dd HH:mm"/>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</div>
</div>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
</body>
</html>