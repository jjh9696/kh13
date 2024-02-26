<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>제목을 설정하세요</title>

    <!-- 구글 폰트 -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

    <!-- 내가 구현한 스타일 -->
    <link rel="stylesheet" type="text/css" href="../css/commons.css">
    <link rel="stylesheet" type="text/css" href="../css/test.css">

    <!-- font awesome 아이콘 CDN -->
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
    

    <style>

    </style>
    
    <!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
    <script type="text/javascript">
        
        function checkEmpName() {
            var inputTarget = document.querySelector("[name=empName]");

            var regex = /^[가-힣]{2,7}$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpDept() {
            var inputTarget = document.querySelector("[name=empDept]");

            var regex = /^[가-힣a-zA-Z0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpDate() {
            var inputTarget = document.querySelector("[name=empDate]");

            var regex = /^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkEmpSal() {
            var inputTarget = document.querySelector("[name=empSal]");

            var regex = /^[0-9]+$/;
            var isValid = regex.test(inputTarget.value);

            inputTarget.classList.remove("success", "fail");
            inputTarget.classList.add(isValid ? "success" : "fail");
            return isValid;
        }
        function checkForm() {
            var isValid1 = checkEmpName();
            var isValid2 = checkEmpDept();
            var isValid3 = checkEmpDate();
            var isValid4 = checkEmpSal();
            return isValid1 && isValid2 && isValid3 && isValid4;
        }

    </script>
</head>
<body>

	<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	
	<%--
		절대경로
		<form action="/emp/insert2"></form>
		상대경로
		<form action="insert2"></form>	
	 --%>
	<form action="?" method="post" autocomplete="off" onsubmit="return checkForm()">
	    <div class="container w-500">
	        <div class="cell center">
	            <h1>사원 등록</h1>
	        </div>
	        <div class="cell">
	            <label>사원명</label>
	            <input type="text" name="empName" placeholder="(ex) 홍길동"
	                                            class="tool w-100" onblur="checkEmpName();">
	            <div class="success-feedback">이름이 형식에 맞습니다</div>
	            <div class="fail-feedback">올바른 이름을 작성하세요</div>
	        </div>
	        <div class="cell">
	            <label>부서명</label>
	            <input type="text" name="empDept" placeholder="(ex) 영업부"
	                                            class="tool w-100" onblur="checkEmpDept();">
	            <div class="fail-feedback">부서를 반드시 설정하세요</div>
	        </div>  
	        <div class="cell">
	            <label>입사일</label>
	            <input type="date" name="empDate" placeholder="(ex) 영업부"
	                                            class="tool w-100" onblur="checkEmpDate();">
	            <div class="fail-feedback">잘못된 날짜 형식입니다</div>
	        </div>
	        <div class="cell">
	            <label>급여액</label>
	            <input type="text" name="empSal" placeholder="(ex) 5000000"
	                                            class="tool w-100" onblur="checkEmpSal();">
	            <div class="fail-feedback">급여는 숫자로 작성하세요</div>
	        </div>
	        <div class="cell mt-30">
	            <button class="btn positive w-100">
	                <i class="fa-solid fa-plus"></i>
	                사원 등록
	            </button>
	        </div>        
	    </div>
	</form>

	<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

</body>
</html>