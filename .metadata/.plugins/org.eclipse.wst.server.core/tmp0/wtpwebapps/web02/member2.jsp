<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 톰킷에게 알려준다. -->
<!-- 서버에서 실행되는 코드가 필요하다 -->
<!-- 클라이언트가 입력한 정보를 받아주는 코드가 필요하다 -->
<!-- java tag는 %로 시작한다 -->
	<%
		// 클라이언크가 입력한 정보를 서버에서 받아주는 클래스가 있다.
		// 하지만 여기서 사용할 클래스는 HttpServletReques인데 톰킷에서 해결을 해준다.
		// 데이터들이 톰킷으로 갔다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		
		/* db에 넣을 수 있는 부품을 만들어서 데이터를 주어서 넣으라고 처리함*/
	%>




<!-- html은 요청한 처리 결과를 클라이언트에게 알려주기 위한 html 화면
			==> html 부분이 클라이언트로 전송되고 끝남 -->
<!-- 입력받은 데이터가 넘어오면 아래와 같은 데이터가 전송된다 -->
<!-- http://localhost:8888/web02/member2.jsp?id=root&pw=1234&name=park&tel=011 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료</title>
</head>
<body>
	<h3>회원 가입이 잘 되었습니다.</h3>
	<hr>
	당신이 입력한 id: <%= id %><br>
	당신이 입력한 pw: <%= pw %><br>
	당신이 입력한 name: <%= name %><br>
	당신이 입력한 tel: <%= tel %><br>
	
	<a href = "member.html"> 회원가입 화면으로 </a>
	
</body>
</html>