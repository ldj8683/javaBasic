<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Dialog - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
  <!-- CDN(Content Delivery Network) - url 주소이다라고 보면 됨 -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  
  <script>
	  $( function() {
	    $( "#dialog" ).dialog();
	  } );
	  </script>
</head>
<body>
 
<div id="dialog" title="환영합니다.">
  <p>회원가입이 완료되었습니다<br>감사합니다.</p>
</div>
 
 
</body>
</html>