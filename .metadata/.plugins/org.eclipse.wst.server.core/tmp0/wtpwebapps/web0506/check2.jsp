<%@page import="shop.MemberDb"%>
<%@page import="shop.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    	// request 처럼 미리 객체를 생성해서 제공하고 있는 객체:빌트인
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	MemberDb db = new MemberDb();	// db라는 변수에는 참조형 변수라 주소 값이 들어있고 MemberDb라는 객체가 생성
    	boolean result = db.check(id, pw); // 총 3단계 : boolean 변수 result를 만들고, check를 수행 한 뒤, 결과를 result에 넣는다.
    	
    	// 로그인이 성공을 한 경우, id를 사이트 내에 여러 페이지를 쓸 수 있도록 설정.
    	// 세션이 유지되는 동안 쓸 수 있도록 해야함.
    	// 성공, 실패가 나뉘어 있기 때문에 성공을 한 경우만 if문을 준다.
    	if(result){
    		session.setAttribute("id", id);//(세션의 이름, 세션의 값(위에 입력받은 세션의 값))
    	}
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과는 <%= result %>
<br>
<a href="login2.jsp">로그인 페이지로</a>
</body>
</html>