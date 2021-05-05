<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 고객의 소리 수정 값 입력할 페이지! -->
<%
	String id = (String)session.getAttribute("id");
%>
<html>
<head>
<meta charset="UTF-8">
<title>고객의 소리 수정하기</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<!-- header 테그 부분 전체를 복사해주세여 그리고 style.css도 교체해주세요 -->	
	
		<header><!-- HTML 레이아웃 중 하나인 header 부분에 메뉴를 생성 -->
			<nav id = "logo">	<!-- HTML 레이아웃중 하나인 nav 부분에 생성, id는 logo 로 지정해서 style.css에서 logo를 이용해 style을 만들어줌  -->
				<a href="MainPage.jsp"> <!-- 로고를 누르면 메인페이지를 갈수 있도록 하는 a 태그 생성 -->
					<img src="pictures/MainLogo.png" width="80" height="80">	<!-- 80x80짜리 경로를 따라서 이미지를 가져옴 -->
				</a>
			</nav> <!-- 로고 레이아웃 완료 -->
			
			<nav id = "menu" ><!-- menu라는 id를 가진 레이아웃을 생성 -->
				<table>	<!-- 테이블 생성 -->
					<tr>	<!-- 테이블의 한줄을 생성 -->
						<th colspan="4" style="text-align: right; height: 41px"> <!-- 4열이 합병되고 오른쪽 정렬, 높이가 41px인 테이블 헤더 생성 -->
							<% if( id == null) { %> <!-- 세션을 이용해 로그인이 되지 않고 있을 때 아래 구문을 수행 -->
								로그인을 해주세요.
							<% } else { %>	<!-- 로그인이 되었을 경우 아래 구문 수행 -->
							    <%= id %>님 환영합니다.<a href="Logout.jsp">로그아웃</a>	<!-- 로그인된 사용자의 아이디를 출력 -->
							<% } %>
						</th><!-- 테이블 헤더 완성 -->
					</tr><!-- 테이블의 한줄을 완성 -->
					<tr>
						<td><!-- 테이블 데이터 셀을 생성 -->
							<a class="menuLink" href="MainPage.jsp">메인페이지</a>	<!-- 세션을 이용해 메인페이지 셀을 눌렀을때 로그인된 아이디 값을 넘겨주면서 메인페이지로 감 -->
						</td><!-- 테이블 데이터 완성 -->
						<td>
							<a class="menuLink" href="MyPage.jsp">마이페이지</a>
						</td>
						<td>
							<a class="menuLink" href="ServiceMain.jsp">고객센터</a>
						</td>
						<td>
							<% if( id == null) {	%> <!-- 세션을 이용해 로그인이 되지 않았을때 로그인을 하기위해서 로그인페이지로 연결되는 데이터셀을 생성 -->
								<a class="menuLink" href="Login.jsp">로그인</a>
							<%} else {%>	<!-- 로그인이 성공 했을경우 로그아웃을 할 수 있게하는 로그아웃으로 연결되는 셀을 생성 -->
								<a class="menuLink" href="UserUpdate.jsp">회원 정보</a>
							<%} %>
						</td>						
					</tr>
				</table> <!-- 테이블 완성 -->
			</nav><!-- menu 레이아웃 완료 -->
		</header> <!-- 헤더 레이아웃 완료 -->
		
		<nav id="Content" style=""> <!-- 본문, 각 조원들이 넣게될 본문 레이아웃 생성 -->
			<div style="width:770px; background: white; padding-top: 5em; padding-left: 7em; background-clip: content-box;">
				<h3>고객의 소리 수정페이지</h3>
				<!-- 고객의 소리 등록시 입력값 받는 곳 -->
				<hr color="black">
				<form action="CsChangeSubmit.jsp">
					<!-- 수정 내용을 입력하기! -->
					게시글 번호 : <input name = "customer_no"><br>
					종류 : <select name = "customer_type">
					<option value = "좋아요">좋아요</option>
					<option value = "나빠요">나빠요</option>
					</select><br>
					제목 : <input name = "customer_title"><br>
					업소명 : <input name = "customer_accommodation_name"><br>
					내용 : <br>
					<textarea rows="10" cols="100" name="customer_content"></textarea><br>
					평점 : <select name = "customer_grade">
					<option value ="5">5</option>
					<option value ="4">4</option>
					<option value ="3">3</option>
					<option value ="2">2</option>
					<option value ="1">1</option>
					</select>
					
					<button>수정하기</button> <!-- 클릭으로 제출 디폴트값이 submit -->
				</form>
			</div>
		</nav> <!-- 본문 닫음 -->
</body>
</html>