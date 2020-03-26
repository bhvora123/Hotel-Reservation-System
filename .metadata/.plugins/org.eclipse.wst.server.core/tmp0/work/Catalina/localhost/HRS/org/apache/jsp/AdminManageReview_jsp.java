/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.34
 * Generated at: 2014-12-11 23:53:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import apimanager.*;
import java.util.*;
import beans.*;
import dao.*;

public final class AdminManageReview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {

      out.write("\r\n");
      out.write("You are not logged in<br/>\r\n");
      out.write("<a href=\"index.jsp\">Please Login</a>\r\n");
} else {
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("  <script src=\"//code.jquery.com/ui/1.11.2/jquery-ui.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  \r\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function removeReview(i){\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#reviewID\").val(i);\r\n");
      out.write("\t\r\n");
      out.write("\tvar o = $(\"#reviewID\").val();\r\n");
      out.write("//\talert(o);\r\n");
      out.write("\t$(\"#deleteReview\").submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

HotelManager hotelManager = new HotelManager();
List<Review> reviews = new ArrayList<Review>();

ReviewManager rvm = new ReviewManager();

reviews = (List<Review>)rvm.findAllReviews();

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"AdminHome.jsp\">FindMyHotels.com</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">Manage Review</a></li>\r\n");
      out.write("            <li><a href=\"AdminHome.jsp\">Find Hotels</a></li>\r\n");
      out.write("            <li><a href=\"AdminManageBooking.jsp\">Manage booking</a></li>\r\n");
      out.write("            <li><a href=\"AdminManageReview.jsp\">Manage Review</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("          <li><a href=\"AdminUserCreate.jsp\">Create User</a></li>\r\n");
      out.write("            <li><a href=\"AdminProfile.jsp\">My Profile</a></li>\r\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("<div class=\"container\" style=\"padding-top: 70px\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"well well-sm\">\r\n");
      out.write("\r\n");
      out.write(" <div class=\"well well-sm\">\r\n");
      out.write("           <h4>Reviews</h4>\r\n");
      out.write("\t");
for (int j =0;j<reviews.size();j++)  {
      out.write("\r\n");
      out.write("\t<div id=\"review_");
      out.print(reviews.get(j).getReviewId() );
      out.write("\" class=\"well well-sm\">\r\n");
      out.write("\t<h4><em>");
      out.print(reviews.get(j).getTitle() );
      out.write("</em></h4>\r\n");
      out.write("\t<p><em>");
      out.print(reviews.get(j).getReview() );
      out.write("</em></p>\r\n");
      out.write("\t<p>Hotel : <a href=\"http://localhost:8080/HRS/HotelInformation.jsp?hotelID=");
      out.print(reviews.get(j).getHotelId());
      out.write("\"><em>");
      out.print(hotelManager.findHotelname(reviews.get(j).getHotelId()) );
      out.write(",\r\n");
      out.write("\t                ");
      out.print(hotelManager.findHotellocation(reviews.get(j).getHotelId()) );
      out.write("</em></a></p>\r\n");
      out.write("\t<a class=\"btn btn-primary\" onclick=\"removeReview('");
      out.print(reviews.get(j).getReviewId());
      out.write("');\" >Delete</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("<form name=\"deleteReview\"  id=\"deleteReview\" action=\"AdminDeleteReview.jsp\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" id=\"reviewID\" name=\"reviewID\" value=\"\" />\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
 } 
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
