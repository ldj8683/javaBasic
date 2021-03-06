/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-02-25 05:57:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jeju.ProductVO;
import jeju.ProductDB;

public final class ProductUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("jeju.ProductDB");
    _jspx_imports_classes.add("jeju.ProductVO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	/* 수정할 숙박업소의 등록번호의 파라미터 값을 받아와서 db에 저장된 다른 데이터들이 같이 수정되는 경우가 없도록 해주었습니다. */
	int num = Integer.parseInt(request.getParameter("num"));
	/* 저장된 이미지가 바뀔 수도 있기 때문에 그 경로를 설정해줄때 사용을 하였습니다. */
	String classification = request.getParameter("classification");
	
	// 로그인 세션입니다.
	String id = (String)session.getAttribute("id");
	
	// 수정을 하기 위해서 모든부분을 적는것은 비효율 적이기 때문에
	// 해당 등록 번호에 저장된 데이터들을 보여주어서 수정할 부분만 수정을 할 수 있도록 하기 위해서 bag을 설정해주었습니다.
	ProductDB db = new ProductDB();
	ProductVO bag = db.readSecond(num, classification);

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>숙소 정보 수정</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"><!-- style.css와 연결 -->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<header><!-- HTML 레이아웃 중 하나인 header 부분에 메뉴를 생성 -->\r\n");
      out.write("\t\t\t<nav id = \"logo\">\t<!-- HTML 레이아웃중 하나인 nav 부분에 생성, id는 logo 로 지정해서 style.css에서 logo를 이용해 style을 만들어줌  -->\r\n");
      out.write("\t\t\t\t<a href=\"MainPage.jsp\"> <!-- 로고를 누르면 메인페이지를 갈수 있도록 하는 a 태그 생성 -->\r\n");
      out.write("\t\t\t\t\t<img src=\"pictures/MainLogo.png\" width=\"80\" height=\"80\">\t<!-- 80x80짜리 경로를 따라서 이미지를 가져옴 -->\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</nav> <!-- 로고 레이아웃 완료 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav id = \"search\">\t<!-- search라는 id를 가진 검색부분 레이아웃을 생성 -->\r\n");
      out.write("\t\t\t\t<form><!-- 이미지를 누르면 검색을 할수 있도록 하기위해서 form 형식으로 생성, 검색 하는것은 추후 추가 예정 -->\r\n");
      out.write("\t\t\t\t\t<img id=\"SearchImage\" src=\"pictures/Search.png\" width=\"25\" height=\"25\"><!-- 검색모양 이미지 -->\r\n");
      out.write("\t\t\t\t\t<!-- <input type=\"text\" name=\"find\"> -->\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</nav> <!-- 검색 레이아웃 완료 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav id = \"menu\" ><!-- menu라는 id를 가진 레이아웃을 생성 -->\r\n");
      out.write("\t\t\t\t<table>\t<!-- 테이블 생성 -->\r\n");
      out.write("\t\t\t\t\t<tr>\t<!-- 테이블의 한줄을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"4\" style=\"text-align: right; height: 41px\"> <!-- 4열이 합병되고 오른쪽 정렬, 높이가 41px인 테이블 헤더 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 if( id == null) { 
      out.write(" <!-- 세션을 이용해 로그인이 되지 않고 있을 때 아래 구문을 수행 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t로그인을 해주세요.\r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\t<!-- 로그인이 되었을 경우 아래 구문 수행 -->\r\n");
      out.write("\t\t\t\t\t\t\t    ");
      out.print( id );
      out.write("님 환영합니다.<a href=\"Logout.jsp\">로그아웃</a>\t<!-- 로그인된 사용자의 아이디를 출력 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</th><!-- 테이블 헤더 완성 -->\r\n");
      out.write("\t\t\t\t\t</tr><!-- 테이블의 한줄을 완성 -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><!-- 테이블 데이터 셀을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"MainPage.jsp\">메인페이지</a>\t<!-- 세션을 이용해 메인페이지 셀을 눌렀을때 로그인된 아이디 값을 넘겨주면서 메인페이지로 감 -->\r\n");
      out.write("\t\t\t\t\t\t</td><!-- 테이블 데이터 완성 -->\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"MyPage.jsp\">마이페이지</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"ServiceMain.jsp\">고객센터</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 if( id == null) {	
      out.write(" <!-- 세션을 이용해 로그인이 되지 않았을때 로그인을 하기위해서 로그인페이지로 연결되는 데이터셀을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"Login.jsp\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
} else {
      out.write("\t<!-- 로그인이 성공 했을경우 로그아웃을 할 수 있게하는 로그아웃으로 연결되는 셀을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"UserUpdate.jsp\">회원 정보</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table> <!-- 테이블 완성 -->\r\n");
      out.write("\t\t\t</nav><!-- menu 레이아웃 완료 -->\r\n");
      out.write("\t\t</header> <!-- 헤더 레이아웃 완료 -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav id=\"Content\" style=\"background:#16b4f7;\"> <!-- 각 조원들이 넣게될 본문 레이아웃 생성 -->\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"ProductDbConnect2.jsp?num=");
      out.print( bag.getProductNum() );
      out.write("&classification=");
      out.print( bag.getProductClassification() );
      out.write("\">\r\n");
      out.write("\t\t\t\t<!-- 수정할 데이터들을 입력하는 테이블 입니다. 수정을 하기 쉽도록 db에 저장된 값들을 불러와서 입력창에 출력해 주었습니다. -->\r\n");
      out.write("\t\t\t\t<table id=\"registerForm\" style=\"padding:20px; font-size: 15px; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t등록자 ID:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 등록번호를 수정하면 안되기때문에 readonly를 이용해서 오로지 읽을수만 있도록 해주었습니다. -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"productId\" value=\"");
      out.print( bag.getProductId() );
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t등록 번호:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 등록번호를 수정하면 안되기때문에 readonly를 이용해서 오로지 읽을수만 있도록 해주었습니다. -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"productNum\" value=\"");
      out.print( bag.getProductNum() );
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t숙박 종류:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"productClassification\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Hotel\">호텔</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Resort\">리조트</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Pension\">펜션</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"GuestHouse\">게스트하우스</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t이름:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"productName\" value=\"");
      out.print( bag.getProductName() );
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t이미지:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <input type=\"file\" id=\"HotelImage\" accept=\"image/*\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"productImage\" value=\"pictures/");
      out.print(classification);
      out.write("/\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t가격:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"productPrice\" value=\"");
      out.print( bag.getProductPrice() );
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t위치:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"productLocation\" value=\"");
      out.print( bag.getProductLocation() );
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t공용 시설:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Cafe\" name=\"productCommon\" value=\"Cafe\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Cafe\">카페</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Pool\" name=\"productCommon\" value=\"Pool\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Pool\">수영장</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Convenience\" name=\"productCommon\" value=\"Convenience\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Convenience\">편의점</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Parking\" name=\"productCommon\" value=\"Parking\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Parking\">주차장</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t객실 시설:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Wifi\" name=\"productInternal\" value=\"Wifi\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Wifi\">와이파이</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Tv\" name=\"productInternal\" value=\"Tv\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Tv\">TV</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Refrigerator\" name=\"productInternal\" value=\"Refrigerator\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Refrigerator\">냉장고</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"Bathtub\" name=\"productInternal\" value=\"Bathtub\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Bathtub\">욕조</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t룸 타입:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"Single\" name=\"productRoomType\" value=\"Single\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Single\">싱글</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"Double\" name=\"productRoomType\" value=\"Double\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Double\">더블</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"Twin\" name=\"productRoomType\" value=\"Twin\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Twin\">트윈</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"85\" height=\"25\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t\t\t\t픽업 여부:\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"Yes\" name=\"productPickup\" value=\"Yes\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Yes\">가능</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"No\" name=\"productPickup\" value=\"No\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"No\">불가능</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t상세 정보:\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"10\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea name = \"productInfo\" rows=\"20\" cols=\"100\">");
      out.print( bag.getProductInfo() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<button name=\"regButton\" type=\"submit\" style=\"margin: 0px 30px 10px 30px; width: 150px; height: 40px; font-size: 20px;\">숙소 정보 수정</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 다시 상세 페이지로 돌아갈 경우 사용하는 버튼 -->\r\n");
      out.write("\t\t\t<a href=\"ProductDetail.jsp?productNum=");
      out.print( bag.getProductNum() );
      out.write("\">\r\n");
      out.write("\t\t\t\t<button name=\"regButton\" type=\"button\" style=\"margin: 0px 30px 10px 30px; width: 150px; height: 40px; font-size: 20px;\">돌아가기</button>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</nav> <!-- 본문 닫음 -->\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
