<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>포켓몬 통계</title>

    <!-- 구글 폰트 -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

    <!-- 내가 구현한 스타일 -->
    <link rel="stylesheet" type="text/css" href="../css/commons.css">
    <link rel="stylesheet" type="text/css" href="../css/test.css">

    <!-- font awesome 아이콘 CDN -->
    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">



    <style>

    </style>

    <!-- jquery CDN -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
    <!-- ChartJs CDN -->
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <!-- 내가 만든 스크립트 추가(jQuery를 사용했으니 jQuery CDN 아래 작성) -->
    <script src="commons.js"></script>
    <!-- javascript를 의도적을 head 자리에 배치해서 가장 먼저 실행되도록 구현 -->
    <script type="text/javascript">
        $(function(){
            //목표 : 서버에서 실제 데이터를 불러와서 그에 따른 차트를 구현
            $.ajax({
                url:"http://localhost:8080/rest/stat/pocketmon",
                method:"get",//파라미터가 없으면 get으로 사용해도 된다
                // data:{},//get일 때는 data를 못쓴다
                success:function(response){
                    //차트에 들어갈 수 있도록 데이터 구조 변경
                    //-JS의 배열은 자동 증가하며 추가 명령은 .push()이다.
                    var labelList = [];
                    var dataList = [];

                    for(var i=0; i < response.length; i++){
                        labelList.push(response[i].title);
                        dataList.push(response[i].count);
                    }

                    //완성된 labelList와 dataList를 이용하여 차트 생성하는 구문
                    var ctx = document.querySelector(".custom-chart");
                    
                    //new Chart(캔버스태그, 차트옵션객체);
                    new Chart(ctx, {
                        type: 'bar', //차트유형(bar, line, doughnut, pie)
                        data: { //차트에 표시될 정보
                            labels: labelList,
                            datasets: [
                                {
                                label: '포켓몬스터 수',//범례
                                data: dataList,//실제값
                                borderWidth: 5,
                                backgroundColor: ["#d6303133", "#fdcb6e33", "#ffeaa733", "#00b89433", "#74b9ff33", "#0984e333","#6c5ce733"],//33을 넣어서 투명도 설정
                                borderColor: ["#d63031", "#fdcb6e", "#ffeaa7", "#00b894", "#74b9ff", "#0984e3","#6c5ce7"]
                                }
                        ]
                        },
                        options: {
                            //데이터 범례(라벨)을 표시되지 않도록 하는 속성
                            plugins: {
                                legend: {
                                    display: false
                                }
                            },
                            // scales: {
                            //     y: {
                            //         beginAtZero: true//0을 차트의 시작점으로 할것인가?
                            //     }
                            // }
                        }
                    });
                }
            });


        })
    </script>
</head>

<body>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    <div class="container w-500">
        <div class="cell center">
            <h1>속성별 포켓몬 수</h1>
        </div>
        <div class="cell">
            <canvas class="custom-chart"></canvas>
        </div>
    </div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
</body>

</html>