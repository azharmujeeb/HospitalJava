package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About Us</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutUs.css\">\n");
      out.write("        <style id=\"aboutUs\">\n");
      out.write("            body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*, *:before, *:after {\n");
      out.write("  box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 33.3%;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  padding: 0 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("  margin: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".about-section {\n");
      out.write("  padding: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: #4b4276;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 0 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container::after, .row::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  border: none;\n");
      out.write("  outline: 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px;\n");
      out.write("  color: white;\n");
      out.write("  background-color: #4b4276;\n");
      out.write("  text-align: center;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("  background-color: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 650px) {\n");
      out.write("  .column {\n");
      out.write("    width: 100%;\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"about-section\">\n");
      out.write("            <h1>Ceylon Hospital</h1>\n");
      out.write("            <p>Welcome to Ceylon Hospital.</p>\n");
      out.write("            <p>Our doctors and staff ensure that your needs are carefully and lovingly looked after.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h2 style=\"text-align:center\">Our Team</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <img src=\"Mujeeb.jpeg\" alt=\"J A Mujeeb\" style=\"width:100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <h2>J A Mujeeb</h2>\n");
      out.write("                  <p class=\"title\">Project Leader</p>\n");
      out.write("                  <p>Plymout ID : 10707284</p>\n");
      out.write("                  <p>10707284@students.plymouth.ac.uk</p>\n");
      out.write("                  <p>amujeeb@students.nsbm.ac.lk</p>\n");
      out.write("                  <p><button class=\"button\">Contact</button></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <img src=\"\" alt=\"G M D D Ratnayake\" style=\"width:100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <h2>G M D D Ratnayake</h2>\n");
      out.write("                  <p class=\"title\">Receptionist and Admin</p>\n");
      out.write("                  <p>Plymout ID : 10707351</p>\n");
      out.write("                  <p>10707351@students.plymouth.ac.uk</p>\n");
      out.write("                  <p>gmddratnayake@students.nsbm.ac.lk</p>\n");
      out.write("                  <p><button class=\"button\">Contact</button></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <img src=\"\" alt=\"S O Perera\" style=\"width:100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <h2>S O Perera</h2>\n");
      out.write("                  <p class=\"title\">Report Module</p>\n");
      out.write("                  <p>Plymout ID : 10707315</p>\n");
      out.write("                  <p>10707315@students.plymouth.ac.uk</p>\n");
      out.write("                  <p>soperera@students.nsbm.ac.lk</p>\n");
      out.write("                  <p><button class=\"button\">Contact</button></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <img src=\"\" alt=\"M D A Medhavi\" style=\"width:100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <h2>M D A Medhavi</h2>\n");
      out.write("                  <p class=\"title\">Doctor</p>\n");
      out.write("                  <p>Plymout ID : 10707278</p>\n");
      out.write("                  <p>10707278students.plymouth.ac.uk</p>\n");
      out.write("                  <p>mdamedhavi@students.nsbm.ac.lk</p>\n");
      out.write("                  <p><button class=\"button\">Contact</button></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <img src=\"\" alt=\"S S N S Nevins\" style=\"width:100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <h2>S S N S Nevins</h2>\n");
      out.write("                  <p class=\"title\">Bill Module</p>\n");
      out.write("                  <p>Plymout ID : 10707291</p>\n");
      out.write("                  <p>10707291@students.plymouth.ac.uk</p>\n");
      out.write("                  <p>snsnevins@students.nsbm.ac.lk</p>\n");
      out.write("                  <p><button class=\"button\">Contact</button></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <img src=\"\" alt=\"P L Dilhani\" style=\"width:100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                  <h2>P L Dilhani</h2>\n");
      out.write("                  <p class=\"title\">Patient</p>\n");
      out.write("                  <p>Plymout ID : 10709402</p>\n");
      out.write("                  <p>10709402@students.plymouth.ac.uk</p>\n");
      out.write("                  <p>pldilhani@students.nsbm.ac.lk</p>\n");
      out.write("                  <p><button class=\"button\">Contact</button></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
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
