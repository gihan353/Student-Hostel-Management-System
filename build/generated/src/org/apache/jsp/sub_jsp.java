package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class sub_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Subwarden</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"col-sm-16\">\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Hostel Managment System | Uva Wellassa University Sri Lanka </a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"AllHomePage.html\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("        <li><a href=\"SubWarden.html\"><span class=\"glyphicon glyphicon-user\"></span> My Profile</a></li>\n");
      out.write("      <li><a href=\"LoginHomePage.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout  </a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \t</div>\n");
      out.write("  <div class=\"col-sm-3\">\n");
      out.write("  <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write(" \n");
      out.write("  <li><a href=\"Student Add Forms.html\"><span class=\"glyphicon glyphicon-user\"></span> Add/Edit/Delete Student Details</a></li>\n");
      out.write("  <li><a href=\"Hostel Add Forms.html\"><span class=\"glyphicon glyphicon-tag\t\"></span> Add Hostel</a></li>\n");
      out.write("  <li><a href=\"Inventory Add Forms.html\"><span class=\"glyphicon glyphicon-info-sign\"></span> Change Inventory Details</a></li>\n");
      out.write("</ul>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-3\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <div class=\"jumbotron col-sm-10\" style=\"background-image: url( pics/3.jpg); color: #ffffff;\">\n");
      out.write("    <h1>Welcome | Subwarden Profile</h1> \n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("  ");

                          
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");
                                Statement stmt = con.createStatement();

                                ResultSet rs = stmt.executeQuery("select * from student");
                                
                                
      out.write("\n");
      out.write("                               <table class=\"table table-striped table-bordered\"  cellspacing=\"0\" width=\"100%\" role=\"grid\">\n");
      out.write("                           <tr>\n");
      out.write("                            <th width=\"100\">Registration Number</th>\n");
      out.write("                            <th>First Name</th>\n");
      out.write("                            <th>Last Name</th>\n");
      out.write("                            <th>NIC No</th>\n");
      out.write("                            <th>Gender</th>\n");
      out.write("                            <th>Acedemic Year</th>\n");
      out.write("                            <th>Room No</th>\n");
      out.write("                            <th width=\"150\">Registered Date</th>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                           </tr>\n");
      out.write("                              ");
 while(rs.next()){   
      out.write("  \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(7));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(8));
      out.write("</td>\n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                               </tr>\n");
      out.write("                                  ");
}
      out.write("\n");
      out.write("                        </table> \n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write(".footer {\n");
      out.write("    position: fixed;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #333;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\theight:60px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p></p>\n");
      out.write("  <p></p>\n");
      out.write("  <p>Copyright © 2017 - Uva Wellassa University</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
