package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class appointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Appointment Page</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("body{\n");
      out.write("          margin:0 auto;\n");
      out.write("\t  padding:0;\n");
      out.write("\t  background-size:cover;\n");
      out.write("          background-color:  #2a0df4;\n");
      out.write("          \n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("    color:black;\n");
      out.write("    text-align:center;\n");
      out.write("    font-size:40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("\t color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" #login{\n");
      out.write("\t\t       background-image:url(\"http://2.bp.blogspot.com/-3NmrvZWsIsI/UYHJZ1qsevI/AAAAAAAAt9Q/S83pTkMWD-k/s1600/Health+HD+Wallpaper+(1).jpeg\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write(" #form{\n");
      out.write("\t\t           height:650px;\n");
      out.write("\t\t\t   width:550px;\n");
      out.write("\t\t\t   font-size:15px;\n");
      out.write("\t\t\t   background-color:black;\n");
      out.write("\t\t\t   margin-top:-20px;\n");
      out.write("\t\t\t   margin-left:440px;\n");
      out.write("\t\t\t   opacity:0.8;\n");
      out.write("\t\t\t   font-family: 'Ubuntu', sans-serif;\n");
      out.write("\t\t\t   color:white;\n");
      out.write("\t\t\t   font-weight:bold;\n");
      out.write("\t  }\n");
      out.write("\t  \n");
      out.write(".container{\n");
      out.write("\t                 margin-left:1100px;\n");
      out.write("\t\t\t margin-top:-60px;\n");
      out.write("          }\n");
      out.write("\t  \n");
      out.write("\t  h3{\n");
      out.write("\t           text-align:center;\n");
      out.write("\t\t   color:green;\n");
      out.write("            }\n");
      out.write("\t  \n");
      out.write("\t  .b{\n");
      out.write("\t          height:30px;\n");
      out.write("\t\t  width:250px;\n");
      out.write("\t\t  margin-top:10px;\n");
      out.write("\t\t  margin-left:-10px;\n");
      out.write("\t  }\n");
      out.write("\t  \n");
      out.write("\t  .c{\n");
      out.write("\t          height:30px;\n");
      out.write("\t\t  width:250px;\n");
      out.write("\t\t  margin-top:10px;\n");
      out.write("\t\t  margin-left:-10px;\n");
      out.write("\t\t  color:white;\n");
      out.write("\t\t  background-color:green;\n");
      out.write("                  text-align: center;\n");
      out.write("\t  }\n");
      out.write("\t   \n");
      out.write("\t  a{\n");
      out.write("\t\t text-decoration:none;\n");
      out.write("\t\t color:green;\n");
      out.write("\t } \n");
      out.write("\t \n");
      out.write("\t .link{\n");
      out.write("\t         background-color:green;\n");
      out.write("\t\t padding:20px 30px;\n");
      out.write("\t\t opacity:0.9;\n");
      out.write("\t\t border:none;\n");
      out.write("\t\t display:inline-block;\n");
      out.write("\t\t font-size:16px;\n");
      out.write("\t\t margin:4px 2px;\n");
      out.write("\t\t cursor:pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".link a{\n");
      out.write("\t         color:white;\n");
      out.write("\t\t text-decoration:none;\n");
      out.write("\t\t text-align:left;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<body background=\"http://2.bp.blogspot.com/-3NmrvZWsIsI/UYHJZ1qsevI/AAAAAAAAt9Q/S83pTkMWD-k/s1600/Health+HD+Wallpaper+(1).jpeg\" >\n");
      out.write("<h1>Book Appointment</h1>\n");
      out.write("    <div id=\"login\">\n");
      out.write("\t<div class=\"container\">  \n");
      out.write("        <div class=\"link\">\n");
      out.write("\t  <h2>Back To</h2>\n");
      out.write("          <a href=\"index2.html\" ><p>Home Page</p></a>\n");
      out.write("\t\t \n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("\t    <div id=\"form\">\n");
      out.write("\t\t<pre>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action=\"Appointment\" method=\"post\">\n");
      out.write("\t\t     <input type=\"text\" name=\"idnumber\" id=\"idnumber\" placeholder=\" Your ID Number\" class=\"b\" required><br>         \n");
      out.write("\t\t     <input type=\"text\" name=\"name\" id=\"name\" placeholder=\" Your  Name\" class=\"b\" required><br> \n");
      out.write("                     <input type=\"text\" name=\"age\" id=\"age\" placeholder=\" Your Age\" class=\"b\"  required><br> \n");
      out.write("                     <input type=\"text\" name=\"tele\" id=\"tele\" placeholder=\" Your Telephone Number\"  class=\"b\"  required><br> \n");
      out.write("                     <input type=\"text\" name=\"group\" id=\"group\" placeholder=\" Your Blood Group\" class=\"b\" required><br>                      \n");
      out.write("        \t     <select name=\"categery\" name=\"categery\" id=\"categery\" placeholder=\"Category\" class=\"b\" required>\n");
      out.write("        \t     \t<option>Category </option>\n");
      out.write("                        <option value=\"Bone\">Bone</option>\n");
      out.write("        \t     \t<option value=\"Heart\">Heart</option>\n");
      out.write("        \t     \t<option value=\"Dentistry\">Dentistry</option>\n");
      out.write("                        <option value=\"mental\">Mental Health</option>\n");
      out.write("        \t     \t<option value=\"Surgery\">Surgery</option>\n");
      out.write("        \t     </select><br>           \n");
      out.write("\t\t     <input type=\"text\" name=\"date\" id=\"date\" placeholder=\"Appointment Date\" class=\"b\" required><br>            \n");
      out.write("\t\t     <input type=\"text\" name=\"time\" id=\"time\" class=\"b\" placeholder=\"Appointment Time\" required><br>\n");
      out.write("                     <input type=\"submit\" class=\"c\" name=\"submit\" id=\"submit\" value=\"Book\">\n");
      out.write("                     \n");
      out.write("                </form>\t\n");
      out.write("\t\t</pre>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("       \n");
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
