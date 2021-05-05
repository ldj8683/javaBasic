<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
   $(function() {
      $('#b2').click(function() {
         $.ajax({
            url: "resources/data/MOCK_DATA.json",
            success: function(json) {
               alert('json연결 성공.!!!==>  '+ json.length)
               //alert(json[0].id)
               $(json).each(function(index, person) { //파라메터 이름 마음대로
                  id = person.id
                  first_name = person.first_name
                  last_name = person.last_name
                  email = person.email
                  gender = person.gender
                  phone = person.phone
                  console.log(id, first_name, last_name, email, gender, phone)
                  $.ajax({
                     url: "insertperson",
                     async: false, 
                     data : {
                        ID : id,
                        FIRST_NAME : first_name,
                        LAST_NAME : last_name,
                        EMAIL : email,
                        GENDER : gender,
                        PHONE : phone
                     }, 
                     success: function(result) {
                       	$('div').html(result)
                     }
                  })
               })
            } //success
         }) //ajax
      })//b1
      $('#b1').click(function() {
         $.ajax({
            url: "resources/data/dataset.xml",
            success: function(xml) {
               alert('xml연결 성공.!!!')
               list = $(xml).find('record')
               console.log('레코드의 개수=> ' + list.length)
               /* console.log($(list[0]).find('id').text())
               console.log($(list[0]).find('last_name').text())
               console.log($(list[0]).find('gender').text())
               console.log($(list[0]).find('phone').text()) */
               //last_name, gender, phone
               //for문 이용해서 전체 1000개를 프린트!
/*                for (var i = 0; i < list.length; i++) {
                  console.log($(list[i]).find('id').text())
                  console.log($(list[i]).find('last_name').text())
                  console.log($(list[i]).find('gender').text())
                  console.log($(list[i]).find('phone').text())
               } */
               $(list).each(function(index, record) {
                  console.log(index + ": " + $(record).find('phone').text())
               })
            } //success
         }) //ajax
      })//b1
   })//$fun
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
<div id=result></div>
</body>
</html>