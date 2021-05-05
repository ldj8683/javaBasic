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
			$('#btn1').click(function() {
				$.ajax({
					url:"fruit",
					success: function(x) {
						$('#result').html(x)
					}
				})//ajax
			})//btn1
			$('#btn2').click(function() {
				$.ajax({
					url:"tour",
					success: function(x) {
						$('#result').html(x)
					}
				})//ajax
			})//btn2
		})
	</script>
</head>
<body>
	<input id="btn1" type="button" value="과일 목록">
	<input id="btn2" type="button" value="여행 목록">
	<hr color="red">
	<div id="result"></div>
</body>
</html>