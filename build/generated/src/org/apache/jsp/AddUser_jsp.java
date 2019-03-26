package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public final class AddUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AddUser</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           ");

            String userid = request.getParameter("userid");
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            String gender = request.getParameter("gender");
            String password = request.getParameter("password");
            String roleid = request.getParameter("roleid");
            String designation = request.getParameter("designation");
            String landno= request.getParameter("landno");
            String mobileno = request.getParameter("mobileno");
            String email = request.getParameter("email");
             String message = (String)request.getAttribute("alertMsg");
             String encryptpassword= request.getParameter("password");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");
                 MessageDigest alg = MessageDigest.getInstance("MD5");
                Statement stmt = con.createStatement();
                
                response.sendRedirect("User Add Form.html");
                
               
                
                String query = "INSERT INTO user(userid,fname,lname,gender,password,roleid,designation,landno,mobileno,email)"
                        + "values('" + userid+ "','" + fname + "','"+lname+"','"+gender+"','"+encryptpassword+"','"+roleid+"','"+designation+"','"+landno+"','"+mobileno+"','"+email+"')";

                int rs = stmt.executeUpdate(query);

            } catch (Exception e) {

                out.println(e.getMessage());
                
            }


        
      out.write("\n");
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
