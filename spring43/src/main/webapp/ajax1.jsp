<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() { // body 태그 안부터 ram에 읽어드려라 !! => DOM Tree
		$('#b1').click(function() {
			alert('b1 버튼을 클릭함!!!!')
			// location.href="http://www.naver.com"	//순서대로 Naver 홈페이지를 호출하는 대표적 방법
			//$.ajax()	//원할때 아무때나 특정한 페이지를 호출하는 방법 -> Ajax를 쓰더라도 주소가 필요하다.
			// 어디를 연결할지, 그 결과를 어떻게 할지
			// url 로 연결, success는 성공했을시
			$.ajax({
				url: "test.jsp",
				success: function(result) {
					alert('test page 연결 성공. !!!')
					alert('test.jsp의 결과는 ' + result)
				},
				error: function() {
					alert('test page 연결 실패. !!!')
				}
			})
		})
		$('#b12').click(function() {
			alert('b12를 클릭함.')
			$.ajax({
				url:"monday.jsp",
				success: function(result) {
					alert('monday.jsp의 결과는 >> ' + result)
				},
				error: function() {
					alert('monday page 연결 실패!!!!')	
				}
			})
		})
		$('#b13').click(function() {
			alert('b13를 클릭함.')
			$.ajax({
				url:"sunday", // spring 에서는 controller의 주소를 넣어주면 된다.
				success: function(result) {
					alert('sunday.jsp의 결과는 >> ' + result)
				},
				error: function() {
					alert('sunday page 연결 실패!!!!')	
				}
			})
		})
	}) // start
</script>
</head>
<body>
	<button id="b1">ajax 테스트</button>
	<hr>
	monday.jsp를 ajax로 호출해서 "월요일이다."를 받아와보자
	<button id="b12">월요일이다.</button>
	<hr>
	views 아래 있는 sunday.jsp를 ajax로 호출
	<button id="b13">일요일이다.</button>
	
</body>
</html>