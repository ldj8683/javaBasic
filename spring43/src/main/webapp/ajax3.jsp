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
		// 1. b1을 클릭했을 때
		// 2. tel에 입력한 값을 가져와야함
		// 3. mvc2에서는 controller에서 내가 넘긴 값을 받아서 다음처리를 진행하게 함
		// 4. ajax의 url은 컨ㅌ트롤러의 requestMapping과 동일해야함.
		$('#b1').click(function() {
			telVal = $('#tel').val()
			$.ajax({
				url: "text",
				data:{
					tel : telVal
				},
				success: function(x) {
					$('#result').html('<h3>' + x +'</h3>')
				}
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			numVal = $('#num').val()		// val은 인풋일경우에쓴다
			num2Val = $('#result').text()	// 테그 사이에 낀 값은 text로 가져온다
			if(numVal == num2Val){
				alert('문자 인증에 성공해서 본인 인증 성공!!!')
			}else{
				alert('문자 인증에 실패해서 본인 인증 실패!!!')
			}
		})
	})//start
</script>
</head>
<body>
	인증받을 전화번호: <input id="tel"><input id="b1" type="button" value="인증번호 받기"><br>
	인증받은 번호로 본인 확인: <input id="num"><input id="b2" type="button" value="인증번호 확인">
	<hr color="red">
	<div id="result" style="font-size: 40px; font-family: bold; background: pink; color: blue;"></div>
</body>
</html>