/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-02-25 01:58:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jeju.ReservationDB;
import jeju.ReservationVO;

public final class ReservationCreateDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("jeju.ReservationDB");
    _jspx_imports_classes.add("jeju.ReservationVO");
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
      out.write("\r\n");

/* 예약창(ReservationSection.jsp)에서 입력한 모든 예약정보를 받아온다. */
String res_id = request.getParameter("res_id");
String res_name = request.getParameter("res_name");
String res_tel = request.getParameter("res_tel");
String res_date = request.getParameter("res_date");
String res_payment = request.getParameter("res_payment");
String res_room = request.getParameter("res_room");
int res_cost = Integer.parseInt(request.getParameter("res_cost"));

ReservationVO bag = new ReservationVO(); // VO생성

/* 위 에서 받아온 모든 값들을 VO에 저장 */
bag.setRes_id(res_id);
bag.setRes_name(res_name);
bag.setRes_tel(res_tel);
bag.setRes_date(res_date);
bag.setRes_payment(res_payment);
bag.setRes_room(res_room);
bag.setRes_cost(res_cost);

/* create를 통해 db에 있는 예약테이블에 담는다. */
ReservationDB db = new ReservationDB();
db.create(bag);// 보낼 데이터가 많기 때문에 가방에 담아서 보내줌

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- if문 통해서 결제방식에 따라 카드결제시 카드결제 페이지로 넘겨준다. -->\r\n");
if(bag.getRes_payment().equals("card")){ 
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">        \r\n");
      out.write("\t\t/* url을 통해 자바스크립트로 상품명과 상품가격에 대한 파라미터값 보냄 */\r\n");
      out.write("\t\t/* location.href : 페이지이동메서드 */\r\n");
      out.write("\t\t/* 카드결제서버로 이동 */\r\n");
      out.write("\t\t/* 파라미터값으로 상품명과 상품가격을 보내준다 */\r\n");
      out.write("        location.href=\"Payment_card.jsp?room=");
      out.print(request.getParameter("res_room"));
      out.write("&cost=");
      out.print(request.getParameter("res_cost"));
      out.write("\";\r\n");
      out.write("    </script>\r\n");
      out.write("\t");

		} else {/* 카드결제 제외 예약등록  */
	
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"예약이 완료되었습니다. 결제관련해서 따로 연락드립니다.\")\r\n");
      out.write("\t\tlocation.href=\"MainPage.jsp\"\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("</body>\r\n");
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
