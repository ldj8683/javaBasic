<%@page import="book.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 책삭제.jsp에서 받은 데이터를 title 변수에 저장
	String title = request.getParameter("title");

	// delete함수를 사용할 수 있도록 db 생성
	BookDAO db = new BookDAO();
	// delete 실행해서 db에서 title에 맞는 데이터 삭제
	db.delete(title);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 삭제 확인</title>
</head>
<body>
	<h2>책 삭제 확인 화면입니다.</h2>
	<hr color="red">
	<!-- 어떠한 책 이 삭제 되었는지 확인 -->
	책 <%= title %>의 삭제가 완료 되었습니다.
	<!-- 책삭제.jsp로 돌아가는 버튼 생성 -->
	<a href="책삭제.jsp">
		<button>돌아가기</button>
	</a>
</body>
</html>