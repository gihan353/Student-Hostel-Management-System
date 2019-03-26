package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class SubWarden_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Untitled Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-16\">\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Hostel Managment System | Uva Wellassa University Sri Lanka </a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"AllHomePage.html\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> My Profile</a></li>\n");
      out.write("      <li><a href=\"AllHomePage.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout  </a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \t</div>\n");
      out.write("  <div class=\"col-sm-3\">\n");
      out.write("  <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("  <li class=\"active\"><a href=\"#\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("  <li><a href=\"Student Add Forms.html\"><span class=\"glyphicon glyphicon-user\"></span> Add Student</a></li>\n");
      out.write("  <li><a href=\"Student Add Forms.html\"><span class=\"glyphicon glyphicon-edit\"></span> Edit Student Details</a></li>\n");
      out.write("  <li><a href=\"Student Add Forms.html\"><span class=\"glyphicon glyphicon-trash\"></span> Delete Student Details</a></li>\n");
      out.write("  <li><a href=\"Hostel Add Forms.html\"><span class=\"glyphicon glyphicon-tag\t\"></span> Add Hostel</a></li>\n");
      out.write("  <li><a href=\"Inventory Add Forms.html\"><span class=\"glyphicon glyphicon-info-sign\"></span> Change Inventory Details</a></li>\n");
      out.write("</ul>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-3\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <div class=\"jumbotron col-sm-10\" style=\"background-image: url( pics/3.jpg); color: #ffffff;\">\n");
      out.write("    <h1>Welcome | Subwarden Profile</h1> \n");
      out.write("     \n");
      out.write("                <p></p> \n");
      out.write("                <p></p> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <table border=\"1\" class=\"table table-striped text-centered \">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"\">\n");
      out.write("                        <th>Reg.No</th>\n");
      out.write("                        <th>First Name</th>\n");
      out.write("                        <th>Last Name</th>\n");
      out.write("                        <th>NIC No</th>\n");
      out.write("                        <th>Gender</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Acedemic Year</th>\n");
      out.write("                        <th>Room No</th>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_sytem", "root", "");

                        Statement stmt = con.createStatement();

                        String query = "select * from student";

                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {

                            out.println(" <tr>");

                            out.println(" <td>" + rs.getString("regno") + "</td>");
                            out.println(" <td>" + rs.getString("firstname") + "</td>");
                            out.println(" <td>" + rs.getString("lastname") + "</td>");
                            out.println(" <td>" + rs.getString("nicno") + "</td>");
                            out.println(" <td>" + rs.getString("gender") + "</td>");
                            out.println(" <td>" + rs.getString("address") + "</td>");
                            out.println(" <td>" + rs.getString("acedemicyear") + "</td>");
                            out.println(" <td>" + rs.getString("roomno") + "</td>");
                            out.println(" <td>" + rs.getString("date") + "</td>");
                            
                           
                            out.println(" </tr>");
                        }

                    
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <body>\n");
      out.write("    </body>\n");
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
