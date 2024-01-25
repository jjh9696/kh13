<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>학생 목록 <a href="add">+신규등록</a></h1>

<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<option value="student_id" ${param.column == 'student_id' ? 'selected' : ''}>학생번호</option>
		<option value="name" ${param.column == 'name' ? 'selected' : ''}>학생이름</option>
	</select>
	<input type="text" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	<button>검색</button>
</form>

<%-- 목록 출력 --%>
<table border="1">
	<thead>
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>국어점수</th>
			<th>수학점수</th>
			<th>영어점수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="studentDto" items="${list}">
		<tr>
			<td>${studentDto.studentId}</td>
			<td>
				<a href="detail?studentId=${studentDto.studentId}">${studentDto.name}</a>
			</td>
			<td>${studentDto.koreanScore}</td>
			<td>${studentDto.mathScore}</td>
			<td>${studentDto.englishScore}</td>
		</tr>
		</c:forEach>
	</tbody>	
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
</body>
</html>