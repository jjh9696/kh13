<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Javascript 예제</title>

    <!-- 구글 폰트 -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

    <!-- 내가 구현한 스타일 -->
    <link rel="stylesheet" type="text/css" href="../css/commons.css">
    <!-- <link rel="stylesheet" type="text/css" href="../css/test.css"> -->

    <!-- font awesome 아이콘 CDN -->
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
    

    <style>
    	.title{
    		color: #0984e3;
    	}
		a{
            text-decoration: none;
            color: #74b9ff;
        }
    </style>
    
    <!-- javascript를 의도적으로 head 자리에 배치해서 가장 먼저 실행되도록 구현-->
    <script type="text/javascript">
    	
    	
    
   	</script>
</head>
<body>
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	<div class="container w-300 title">
        <div class="cell">
		    <h1>포켓몬스터 등록 완료!</h1>
		</div>
		<div class="cell">
		    <h2><a href="list">
		    <i class="fa-solid fa-list"></i>
		    목록보기
		    </a></h2>
	    </div>
	    <div class="cell">
		    <h2><a href="insert1">
		    <i class="fa-solid fa-floppy-disk"></i>
		    다시 등록하기
		    </a></h2>	
		</div>	    
	</div>
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
    
</body>
</html>