<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<c:choose>
	<c:when test="${dto != null}">
		<h1>메뉴 정보</h1>

		<table border="1" width="300">
			<tr>
				<th width="30%">번호</th>
				<td>${dto.menuNo}</td>
			</tr>
			<tr>
				<th>한글메뉴</th>
				<td>${dto.menuNameKor}</td>
			</tr>
			<tr>
				<th>영문메뉴</th>
				<td>${dto.menuNameEng}</td>
			</tr>
			<tr>
				<th>종류</th>
				<td>${dto.menuType}</td>
			</tr>
			<tr>
				<th>가격</th>
				<td><fmt:formatNumber value="${dto.menuPrice}" pattern="#,##0"/>원</td>
				
			</tr>
		</table>

		<%-- 다른 페이지로의 링크 --%>
		<h2><a href="list">목록보기</a></h2>
		<h2><a href="insert">신규등록</a></h2>
		<h2><a href="change?menuNo=${dto.menuNo}">수정하기</a></h2>
		<h2><a href="delete?menuNo=${dto.menuNo}">삭제하기</a></h2>
	</c:when>
	<c:otherwise>
		<h1>존재하지 않는 메뉴 번호</h1>
	</c:otherwise>
</c:choose>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>