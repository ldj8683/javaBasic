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
      $('#b1').click(function() {
    	  items = []
         $.ajax({
            type: 'POST',
            beforeSend : function(xhr){
                  xhr.setRequestHeader("Authorization", "KakaoAK 24d6fff7989c1d17ac2cbde47622a571");
                  //xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                  xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
              },
            url: "https://dapi.kakao.com/v2/vision/product/detect",
            data: {
                image_url: "https://www.theguru.co.kr/data/photos/20200209/art_15828089015411_a2bbc7.jpg"
            },
            success: function(x) {
            	list = x.result.objects
            	
            	$(list).each(function(index, item) {
					//items.push(item.class)
				})
               alert('kakao연결 성공.!!! ' + items)
            } //success
         }) //ajax
      })//b1
   })//$fun
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>