<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬 정보</title>

<style>

	
</style>

</head>
<body>
	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<div class="container w-800">
		<div class="cell">
		    <h1>포켓몬 목록
		    	<a href="insert1">+신규등록</a>
		    </h1>
		</div>
    
	    <div class="cell">
		<!--     검색창 -->
			<form action ="list" method = "get">
				<select name="column">
					<option value="pocketmon_name">이름</option>
					<option value="pocketmon_type">속성</option> 
				</select>
				<input type="search" name="keyword" value="${param.keyword}">
				<button>검색</button>
			</form>
	    </div>
	    <div class="cell">
	    	<table class="table table-horizontal">
	    		<thead>
	    			<tr>
	    				<th>번호</th>
	    				<th>이름</th>
	    				<th>타입</th>
	    			</tr>
	    		</thead>
	    		<tbody class="center">
				<!--     for(PocketmonDto dto : list) -->
				    <c:forEach var="dto" items="${requestScope.list}">
				    <tr>
				    	<td>
					    	${dto.pocketmonNo}
				    	</td>
				    	<td>
				    		<a class="link link-animation" href="detail?pocketmonNo=${dto.pocketmonNo}">
					    		${dto.pocketmonName}
					    	</a>
				    	</td>
				    	<td>
					    	${dto.pocketmonType}
				    	</td>
				    	<%-- <td>
					    	<a href="detail?pocketmonNo=${dto.pocketmonNo}">이동</a>
				    	</td> --%>
				    </tr>
				    </c:forEach>
	    		</tbody>	
	    	</table>
	    </div>
    </div>
    <jsp:include page="/WEB-INF/views/template/navigator.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

</body>
</html>  