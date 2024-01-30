<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <table border="1" width="500" >
		<tr>
			<th>${boardDto.boardTitle}</th>
		</tr>    
		<tr>
			<td>
<!-- 			탈퇴한 사용자일때, 아닐때 -->
			<c:choose>
				<c:when test="${boardDto.boardWriter == null }">
					${boardDto.boardWriterStr }
				</c:when>
				<c:otherwise>
					${memberDtp/memberNick}
					(${memberDtp/memberLevel})
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td>${boardDto.boardWriter}</td>
		</tr>    
    	<tr height="200" valign="top">
    		<td> ${boardDto.boardContent }</td>
    	</tr>
    	<tr>
    		<td>
    			조회수 ${boardDto.boardReadCount}  <br>
    			<fmt:formatDate value="${boardDto.boardWtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
    		</td>
    	</tr>
    </table>
    
    <a href="write">글 작성</a>
    <a href="edit?boardNo=${boardDto.boardNo }">글 수정</a>
    <a href="delete?boardNo=${boardDto.boardNo }">글 삭제</a>
    
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>