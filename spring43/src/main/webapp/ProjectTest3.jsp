<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자동차 차량 등록여부 확인</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
		$(function() {
			$('#btn1').click(function() {
				$.ajax({
					url: "userAgeInfo",
					success: function(json) {
						alert("userAgeInfo 연결 성공"),
						console.log('결과 >> ' + json)
						console.log('결과 >> ' + json.length)
						$(json).each(function(index, vo) {
							console.log(index, vo.ubirth)
						})
						
						cAge0 = 0;
						cAge10 = 0;
						cAge20 = 0;
						cAge30 = 0;
						cAge40 = 0;
						cAge50 = 0;
						cAge60 = 0;
						for(var i = 0; i < json.length; i++){
							birth = json[i].ubirth		// 형식이  월/일/년 인 생년월일 데이터를 birth에 저장
							birthSplit = birth.split("/")[2] // birth에  저장된 데이터를 나이를 계산하기 위해서 split 함수를 이용해서 분리후 맨마지막 2째 인덱스를 가져옴
							console.log(birth)
							console.log(birthSplit)
							if(birthSplit > 2011){
								console.log("0~9세")
								cAge0 = cAge0 + 1
							} else if(birthSplit > 2001){
								console.log("10~19세")
								cAge10 = cAge10 + 1
							} else if(birthSplit > 1991){
								console.log("20~29세")
								cAge20 = cAge20 + 1
							} else if(birthSplit > 1981){
								console.log("30~39세")
								cAge30 = cAge30 + 1
							} else if(birthSplit > 1971){
								console.log("40~49세")
								cAge40 = cAge40 + 1
							} else if(birthSplit > 1961){
								console.log("50~59세")
								cAge50 = cAge50 + 1
							} else {
								console.log("60세 이상")
								cAge60 = cAge60 + 1
							}
						}
						console.log("0대 >> " + cAge0)
						console.log("10대 >> " + cAge10)
						console.log("20대 >> " + cAge20)
						console.log("30대 >> " + cAge30)
						console.log("40대 >> " + cAge40)
						console.log("50대 >> " + cAge50)
						console.log("60대 이상 >> " + cAge60)
						console.log("총인원 >> " + (cAge0 + cAge10 + cAge20 + cAge30 + cAge40 + cAge50 + cAge60))
						
						
						google.charts.load("current", {packages:["corechart"]});
						google.charts.setOnLoadCallback(drawChart);
						function drawChart() {
							var data = google.visualization.arrayToDataTable([
								['UserAge', 'Population'],
								['10세 이하', cAge0],
								['10대', cAge10],
								['20대', cAge20],
								['30대', cAge30],
								['40대', cAge40],
								['50대', cAge50],
								['60세 이상', cAge60]
							]);
							var options = {
								legend: 'none',
								pieSliceText: 'label',
								title: '가입자의 연령대',
								pieStartAngle: 100,
							};
							
							var chart = new google.visualization.PieChart(document.getElementById('piechart'));
							chart.draw(data, options);
						}
					},
					error: function() {
						alert("userAgeInfo 연결 실패")
					}
				})
			})
			
		})//start($function)
	</script>
</head>
<body>
	<h2>JSON data 확인</h2>
	<hr color="blue">
	<button id="btn1">DB에서 가져온 JSON DATA</button>
	<div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>