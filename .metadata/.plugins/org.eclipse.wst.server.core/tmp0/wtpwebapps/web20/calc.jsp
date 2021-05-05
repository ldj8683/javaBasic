<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src='js/out2.js'></script> <!-- 텍스트중 자바 스크립트를 쓰겠다는 의미 -->
	<script type="text/javascript">
		s1 = prompt('계산 하고 싶은 숫자 1을 입력하세요')
		s2 = prompt('계산 하고 싶은 숫자 2를 입력하세요')
		
		n1 = parseInt(s1)
		n2 = parseInt(s2)
	</script>
</head>
<body>
	<button type="button" onclick="add(n1,n2)">덧셈</button><br>
	<button type="button" onclick="minus(n1,n2)">뺄셈</button><br>
	<a href="calc.jsp"><button type="button">다시하기</button></a>
</body>
</html>