<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 삭제</title>
	</head>
	<body>
		<h2>게시판 삭제 화면입니다.</h2>
		<hr color="red">
		<!-- form태그는 값을 입력하고 싶을 때 사용 -->
		<!-- 입력값들은 모두 form들어가야 한다. -->
		<!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
		<form action="boardDbConnect3.jsp">			
			아이디: <input name="id"><br>			
			<button>게시판 삭제</button>				
		</form>
	</body>
</html>