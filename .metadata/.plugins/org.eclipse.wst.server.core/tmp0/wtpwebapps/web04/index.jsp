<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>계산기를 만들어 봅시다.</h3>
		<hr>
		<h4>더하기</h4>
		<form action="cal.jsp">
			숫자1 : <input name="n1"><br>
			숫자2 : <input name="n2"><br>
			<button type="submit">서버로 전송</button>
		</form>
		<hr>
		<h4>곱하기</h4>
		<form action="cal2.jsp">
			숫자1 : <input name="n1"><br>
			숫자2 : <input name="n2"><br>
			<button type="submit">서버로 전송</button>
		</form>	
		<hr>
	</body>
</html>