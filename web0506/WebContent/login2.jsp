<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
	</head>
	<body>
		<h2>로그인 확인 화면입니다.</h2>
		<hr color="red">
		<!-- session.getAttribute("id") == null 이라는 것은 id이름으로 세션이 설정된 것이 없다라는 의미
				로그인이 안됨 -> 입력폼을 보여주어야 한다. -->
		<% if(session.getAttribute("id") == null) {%>
			<!-- form태그는 값을 입력하고 싶을 때 사용 -->
			<!-- 입력값들은 모두 form들어가야 한다. -->
			<!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
			<form action="check2.jsp">			
				아이디: <input name="id"><br>
				패스워드: <input name="pw"><br>			
				<button>로그인 확인</button>				
			</form>
		<%} else {%>
			<%= session.getAttribute("id") %> 님 환영합니다.<br>
			<a href="boardTest.jsp">
				<button type="button">게시판 글쓰로 가기</button>
			</a><br>
			<a href="logout.jsp">로그 아웃</a>
		<%} %>
	</body>
</html>