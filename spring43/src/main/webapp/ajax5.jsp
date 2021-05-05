<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#btn1').click(function() {
				cPriceVal = $('#cPrice').val()
				cProductVal = $('#cProduct').val()
				mPriceVal = $('#mPrice').val()
				mProductVal = $('#mProduct').val()
				cmTotal = parseInt(cPriceVal) + parseInt(mPriceVal)
				
				$.ajax({
					url:"product",
					data:{
						cPrice : cPriceVal,
						cProduct : cProductVal,
						mPrice : mPriceVal,
						mProduct : mProductVal,
						total : cmTotal
					},
					success: function(x) {
						$('#result').html(x)
					}
				})
			})
		})
	</script>
</head>
<body>
	컴퓨터 가격 > <input id="cPrice"><br>
	컴퓨터 종류 > <input id="cProduct"><br>
	<hr color="pink">
	마우스 가격 > <input id="mPrice"><br>
	마우스 종류 > <input id="mProduct"><br>
	<input id="btn1" type="button" value="전체 확인">
	<hr color="red">
	<div id="result"></div>
</body>
</html>