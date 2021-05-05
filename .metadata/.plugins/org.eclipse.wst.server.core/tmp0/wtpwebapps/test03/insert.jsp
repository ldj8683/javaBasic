<%@page import="book.BookVO"%>
<%@page import="book.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 책등록.jsp의 입력창에서 받아온 데이터를 저장, 각 입력창의 name에 맞는곳으로 들어가게됨
	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String story = request.getParameter("story");
	String company = request.getParameter("company");
	
	// create를 사용할 수 있도록 db를 생성
	BookDAO db = new BookDAO();
	// 하나로 묶기위해서 bag를 생성
	BookVO bag = new BookVO();
	
	// 생성된 bag에 책등록.jsp에서 받아온 데이터들을 집어 넣음
	bag.setId(id);
	bag.setTitle(title);
	bag.setStory(story);
	bag.setCompany(company);
	
	// bag에 저장된 데이터를 가지고 create를 이용해서 db에 등록
	db.create(bag);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록 확인 화면 입니다.</title>
</head>
<body>
	<h2>책 등록 확인 화면입니다.</h2>
	<hr color="red">
	<!-- 위의 title, company 변수를 이용해서 어떤 출판사의 책이 등록되었는지 요약해 보여줌 -->
	<%= company %> 출판사의 책 <%= title %> 등록이 완료 되었습니다.
	<!-- 등록화면으로 돌아감 -->
	<a href="책등록.jsp">
		<button>돌아가기</button>
	</a>
</body>
</html>