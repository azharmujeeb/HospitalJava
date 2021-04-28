package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Contact Us</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground:#4b4276\n");
      out.write("\n");
      out.write(";\n");
      out.write("\t}\n");
      out.write("\th1{\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\tdiv.ex1{\n");
      out.write("\t\t  width: 900px;\n");
      out.write("\t\t  height: 500px;\n");
      out.write("  \t\t  margin: auto;\n");
      out.write("\t\t  border: 3px solid #fff;\n");
      out.write("\t\t  color: white;\n");
      out.write("\t\t  font-size: 20px;\n");
      out.write("\t\t  text-align: center;\n");
      out.write("\t\t  border-radius: 20px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\t<h1>Contact Us</h1>\n");
      out.write("\t<div class=\"ex1\" style=\"padding-top: 20px;\">We're happy to answer any questions ypu have to provide you with an estimate. <br> <br>Just send us a message in the form below with any questions you may have. <br> <br>\n");
      out.write("\t<form>\n");
      out.write("  <label for=\"fname\" style=\"padding-right: 500px;\">First name:</label><br> \n");
      out.write("  <input type=\"text\" style=\"height: 30px; width: 650px;\" id=\"fname\" name=\"fname\"><br>\n");
      out.write("  <label for=\"lname\" style=\"padding-right: 500px;\">Last name:</label><br>\n");
      out.write("  <input type=\"text\" id=\"lname\" name=\"lname\" style=\"height: 30px; width: 650px;\" >\n");
      out.write("  <label for=\"subject\" style=\"padding-right: 550px;\">Subject</label><br> \n");
      out.write("  <input type=\"text\" id=\"lname\" name=\"subject\" style=\"height: 30px; width: 650px;\" ><br>\n");
      out.write("  <label for=\"subject\" style=\"padding-right: 480px;\"> Your Message</label><br> \n");
      out.write("  <input type=\"text\" id=\"lname\" name=\"subject\" style=\"height: 150px; width: 650px;\" ><br><br>\n");
      out.write("  <a href=\"#\" style=\"color: white;\"> Back </a>\n");
      out.write("</form>\n");
      out.write("</br>\n");
      out.write("</div>\n");
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
