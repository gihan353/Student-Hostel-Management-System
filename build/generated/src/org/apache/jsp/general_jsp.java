package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class general_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>HMS Uva Wellassa University</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"col-sm-16\">\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      \n");
      out.write("     <a class=\"navbar-brand\" href=\"#\">Hostel Managment System | Uva Wellassa University Sri Lanka </a>\n");
      out.write("     </div>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("      ");
 if(session.getAttribute("id")!= null){
      out.write("\n");
      out.write("      <li><a href=\"LogOut.jsp\">LogOut</a></li>\n");
      out.write("      ");
}else{
      out.write("\n");
      out.write("      <li><a href=\"GeneralAdminLogIn.html\">LogIn</a></li>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("   </nav>\n");
      out.write("  </div>\n");
      out.write("  \t</div>\n");
      out.write("\t\n");
      out.write("  <div class=\"col-sm-3\">\n");
      out.write("  <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("  <li class=\"active\"><a href=\"#\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-3\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <div class=\"jumbotron col-sm-10\" style=\"background-image: url( pics/1.jpg); color:#FFF; background-position: right;\">\n");
      out.write("    <h1>Welcome To | HMS</h1> \n");
      out.write("    <p>To Performe Best Service...</p> \n");
      out.write(" \t\t </div>\n");
      out.write("  \n");
      out.write("\t</div>\n");
      out.write("  </div>\n");
      out.write(" <!-- \n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("  <div class=\"row force-to-bottom text-center\">\n");
      out.write("    <div class=\"col-xs-10\">\n");
      out.write("            <h1>\n");
      out.write("     <div class=\"navbar-header\">\n");
      out.write("      \n");
      out.write("     <a class=\"navbar-brand-nav navbar-right\" href=\"#\">Hostel Managment System | Uva Wellassa University Sri Lanka </a>\n");
      out.write("     </div>\n");
      out.write("        </h1>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
