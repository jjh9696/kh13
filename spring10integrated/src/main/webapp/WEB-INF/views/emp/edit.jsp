<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

${dto}
    <h1>직원 정보 수정</h1>
    
    <form action="edit" method="post">
    	번호 : ${dto.empNo} <input type="hidden" name=empNo required value="${dto.empNo}"><br><br>
    	이름 <input type="text" name=empName required value="${dto.empName}"><br><br>
    	부서 <input type="text" name=empDept required value="${dto.empDept}"><br><br>
    	입사 <input type="date" name=empDate required value="${dto.empDate}"><br><br>
    	급여 <input type="number" name=empSal required value="${dto.empSal}"><br><br>
    	<button>정보 수정</button>
    </form>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
