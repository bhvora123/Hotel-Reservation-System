/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.34
 * Generated at: 2014-12-11 00:30:48 UTC
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

public final class AdminUserCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");

    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "") || (session.getAttribute("role") == "User")) {

      out.write("\r\n");
      out.write("You are not logged in<br/>\r\n");
      out.write("<a href=\"index.jsp\">Please Login</a>\r\n");
} else {
      out.write('\r');
      out.write('\n');


RoleTypeManager manager = new RoleTypeManager();

List<RoleType> roles = manager.findAllRoleTypes();


      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Registration</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("  <script src=\"//code.jquery.com/ui/1.11.2/jquery-ui.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  \r\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <script>\r\n");
      out.write("  $(function() {\r\n");
      out.write("    $( \"#datepicker\" ).datepicker({ dateFormat: 'yy-mm-dd' }).val();\r\n");
      out.write("  });\r\n");
      out.write("  </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body><nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
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
      out.write("            <li class=\"active\"><a href=\"#\">Create User</a></li>\r\n");
      out.write("            <li><a href=\"AdminHome.jsp\">Find Hotels</a></li>\r\n");
      out.write("            <li><a href=\"AdminManageBooking.jsp\">Manage booking</a></li>\r\n");
      out.write("             <li><a href=\"AdminManageReview.jsp\">Manage Review</a></li>\r\n");
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
      out.write("    <center>\r\n");
      out.write("    <div class=\"well\" >\r\n");
      out.write("    \r\n");
      out.write("        <form  class=\"form\" method=\"post\" action=\"reg.jsp\">\r\n");
      out.write("            <center>\r\n");
      out.write("            <table class=\"table\" width=\"30%\" cellpadding=\"5\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\">Enter Information Here</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>First Name</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"fname\" value=\"\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Last Name</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"lname\" value=\"\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>DOB</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" id=\"datepicker\" name=\"dob\" value=\"\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>User Name</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"uname\" value=\"\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Password</td>\r\n");
      out.write("                        <td><input  class=\"form-control\" type=\"password\" name=\"pass\" value=\"\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Role</td>\r\n");
      out.write("                        <td><select  class=\"form-control\" name=\"role\" >\r\n");
      out.write("                        ");
 for( RoleType rt : roles) { 
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(rt.getType());
      out.write('"');
      out.write('>');
      out.print( rt.getType() );
      out.write("</option>\r\n");
      out.write("                        ");
} 
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><input type=\"submit\" class=\"btn btn-success\" value=\"Submit\" /></td>\r\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\"  class=\"btn btn-danger\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </center>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("</html>\r\n");
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
