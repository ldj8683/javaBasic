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
      files = ''
      $('#file').change(function(e) {
         files = e.target.files
         alert(files)
      })
      $('#b1').click(function(e) {
         reader = new FileReader()
         //files = $('#file').target
         $.ajax({
            type: 'POST',
            beforeSend : function(xhr){
                  xhr.setRequestHeader("Authorization", "KakaoAK 24d6fff7989c1d17ac2cbde47622a571");
                  xhr.setRequestHeader("Content-Type","multipart/form-data");
              },
            url: "https://dapi.kakao.com/v2/vision/text/ocr",
            data: {
               image: reader.readAsDataURL(files[0])
            },
            success: function(x) {
               recognition_words = x.recognition_words
               alert('kakao연결 성공.!!! ' + recognition_words)
            } //success
         }) //ajax
      })//b1
   })//$fun
</script>
</head>
<body>
파일첨부 <input type="file" id="file">
<button id="b1">XML문서 받아오기</button>
</body>
</html>