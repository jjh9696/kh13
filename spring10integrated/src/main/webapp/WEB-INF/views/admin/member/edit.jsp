<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    
    <%--
    	추가로 전달할 정보 - 아이디(hidden)
    	수정할 정보 - 닉네임, 이메일, 생년월일, 연락처, 주소, + (등급, 포인트)
     --%>
    <div class="container w-500">
    	<div class="cell center">
		    <h1>회원 정보 수정</h1>
    	</div>
	    <form action="edit" method="post">
	    	<input type ="hidden" name = "memberId" value = "${memberDto.memberId }" required>
	    	<div class="cell">
	    		닉네임<span style="color:red">*</span>
		    	<input class="tool w-100" type ="text" name = "memberNick" value = "${memberDto.memberNick }" required>
	    	</div>
	    	<div class="cell">
	    		이메일<span style="color:red">*</span> 
	    		<input class="tool w-100" type ="email" name = "memberEmail" value = "${memberDto.memberEmail }" required>
	    	</div>
	    	<div class="cell">
	    		연락처 <input class="tool w-100" type ="tel" name = "memberContact" value = "${memberDto.memberContact }" >
	    	</div>
	    	<div class="cell">
	    		생년월일 <input class="tool w-100" type ="date" name = "memberBirth" value = "${memberDto.memberBirth }" >
	    	</div>
	    	<div class="cell">
	    		주소 
	    	</div>
	    	<div class="cell">
	    		<input class="tool w-100" type ="text" name = "memberPost" value = "${memberDto.memberPost }" placeholder="우편번호" >
	    	</div>
	    	<div class="cell">
	    		<input class="tool w-100" type ="text" name = "memberAddress1" value = "${memberDto.memberAddress1 }" placeholder="기본주소">
	    	</div>
	    	<div class="cell">
	    		<input class="tool w-100" type ="text" name = "memberAddress2" value = "${memberDto.memberAddress2 }" placeholder="상세주소">
	    	</div>
	    	<div class="cell">
		    	등급 
		    	<select class="tool w-100" name="memberLevel" required>
		    		<option value="">선택하세요</option>
		    		<option value="일반회원" ${memberDto.memberLevel=='일반회원' ? 'selected' : '' }>일반회원</option>
		    		<option value="우수회원" ${memberDto.memberLevel=='우수회원' ? 'selected' : '' }>우수회원</option>
					<option value="관리자" ${memberDto.memberLevel=='관리자' ? 'selected' : '' }>관리자</option>	
		    	</select>
	    	</div>
	    	<div class="cell">
	    		포인트 <input class="tool w-100" type ="number" name = "memberPoint" value = "${memberDto.memberPoint }" >
	    	</div>
	    	<div class="cell right">
	    		<button class="btn positive ">변경</button>
	    	</div>
	    </form>
    </div>
    
    
    
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>