/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-02-25 05:59:16 UTC
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

public final class ProductDbConnect2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");

	// ProductRegister에서 입력되어 받아온 파라미터값들을 각 데이터 형식에 맞게 선언된 변수들에게 저장, bag이라는 변수에 넣어서 한번에 전달함
	int productNum = Integer.parseInt(request.getParameter("productNum"));
	String productClassification = request.getParameter("productClassification");
	String productName = request.getParameter("productName");
	String productImage = request.getParameter("productImage");
	int productPrice = Integer.parseInt(request.getParameter("productPrice"));
	String productLocation = request.getParameter("productLocation");
	String[] productCommonList = request.getParameterValues("productCommon");
	String[] productInternalList = request.getParameterValues("productInternal");
	String productRoomType = request.getParameter("productRoomType");
	String productPickup = request.getParameter("productPickup");
	String productInfo = request.getParameter("productInfo");	
	String productId = request.getParameter("productId");
	
	// 로그인의 세션 설정을 사용
	String id = (String)session.getAttribute("id");
	
	// productCommon, productInternal의 배열로 저장된 데이터들을 하나로 합쳐주는 코드
	String productCommon = "";
	for(int i = 0 ; i < productCommonList.length ; i++ ){
		if(i == productCommonList.length-1){
			productCommon += productCommonList[i];
		} else {
			productCommon += productCommonList[i] + ",";
		}
	}
	
	String productInternal = "";
	for(int i = 0 ; i < productInternalList.length ; i++ ){
		if(i == productInternalList.length-1){
			productInternal += productInternalList[i];
		} else {
			productInternal += productInternalList[i] + ",";
		}
	}
	
	// 한번에 저장하기 위해서 bag라는 변수를만들어서 받은 파라미터 값들을 저장
	ProductVO bag = new ProductVO();
	bag.setProductNum(productNum);
	bag.setProductClassification(productClassification);
	bag.setProductName(productName);
	bag.setProductImage(productImage);
	bag.setProductPrice(productPrice);
	bag.setProductLocation(productLocation);
	bag.setProductCommon(productCommon);
	bag.setProductInternal(productInternal);
	bag.setProductRoomType(productRoomType);
	bag.setProductPickup(productPickup);
	bag.setProductInfo(productInfo);
	bag.setProductId(productId);
	
	// 저장된 bag를 이용해서 수정을 하기 위해서 update 메서드를 사용
	ProductDB db = new ProductDB();	
	db.update(bag);
		

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>숙소 정보 등록 완료</title>\r\n");
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
      out.write("\t\t\t<div style=\"padding-top: 4em; padding-left: 4em;\">\r\n");
      out.write("\t\t\t\t숙소 정보 수정이 완료 되었습니다.<br><br>\r\n");
      out.write("\t\t\t\t<!-- 수정 완료후 요약 페이지로 돌아갈때 파라미터 값을 넘겨줘서 등록된 곳의 요약을 보여주도록 href를 설정 -->\r\n");
      out.write("\t\t\t\t<a href=\"ProductSummary.jsp?classification=");
      out.print( bag.getProductClassification() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<button>돌아가기</button>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
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
