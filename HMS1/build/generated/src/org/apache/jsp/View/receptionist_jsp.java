package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class receptionist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Receptionist</title>\n");
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
      out.write("\tbackground-color: rgb(243,245,249);\n");
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
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 19px;\n");
      out.write("\tmargin: 14px 0;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mainContainer\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("\t\t\t<h2>Receptionist</h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"receptionist/addPatient.jsp\"><i class=\"fas fa-user-plus\"></i> Add Patient</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"receptionist/patientInfo.jsp\"><i class=\"fas fa-users\"></i> Patient Information</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"receptionist/updatePatient.jsp\"><i class=\"fas fa-pen\"></i> Update Patient</a></li>\n");
      out.write("                                <li><a href=\"receptionist/addDoctor.jsp\"><i class=\"fas fa-user-nurse\"></i> Add Doctor</a></li>\n");
      out.write("                                <li><a href=\"receptionist/updateDoctor.jsp\"><i class=\"fas fa-pen\"></i> Update Doctor</a></li>\n");
      out.write("                                <li><a href=\"receptionist/doctorInfo.jsp\"><i class=\"fas fa-users\"></i>Doctor Information</a></li>\n");
      out.write("                                <li><a href=\"receptionist/viewAppointment.jsp\"><i class=\"fas fa-file-invoice\"></i> View Appointment</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"receptionist/addRoom.jsp\"><i class=\"fas fa-hospital\"></i> Add Room</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"receptionist/updateRoom.jsp\"><i class=\"fas fa-pen\"></i> Update Room</a></li>\n");
      out.write("                                <li><a href=\"receptionist/billing.jsp\"><i class=\"fas fa-money-bill\"></i> Billing</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"receptionist/patientReport.jsp\"><i class=\"fas fa-file-invoice\"></i> Patient Report</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main_content\">\n");
      out.write("                    <div class=\"info\">\n");
      out.write("                        <div class=\"sign-up-form\">\n");
      out.write("                            <h1>Welcome</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
