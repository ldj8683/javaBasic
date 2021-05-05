<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자동차 차량 등록여부 확인</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#btn2').click(function() {
				$.ajax({
					url: "resources/data/PROJECT_MOCK_DATA.json",
					success: function(json) {
						alert('Json 연결 성공.!!! ---> ' + json.length)
						$(json).each(function(index, userInfo) {
							userid = userInfo.USERID
							upw = userInfo.UPW
							uname = userInfo.UNAME
							uaddr = userInfo.UADDR
							utel = userInfo.UTEL
							uemail = userInfo.UEMAIL
							ubirth = userInfo.UBIRTH
							ugender = userInfo.UGENDER
							console.log(userid, upw, uname, uaddr, utel, uemail, ubirth, ugender)
							$.ajax({
								url: "insertUserId",
								data:{
									userid : userid,
									upw : upw,
									uname : uname,
									uaddr : uaddr,
									utel : utel,
									uemail : uemail, 
									ubirth : ubirth,
									ugender : ugender
								},
								success: function(result) {
									console.log(result)
								}
							})
						})
					}
				})
			})
			
		})//start($function)
	</script>
</head>
<body>
	<h2>JSON MOCK 데이터 등록</h2>
	<hr color="blue">
	<button id="btn2">MOCK 데이터 등록</button>
	<div id="piechart" style="width: 900px; height: 500px;"></div>
	<hr color="red">
	<a href="MainPage.jsp"><button>메인페이지</button></a>
</body>
</html>