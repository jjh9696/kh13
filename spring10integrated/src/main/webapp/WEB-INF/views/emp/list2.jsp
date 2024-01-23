<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<!--     <h1>직원 목록</h1> -->
    
<!-- <!--     검색 --> 
<!-- 	<form action="list" method = "get"> -->
<!-- 		<select name="column"> -->
<%-- 			<option value="emp_name" ${param.column == 'emp_name' ? 'selected' : ''}>이름</option> --%>
<%-- 			<option value="emp_dept" ${param.column == 'emp_dept' ? 'selected' : ''}>부서</option> --%>
<!-- 		</select> -->
<%-- 		<input type="search" name="keyword" value="${param.keyword}"> --%>
<!-- 		<button>검색</button> -->
<!-- 	</form> -->

<%-- 	<c:forEach var="dto" items="${requestScope.list}"> --%>
<!-- 		<h2> -->
<%-- 		번호 = ${dto.empNo} --%>
<%-- 		이름 = ${dto.empName} --%>
<%-- 		부서 = ${dto.empDept} --%>
<%-- 		입사일 = ${dto.empDate} --%>
<%-- 		급여 = ${dto.empSal} --%>
<!-- 		</h2> -->
		
<%-- 	</c:forEach> --%>
<!-- 위는 내가 쓴 코드 -->
<!-- 아래는 풀이 코드 -->

<%-- 페이지 제목 --%>
<c:choose>
	<c:when test="${isSearch}">
		<h1>사원 검색</h1>
	</c:when>
	<c:otherwise>
		<h1>사원 목록 <a href="insert"> +신규등록</a></h1>
	</c:otherwise>
</c:choose>

<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<%-- 
			EL은 문자열도 == 로 비교한다 (물론 equals도 가능)
			EL은 문자열을 쌍따옴표로 쓰건 외따옴표로 쓰건 상관하지 않는다
		 --%>
		<c:choose>
			<c:when test="${param.column == 'emp_name'}">
				<option value="emp_name" selected>사원명</option>
			</c:when>
			<c:otherwise>
				<option value="emp_name">사원명</option>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${param.column == 'emp_dept'}">
				<option value="emp_dept" selected>부서명</option>
			</c:when>
			<c:otherwise>
				<option value="emp_dept">부서명</option>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${param.column == 'emp_date'}">
				<option value="emp_date" selected>입사일</option>	
			</c:when>
			<c:otherwise>
				<option value="emp_date">입사일</option>
			</c:otherwise>
		</c:choose>
	</select>
	<input type="search" name="keyword" placeholder="검색어 입력" required
			value="${param.keyword}">
	<button>검색</button>
</form>

<%-- 목록 출력 --%>
<table border ="1">
	<thead>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>부서명</th>
			<th>입사일</th>
			<th>급여액</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.empNo}</td>			
			<td><a href="detail?empNo=${dto.empNo}">${dto.empName}</a> </td>			
			<td>${dto.empDept}</td>			
			<td>${dto.empDate}</td>			
			<td><fmt:formatNumber value="${dto.empSal}" pattern="#,##0"/>원</td>		
			<td><a href="detail?empNo=${dto.empNo}">이동</a></td>
			
			
		</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>