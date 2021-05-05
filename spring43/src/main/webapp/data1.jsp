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
				$.ajax({
					url: "resources/data/dataset.xml",
					success: function(xml) {
						alert('XML 연결 성공!!!!')			// 연결이 되었는지 확인
						list = $(xml).find('record') 	// xml 문서 안에있는 record를 모두 찾아서 가져옴
						console.log('레코드의 개수 >> ' + list.length)			// record가 많을수 있기때문에 먼저 개수부터 확인
						/* for(var i = 0; i < list.length; i++){				// 1000번 반복하면서 1000개의 record 전부를 출력
							console.log($(list[i]).find('id').text())		//record 중에서 첫번쨰 인덱스
							console.log($(list[i]).find('last_name').text())
							console.log($(list[i]).find('gender').text())
							console.log($(list[i]).find('phone').text())
						} */
						//for-each문
						$(list).each(function(index, record) { //java보다 융통성이 있어서 인덱스를 쓸 수 있다.
							console.log(index + ": " + $(record).find('id').text())
							console.log(index + ": " + $(record).find('last_name').text())
							console.log(index + ": " + $(record).find('gender').text())
							console.log(index + ": " + $(record).find('phone').text())
						})
					}//success
				})//ajax
			})//btn1
		})//start($function)
	</script>
</head>
<body>
	<button id="btn1">XML 문서 받아오기</button>
	<button id="btn2">JSON 문서 받아오기</button>
</body>
</html>