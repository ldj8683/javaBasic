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
						
						mAge0 = 0;
						fAge0 = 0;
						mAge10 = 0;
						fAge10 = 0;
						mAge20 = 0;
						fAge20 = 0;
						mAge30 = 0;
						fAge30 = 0;
						mAge40 = 0;
						fAge40 = 0;
						mAge50 = 0;
						fAge50 = 0;
						mAge60 = 0;
						fAge60 = 0;
						mAgeAll = 0;
						fAgeAll = 0;
						
						for(var i = 0; i < json.length; i++){
							birth = json[i].ubirth		// 형식이  월/일/년 인 생년월일 데이터를 birth에 저장
							birthSplit = birth.split("/")[2] // birth에  저장된 데이터를 나이를 계산하기 위해서 split 함수를 이용해서 분리후 맨마지막 2째 인덱스를 가져옴
							gender = json[i].ugender
							console.log(birth)
							console.log(birthSplit)
							console.log(gender)
							if(gender == "Male"){
								if(birthSplit > 2011){
									console.log("0~9세 남자")
									mAge0 = mAge0 +1
								} else if(birthSplit > 2001) {
									console.log("10~19세 남자")
									mAge10 = mAge10 +1
								} else if(birthSplit > 1991) {
									console.log("20~29세 남자")
									mAge20 = mAge20 +1
								} else if(birthSplit > 1981) {
									console.log("30~39세 남자")
									mAge30 = mAge30 +1
								} else if(birthSplit > 1971){
									console.log("40~49세 남자")
									mAge40 = mAge40 +1
								} else if(birthSplit > 1961){
									console.log("50~59세 남자")
									mAge50 = mAge50 +1
								} else {
									console.log("60세 이상 남자")
									mAge60 = mAge60 +1
								}
							}else{
								if(birthSplit > 2011){
									console.log("0~9세 여자")
									fAge0 = fAge0 + 1
								} else if(birthSplit > 2001) {
									console.log("10~19세 여자")
									fAge10 = fAge10 + 1
								} else if(birthSplit > 1991) {
									console.log("20~29세 여자")
									fAge20 = fAge20 + 1
								} else if(birthSplit > 1981) {
									console.log("30~39세 여자")
									fAge30 = fAge30 + 1
								} else if(birthSplit > 1971){
									console.log("40~49세 여자")
									fAge40 = fAge40 + 1
								} else if(birthSplit > 1961){
									console.log("50~59세 여자")
									fAge50 = fAge50 + 1
								} else {
									console.log("60세 이상 여자")
									fAge60 = fAge60 + 1
								}
							}
						}
						console.log("0대 남자 >> " + mAge0)
						console.log("0대 여자 >> " + fAge0)
						console.log("10대 남자 >> " + mAge10)
						console.log("10대 여자  >> " + fAge10)
						console.log("20대 남자 >> " + mAge20)
						console.log("20대 여자  >> " + fAge20)
						console.log("30대 남자 >> " + mAge30)
						console.log("30대 여자  >> " + fAge30)
						console.log("40대 남자 >> " + mAge40)
						console.log("40대 여자  >> " + fAge40)
						console.log("50대 남자 >> " + mAge50)
						console.log("50대 여자  >> " + fAge50)
						console.log("60대 이상 남자 >> " + mAge60)
						console.log("60대 이상 여자  >> " + fAge60)
						mAgeAll = mAge0 + mAge10 + mAge20 + mAge30 + mAge40 + mAge50 + mAge60
						fAgeAll = fAge0 + fAge10 + fAge20 + fAge30 + fAge40 + fAge50 + fAge60
						console.log("남자 총인원 >> " + mAgeAll)
						console.log("여자 총인원 >> " + fAgeAll)
						
					    google.charts.load("current", {packages:["corechart"]});
					    google.charts.setOnLoadCallback(drawChart);
					    function drawChart() {
					    	var data = google.visualization.arrayToDataTable([
					            ['Age', 'Male', 'Female', { role: 'annotation' }],
					            ['10세 이하', mAge0, fAge0, ''],
					            ['10대', mAge10, fAge10, ''],
					            ['20대', mAge20, fAge20, ''],
					            ['30대', mAge30, fAge30, ''],
					            ['40대', mAge40, fAge40, ''],
					            ['50대', mAge50, fAge50, ''],
					            ['60세 이상', mAge60, fAge60, '']
					        ]);

					        var options = {
					        	width: 600,
					            height: 400,
					            legend: { position: 'top', maxLines: 3 },
					            bar: { groupWidth: '75%' },
					            isStacked: true
					        };
					          
					      	var chart = new google.visualization.BarChart(document.getElementById("barchart_values"));
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
	<div id="barchart_values" style="width: 900px; height: 300px;"></div>
</body>
</html>