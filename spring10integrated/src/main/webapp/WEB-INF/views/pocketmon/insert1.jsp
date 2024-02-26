<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>제목을 설정하세요</title>
     

    <style>

    </style>
    
    <!-- jquery CDN -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
    <!-- 내가 만든 스크립트 추가(jQuery를 사용했으니 jQuery CDN 아래 작성) -->
    <script src="commons.js"></script>
    <!-- javascript를 의도적을 head 자리에 배치해서 가장 먼저 실행되도록 구현 -->
    <script type="text/javascript">
        $(function(){
            //상태객체
            var state = {
                //key:value(function)
                pocketmonNoValid : false,
                pocketmonNameValid : false,
                pocketmonTypeValid : false,
                ok : function(){
                    return this.pocketmonNoValid 
                        && this.pocketmonNameValid 
                        && this. pocketmonTypeValid;
                }
            };

            $(".check-form").submit(function(){
                // $("[name=pocketmonNo], [name=pocketmonName], [name=pocketmonType]").blur(function)
                //find()는 내부에 있는 모든 태그를 탐색한다 (후손선택자와 동일한 효과)
                $(this).find("[name]").blur();
                console.table(state);//객체 출력 구문
                return state.ok();
            });

            $("[name=pocketmonNo]").blur(function(){
                var regex = /^[0-9]+$/;
                state.pocketmonNoValid = regex.test($(this).val());
                $(this).removeClass("success fail")
                        .addClass(state.pocketmonNoValid ? "success" : "fail");
            });
            $("[name=pocketmonName]").blur(function(){
                var regex = /^[가-힣]+$/;
                state.pocketmonNameValid= regex.test($(this).val());
                $(this).removeClass("success fail")
                        .addClass(state.pocketmonNameValid ? "success" : "fail");
            });
            $("[name=pocketmonType]").blur(function(){
                state.pocketmonTypeValid = $(this).val().length > 0;
                $(this).removeClass("success fail")
                        .addClass(state.pocketmonTypeValid ? "success" : "fail");
            });
        });
    </script>
</head>
<body>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    

<%--
	생성해야 하는 주소 형태
	http://localhost:8080/pocketmon/insert2
	?pocketmonNo=1&pocketmonName=피카츄&pocketmonType=전기

	폼(절대경로)
	<form action="/pocketmon/insert2">
	
	폼(상대경로)
	<form action="insert2">
--%>

    <form action="insert2" method="post" autocomplete="off" class="check-form">
        <div class="container w-400">
            <div class="cell center">
                <h1>포켓몬스터 등록</h1>
            </div>
            <div class="cell">
                <label>
                    번호
                    <i class="fa-solid fa-asterisk red"></i>
                </label>
                <input type="text" name="pocketmonNo" 
                            placeholder="(ex) 1" class="tool w-100">
                <!-- <div class="success-feedback"></div> -->
                <div class="fail-feedback">번호를 반드시 작성하세요</div>
            </div>  
            <div class="cell">
                <label>
                    이름
                    <i class="fa-solid fa-asterisk red"></i>
                </label>
                <input type="text" name="pocketmonName" 
                                placeholder="(ex) 이상해씨" class="tool w-100">
                <!-- <div class="success-feedback"></div> -->
                <div class="fail-feedback">이름을 반드시 작성하세요</div>
            </div>
            <div class="cell">
                <label>
                    속성
                    <i class="fa-solid fa-asterisk red"></i>
                </label>
                <select name="pocketmonType" class="tool w-100">
                    <option value="">선택하세요</option>
                    <option value="풀">풀</option>
                    <option value="불꽃">불꽃</option>
                    <option value="물">물</option>
                    <option value="전기">전기</option>
                    <option value="독">독</option>
                    <option value="비행">비행</option>
                    <option value="무속성">무속성</option>
                </select>
                <div class="fail-feedback">반드시 속성을 선택해야 합니다</div>
            </div>
            <div class="cell">
                <button class="btn positive w-100">
                    <i class="fa-solid fa-floppy-disk"></i>
                    등록
                </button>
            </div>
        </div>
    </form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

</body>
</html>

    

<!-- 	<form action="insert2">
		번호 : <input name="pocketmonNo"> <br> <br>
		이름 : <input name="pocketmonName"> <br> <br>
		속성 : <input name="pocketmonType"> <br> <br>
		<button>등록</button>
-->
		
		