/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.34
 * Generated at: 2014-12-12 00:04:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.RoomTypeManager;
import apimanager.*;
import java.util.*;
import beans.*;
import dao.*;

public final class BookingForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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


UserManager userManager = new UserManager();
List<User> users = userManager.findAllUsers();

String hotelID = (String) request.getParameter("hotelID");
String arrivalDate = (String) request.getParameter("arrivalDate");
String departureDate = (String) request
.getParameter("departureDate");

RoomTypeManager rmt = new RoomTypeManager();

List<RoomType> types =  rmt.findAllRoomTypes();
WebServiceClient client = new WebServiceClient();
HotelInfo hotel = client.getHotelInfomation(hotelID);
hotel.setArrivalDate(arrivalDate);
hotel.setDepartureDate(departureDate);



      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function getprice()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar type = $(\"#roomType\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tlow = ");
      out.print(hotel.getLowRate());
      out.write(";\r\n");
      out.write("\thigh = ");
      out.print(hotel.getHighrate());
      out.write(";\r\n");
      out.write("\tmed = (low + high)/2;\r\n");
      out.write("\t\r\n");
      out.write("\tif(type == \"Deluxe\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t$(\"#price\").val(low);\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse if(type == \"King\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t$(\"#price\").val(med);\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse if(type == \"Queen\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$(\"#price\").val(high);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 if (String.valueOf(session.getAttribute("role")).equals("Admin")) {
      out.write("\r\n");
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
      out.write("            <li class=\"active\"><a href=\"#\">");
      out.print(hotel.getName() );
      out.write("</a></li>\r\n");
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
 } else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"HomeSearch.jsp\">FindMyHotels.com</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">");
      out.print(hotel.getName() );
      out.write("</a></li>\r\n");
      out.write("            <li><a href=\"HomeSearch.jsp\">Find Hotels</a></li>\r\n");
      out.write("            <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("             <li><a href=\"MyProfile.jsp\">My Profile</a></li>\r\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"padding-top: 70px\">\r\n");
      out.write("<div class=\"well well-lg\">\r\n");
      out.write("<form action=\"ConfirmBooking.jsp\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("            <table class=\"table\"  width=\"30%\" cellpadding=\"5\">\r\n");
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
      out.write("                        <td>Arrival Date</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" readonly=\"readonly\"  name=\"arrival\" value=\"");
      out.print(arrivalDate);
      out.write("\" />\r\n");
      out.write("                        <input name=\"hotelID\" value=\"");
      out.print(hotelID);
      out.write("\" type=\"hidden\" /> \r\n");
      out.write("                        <input\r\n");
      out.write("\t\t\t\tname=\"arrivalDate\" type=\"hidden\" value=\"");
      out.print(arrivalDate);
      out.write("\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Departure Date</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" readonly=\"readonly\" name=\"ddate\" value=\"");
      out.print(departureDate);
      out.write("\" />\r\n");
      out.write("                   \t\t<input name=\"departureDate\" type=\"hidden\" value=\"");
      out.print(departureDate);
      out.write("\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Room Type</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <select class=\"form-control\" name=\"roomType\" id=\"roomType\" onchange=\"getprice();\">\r\n");
      out.write("                        <option value=\"-1\">Select</option>\r\n");
      out.write("                        ");

                        for(RoomType t : types)
                        {
                        
      out.write("\r\n");
      out.write("                        <option  value=\"");
      out.print(t.getType());
      out.write("\">\r\n");
      out.write("                        ");
      out.print(t.getType());
      out.write("\r\n");
      out.write("                        </option>\r\n");
      out.write("                        ");
} 
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Price</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" id=\"price\" name=\"price\" value=\"\" readonly=\"readonly\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Special request</td>\r\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"srequest\" value=\"\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 if (String.valueOf(session.getAttribute("role")).equals("Admin")) {
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                     <td>Book for User : </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                       \r\n");
      out.write("                        <select name=\"extusername\" id=\"extusername\">\r\n");
      out.write("                         ");
for(User u1 : users) {
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(u1.getUsername());
      out.write('"');
      out.write('>');
      out.print(u1.getUsername());
      out.write("</option>\r\n");
      out.write("                       ");
} 
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        \r\n");
      out.write("                        </td>\r\n");
      out.write("                    \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                     <td><input class=\"btn btn-danger form-control\" type=\"reset\" value=\"Reset\" /></td>\r\n");
      out.write("                        <td><input class=\"btn btn-success form-control\" type=\"submit\" value=\"Book\" /></td>\r\n");
      out.write("                       \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            </center>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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