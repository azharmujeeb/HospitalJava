package org.apache.jsp.View.patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Feedback</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/ea60233838.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Receptionist.css\">\n");
      out.write("        <style id=\"receptionist\">\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@100&display=swap');\n");
      out.write("\n");
      out.write("*{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tlist-style: none;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tfont-family: Josefin Sans;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground: #f3f5f9;\n");
      out.write("        font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar{\n");
      out.write("\tposition: fixed;\n");
      out.write("\twidth: 200px;\n");
      out.write("\theight: 100%;\n");
      out.write("\tbackground: #4b4276;\n");
      out.write("\tpadding: 30px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar h2{\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar ul li{\n");
      out.write("\tpadding: 15px;\n");
      out.write("\tborder-bottom: 1px solid rgba(0,0,0,0.05);\n");
      out.write("\tborder-top: 1px solid rgba(225,225,225,0.05);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar ul li a{\n");
      out.write("\tcolor: #bdb8d7;\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar ul li a .fas{\n");
      out.write("\twidth: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar ul li:hover{\n");
      out.write("\tbackground: #594f8d\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .sidebar ul li:hover a{\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .main_content{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin-left: 200px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .main_content .header{\n");
      out.write("\tpadding: 20px;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #717171;\n");
      out.write("\tborder-bottom: 1px solid #e0e4e8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .main_content .info{\n");
      out.write("\tmargin: 20px;\n");
      out.write("\tcolor: #717171;\n");
      out.write("\tline-height: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper .main_content .info div{\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <style id=\"main_content\">\n");
      out.write("        .main_content{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tbackground-color: #e1dbff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-up-form{\n");
      out.write("\twidth: 500px;\n");
      out.write("\tbox-shadow: 0 0 3px 0 rgba(0,0,0,0.3);\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tpadding: 50px;\n");
      out.write("\tmargin: auto;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbackground-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-up-form h1{\n");
      out.write("\tcolor: #4b4276;\n");
      out.write("\tmargin-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-box{\n");
      out.write("    background-color: rgb(243,245,249);\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tpadding: 8px;\n");
      out.write("\tmargin: 5px 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder: 1px solid #999;\n");
      out.write("\toutline: none;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("        font-size: 19px\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("::placeholder{\n");
      out.write("\tcolor: 4b4276;\n");
      out.write("        text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button{\n");
      out.write("\tbackground-color: #4b4276;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\twidth: 68%;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 19px;\n");
      out.write("\tmargin: 14px 0;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <style id=\"dilhani\">\n");
      out.write("            \n");
      out.write(" body{\n");
      out.write(" padding: 0;\n");
      out.write(" margin: 0;\n");
      out.write(" line-height: 1.5;\n");
      out.write(" box-sizing: border-box;\n");
      out.write(" color: #4b4276;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#fancy-form{\n");
      out.write(" background: #e1dbff;\n");
      out.write(" background-size: cover;\n");
      out.write(" background-position: center;\n");
      out.write(" height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#fancy-form .container{\n");
      out.write("  width: 80%;\n");
      out.write("  margin: auto;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* main div */\n");
      out.write(".form-sections{\n");
      out.write("  margin-top: 5rem;\n");
      out.write("  display: grid;\n");
      out.write("  grid-gap: 5rem;\n");
      out.write("  grid-template-columns: repeat(2, 1fr);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Form-left styling */\n");
      out.write(".Form-left h1{\n");
      out.write("  color: #4b4276;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Form-left h4{\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("  color: #4b4276;\n");
      out.write("}\n");
      out.write(".line{\n");
      out.write("  border-bottom: 2px solid rgb(12, 168, 207);\n");
      out.write("  width: 8%;\n");
      out.write("  margin-left: 0;\n");
      out.write("}\n");
      out.write(".Form-left span{\n");
      out.write("  color: grey;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Form-left hr{\n");
      out.write("  width: 25rem;\n");
      out.write("  margin-left: 0;\n");
      out.write("  border: 1px solid #4b4276;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".fa {\n");
      out.write("  padding: 8px;\n");
      out.write("  font-size: 18px;\n");
      out.write("  width: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write(" \n");
      out.write("  color: rgb(187, 182, 182);\n");
      out.write("}\n");
      out.write(".fa:hover{\n");
      out.write("  color: rgb(16, 135, 190);;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".Form-right h1{\n");
      out.write("  color: #4b4276;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form{\n");
      out.write("  padding-top: 2rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form h5{\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("  color: #4b4276;\n");
      out.write("}\n");
      out.write("form input{\n");
      out.write("  padding:0.6rem;\n");
      out.write("  width: 27rem;\n");
      out.write("  border: none;\n");
      out.write("  background-color: rgba(136, 133, 133, 0.3);\n");
      out.write("  color: #4b4276;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 18px;\n");
      out.write("  border: none;\n");
      out.write("  outline:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form textarea{\n");
      out.write("  padding:0.6rem;\n");
      out.write("  width: 27rem;\n");
      out.write("  border: none;\n");
      out.write("  background-color:rgba(136, 133, 133, 0.3);\n");
      out.write("  color: #4b4276;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 18px;\n");
      out.write("  border: none;\n");
      out.write("  outline:none;\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" .button{\n");
      out.write("    width: 9rem;\n");
      out.write("    background: #4b4276;\n");
      out.write("    padding: 5px;\n");
      out.write("    outline: none;\n");
      out.write("    border-color: transparent;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 20px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    letter-spacing: 2px;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 0.9rem;\n");
      out.write("    border-radius: 50px;\n");
      out.write("    cursor: pointer;\n");
      out.write(" }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mainContainer\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("\t\t\t<h2>Feedback</h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("                                <li><a href=\"viewAppoinment.jsp\"><i class=\"fas fa-calendar-check\"></i>View Appointment</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"appointment.jsp\"><i class=\"fas fa-book-medical\"></i>Book Appointment</a></li>\n");
      out.write("                                <li><a href=\"cancelAppointment.jsp\"><i class=\"fas fa-window-close\"></i>Cancel Appointment</a></li>\n");
      out.write("                                <li><a href=\"feedback.jsp\"><i class=\"fas fa-comments\"></i>Feedback</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main_content\">\n");
      out.write("                    <section id=\"fancy-form\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"form-sections\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"Form-left\">\n");
      out.write("                                    <h1>Get In Touch With Us</h1>\n");
      out.write("                                    <p>Contact us for new services and updates. subscribe our news letter :)</p><br>\n");
      out.write("\n");
      out.write("                                    <h4>ADDRESS</h4>\n");
      out.write("                                    <span>123, Main Street, Colombo</span>\n");
      out.write("                                    <br><br>\n");
      out.write("\n");
      out.write("                                    <h4>PHONE</h4>\n");
      out.write("                                    <span>(+94)77 003 3300</span>\n");
      out.write("                                    <br><br>\n");
      out.write("\n");
      out.write("                                    <h4>EMAIL</h4>\n");
      out.write("                                    <span>ceylonhospital@gmail.com</span>\n");
      out.write("                                    <br>\n");
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-google\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-linkedin\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"Form-right\">\n");
      out.write("                                    <h1>Contact Us</h1>\n");
      out.write("                                    <form  method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/feedback\">\n");
      out.write("                                        <h5>NAME</h5>\n");
      out.write("                                        <input type=\"text\" name=\"name\"><br><br>\n");
      out.write("                                        <h5>EMAIL</h5>\n");
      out.write("                                        <input type=\"email\" name=\"email\"><br><br>\n");
      out.write("                                        <h5>PHONE</h5>\n");
      out.write("                                        <input type=\"number\" name=\"phone\"><br><br>\n");
      out.write("                                        <h5>YOUR COMMENTS</h5>\n");
      out.write("                                        <textarea name=\"comments\" cols=\"50\" rows=\"7\"></textarea><br>\n");
      out.write("                                        <input type=\"submit\" class=\"button\" name=\"submit\" id=\"submit\" value=\"Send\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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