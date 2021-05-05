<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() { // body 태그 안부터 ram에 읽어드려라 !! => DOM Tree
		$('#b1').click(function() {
			$.ajax({
				url: "all2",
				success: function(result) {
					alert('all2연결 성공')
					console.log('결과>>' + result)
				},
				error: function() {
					alert('all2연결 실패')
				}
			
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url: "all2",
				success: function(result) {
					alert('all2연결 성공')
					console.log('결과>>' + result)
					$(result).each(function(index, vo) {
						console.log(index, vo)
						
					})
				},
				error: function() {
					alert('all2연결 실패')
				}
			
			})
		})
	}) // start
</script>
</head>
<body>
	<button id="b1">String으로 controll에서 받아보자</button>
	<hr>
	<button id="b2">json으로 받아보자</button>
	
</body>
</html>