<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:choose>
	<c:when test="${dto != null}">
		<h1>사원 정보</h1>
		
		<table border="1" width="300">
			<tr>
				<th width="30%">번호</th>
				<td>${dto.empNo}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${dto.empName}</td>
			</tr>
			<tr>
				<th>부서</th>
				<td>${dto.empDept}</td>
			</tr>
			<tr>
				<th>입사일</th>
				<td>${dto.empDate}</td>
			</tr>
			<tr>
				<th>급여</th>
				<td><fmt:formatNumber value="${dto.empSal}" pattern="#,##0"/>원 </td>
			</tr>
		</table>
<!--다른페이지 링크 -->
		<h2><a href="list">목록보기</a></h2>
		<h2><a href="insert">신규등록</a></h2>
		<h2><a href="edit?empNo=${dto.empNo}">수정하기</a></h2>
		<h2><a href="delete?empNo=${dto.empNo}">삭제하기</a></h2>
	</c:when>
	<c:otherwise>
		<h1>존재하지 않는 사원 번호</h1>
	</c:otherwise>
</c:choose>
