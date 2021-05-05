<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자동차 차량 등록여부 확인</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#btn1').click(function() {
				$.ajax({
					url: "resources/team/dataset.xml",
					success: function(xml) {
						alert('XML 연결 성공!!!!')			// 연결이 되었는지 확인
						list = $(xml).find('record') 	// xml 문서 안에있는 record를 모두 찾아서 가져옴
						console.log('레코드의 개수 >> ' + list.length)			// record가 많을수 있기때문에 먼저 개수부터 확인
						//for-each문
						$(list).each(function(index, record) { //java보다 융통성이 있어서 인덱스를 쓸 수 있다.
							console.log(index)
							console.log("제조사: " + $(record).find('CAR_MAKE').text())
							console.log("모델명: " + $(record).find('CAR_MODEL').text())
							console.log("제조년도: " + $(record).find('CAR_YEAR').text())
							console.log("차량번호: " + $(record).find('CAR_VIN').text())
							console.log("차량색상: " + $(record).find('CAR_COLOR').text())
							console.log("차 가격: " + $(record).find('CAR_PRICE').text())
							console.log("등록여부: " + $(record).find('CAR_BOOL').text())
							console.log("차주이름: " + $(record).find('CAR_OWNER').text())
							console.log("===========================")
						})
					}//success
				})//ajax
			})//btn1
			
			$('#btn2').click(function() {
				$.ajax({
					url: "resources/team/MOCK_DATA.json",
					success: function(json) {
						console.log('item 갯수 >> ' + json.length)
						$(json).each(function(index, car) { // 변수는 파라미터이기때문에 내가 하고싶은걸 하면 된다.
							console.log(index + "번")
							console.log("제조사 >> " + car.CAR_MAKE)
							console.log("모델명 >> " + car.CAR_MODEL)
							console.log("제조년도 >> " + car.CAR_YEAR)
							console.log("차량번호 >> " + car.CAR_VIN)
							console.log("차량색상 >> " + car.CAR_COLOR)
							console.log("차 가격 >> " + car.CAR_PRICE)
							console.log("등록여부 >> " + car.CAR_BOOL)
							console.log("차주이름 >> " + car.CAR_OWNER)
							console.log("===============================")
						})
					}
				})
			})
			
		})//start($function)
	</script>
</head>
<body>
	<h2>자동차 차량 등록여부를 확인합니다.</h2>
	<hr color="blue">
	<button id="btn1">차량 등록여부 확인(xml)</button>
	<button id="btn2">차량 등록여부 확인(json)</button>
</body>
</html>