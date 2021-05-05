<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#btn1').click(function() { //btn1 버튼을 누르면 실행
			mTitleVal = $('#mTitle').val() 	// mTitle 아이디를 가진 input 태그 데이터를 가져옴
			mPriceVal = $('#mPrice').val() // mPrice 아이디를 가진 input 태그 데이터를 가져옴
			$.ajax({			// ajax 실행
				url: "movie2",	// 가상의 주소 movie2 를 이용해서 MovieController에서 requestMapping해서 연결
				data:{			// 입력받은 데이터를 변수에 저장
					mTitle : mTitleVal,
					mPrice : mPriceVal
				},			
				success: function(x) {// 성공시 result 아이디를 가진 div 테그에 출력
					$('#result').html('<h3>' + x +'</h3>')
				}
			})//ajax
		})//btn
	})//start
</script>
</head>
<body>
	영화 제목 > <input id="mTitle"><br>
	영화 관람료 > <input id="mPrice"><br>
	<input id="btn1" type="button" value="확인">
	<hr color="blue">
	<!-- 출력 되는부분 -->
	<div id="result" style="font-size: 40px; font-family: bold; background: pink; color: blue;"></div>
</body>
</html>