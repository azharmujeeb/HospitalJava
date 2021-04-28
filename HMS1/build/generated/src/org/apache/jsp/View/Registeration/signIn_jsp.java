package org.apache.jsp.View.Registeration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login</title>\n");
      out.write("        <style id=\"bg\">\n");
      out.write("            body{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\t/*background-image: url(signup.jpg);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;*/\n");
      out.write("\tbackground-color: #4b4276;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-up-form{\n");
      out.write("\twidth: 300px;\n");
      out.write("\tbox-shadow: 0 0 3px 0 rgba(0,0,0,0.3);\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tpadding: 20px;\n");
      out.write("\tmargin: 8% auto 0;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbackground-color: rgb(243,245,249);\n");
      out.write("\tborder-radius: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-up-form h1{\n");
      out.write("\tcolor: #4b4276;\n");
      out.write("\tmargin-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-box{\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tmargin: 10px 0;\n");
      out.write("\twidth: 90%;\n");
      out.write("\tborder: 1px solid #999;\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"]:focus,input[type=\"password\"]:focus{\n");
      out.write("\tborder-bottom: 3.5px solid #b2a9de;\n");
      out.write("\tborder-bottom-right-radius: 20px;\n");
      out.write("\tcolor: black;\n");
      out.write("\ttransition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("::placeholder{\n");
      out.write("\tcolor: #7f77a6;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button{\n");
      out.write("\tbackground-color: #4b4276;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tmargin: 10px 0;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                    <div class=\"main_content\">\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                    <div class=\"sign-up-form\">\n");
      out.write("                                            <h1>Receptionist Login</h1>\n");
      out.write("                                            <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Receptionist_Signin\">\n");
      out.write("                                                    <input type=\"text\" class=\"input-box\" name=\"loginid\" placeholder=\"Login Id\">\n");
      out.write("                                                    <input type=\"password\" class=\"input-box\" name=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                                                    <p><span><input type=\"checkbox\"></span> I agree to the terms and conditions.</p>\n");
      out.write("                                                    <button type=\"submit\" id=\"loginbtn\" class=\"signup-btn\">Login</button>\n");
      out.write("                                            </form>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
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
