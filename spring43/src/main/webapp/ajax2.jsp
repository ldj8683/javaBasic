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
		num2 = ""
		$('#b2').click(function() {
			$.ajax({
				url:"money.jsp",
				data:{
					money: $('#money').val(),
					choice: $('#choice').val()
				},
				success: function(result) {
					alert('연결 성공 -> ' + result)
					//$('div').html(result)
				}
			})
		})
		
		$('#b3').click(function() {
			$.ajax({
				url:"check.jsp",
				data:{
					id: $('#id').val(),
				},
				success: function(result) {
					//$('div').html(result)
				}
			})
		})
		
		$('#b4').click(function() {
			$.ajax({
				url:"tel.jsp",
				data:{
					tel: $('#tel').val(),
				},
				success: function(result) {
					num2 = result.trim()
					alert('인증 번호는 >> ' + result)
					$('div').html(result)
				}
			})
		})				
		$('#b5').click(function() {
			num =$('#num').val()
			if(num == num2){
				alert('본인인증 확인 성공')
				$('div').html('본인인증 확인 성공')
			} else {
				alert('본인인증 확인 실패')
				$('div').html('본인인증 확인 실패')
			}
		})
	})
</script>
</head>
<body>
	<hr color="blue">
	결제 금액: <input id="money"><br>
	결제 수단: 1)계좌이체, 2)신용카드, 3)휴대폰 결제 <input id="choice">
	<button id="b2">결제하기(money.jsp)</button>
	<hr color="red">
	회원가입할 id 입력 : <input id="id">
	<button id="b3">id 중복체크(check.jsp)</button>
	<hr color="green">
	인증받을 전화번호 입력: <input id="tel">
	<button id="b4">인증번호 받기(tel.jsp)</button><br>
	인증받을 숫자 입력 : <input id="num">
	<button id="b5">인증번호 확인</button>
	<hr color="black">
	<div style="font-size: 40px; font-family: bold; background: pink; color: blue;"></div>
</body>
</html>