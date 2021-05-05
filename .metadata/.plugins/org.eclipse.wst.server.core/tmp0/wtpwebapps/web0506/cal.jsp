<%@page import="shop.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. n1, n2 값을 받아주어야함. -->    
    <!-- 2. n1, n2를 정수로 바꾸어주어야함. -->
    <!-- 3. 계산기에게 두 개를 더해달라고 해야함. -->
    <!-- 4. 더한 반환 값을 받아와서 클라이언트에 전송(html 만든 후 전송) -->
    <%
    	// 1. n1, n2 값을 받아주어야함.
    	String n1 = request.getParameter("n1"); // 첫번째 수를 받아옴
    	String n2 = request.getParameter("n2"); // 두번째 수를 받아옴
    	
    	// 2. n1, n2를 정수로 바꾸어주어야함.
    	int s1 = Integer.parseInt(n1);
    	int s2 = Integer.parseInt(n2);
    	
    	// 3. 계산기에게 두 개를 더해달라고 해야함.
    	Calculator cal = new Calculator();
    	int resultAdd = cal.add(s1, s2);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 4. 더한 반환 값을 받아와서 클라이언트에 전송(html 만든 후 전송) -->
당신의 두 수의 합은 <%= resultAdd %>

</body>
</html>