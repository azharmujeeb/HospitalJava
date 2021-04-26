package org.apache.jsp.View.receptionist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class doctorInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <style>\n");
      out.write(".wrapper2{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 30%;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    background:#4b4276;\n");
      out.write("    max-width: 750px;\n");
      out.write("    max-height: 60px;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    border-radius: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper2 .input {\n");
      out.write("    width: 85%;\n");
      out.write("    padding-left: 15px ;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".searchbtn .fas{\n");
      out.write("    position: absolute;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button{\n");
      out.write("    background-color: #e1dbff;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 20px;\n");
      out.write("    border-radius: 35px;\n");
      out.write("    padding: 8px 15px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*button{\n");
      out.write("\tbackground-color: #e1dbff;\n");
      out.write("\tcolor: black;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 0 60px;\n");
      out.write("        padding-left: 20px;\n");
      out.write("        padding-right: 20px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 19px;\n");
      out.write("\tmargin: 12PX;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write("*{\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table{\n");
      out.write("    margin-top: 30px;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("        top: 45%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table td,.table th{\n");
      out.write("  padding:12px 15px;\n");
      out.write("  border:1px solid white;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size:16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table th{\n");
      out.write("\tbackground-color: #4b4276;\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table tbody tr:nth-child(even){\n");
      out.write("\tbackground-color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("@media(max-width: 500px){\n");
      out.write("\t.table thead{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.table, .table tbody, .table tr, .table td{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t}\n");
      out.write("\t.table tr{\n");
      out.write("\t\tmargin-bottom:15px;\n");
      out.write("\t}\n");
      out.write("\t.table td{\n");
      out.write("\t\ttext-align: right;\n");
      out.write("\t\tpadding-left: 50%;\n");
      out.write("\t\ttext-align: right;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t}\n");
      out.write("\t.table td::before{\n");
      out.write("\t\tcontent: attr(data-label);\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\twidth: 50%;\n");
      out.write("\t\tpadding-left:15px;\n");
      out.write("\t\tfont-size:15px;\n");
      out.write("\t\tfont-weight: bold;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("    color: #6A5ACD;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-area {\n");
      out.write("       text-align:right;\n");
      out.write("\t}\n");
      out.write(" .nav-area li a {\n");
      out.write("\t\tpadding: 5px;\n");
      out.write("\t\tfont-size: 15px;\n");
      out.write("\t}\n");
      out.write(" .nav-area {\n");
      out.write("\t\tfloat: none;\n");
      out.write("\t\tmargin-top: 0; \n");
      out.write("\t}\n");
      out.write(".nav-area {\n");
      out.write("\tfloat: right;\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin-top: 30px;\n");
      out.write("}\n");
      out.write(".nav-area li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write(".nav-area li a {\n");
      out.write("\tcolor:#0000CD;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tpadding: 5px 20px;\n");
      out.write("\tfont-family: poppins;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write(".nav-area li a:hover {\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #333;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mainContainer\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("\t\t\t<h2>Patient Information</h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"addPatient.jsp\"><i class=\"fas fa-user-plus\"></i> Add Patient</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"patientInfo.jsp\"><i class=\"fas fa-users\"></i> Patient Information</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"updatePatient.jsp\"><i class=\"fas fa-pen\"></i> Update Patient</a></li>\n");
      out.write("                                <li><a href=\"addDoctor.jsp\"><i class=\"fas fa-user-nurse\"></i> Add Doctor</a></li>\n");
      out.write("                                <li><a href=\"updateDoctor.jsp\"><i class=\"fas fa-pen\"></i> Update Doctor</a></li>\n");
      out.write("                                <li><a href=\"doctorInfo.jsp\"><i class=\"fas fa-users\"></i>Doctor Information</a></li>\n");
      out.write("                                <li><a href=\"viewAppointment.jsp\"><i class=\"fas fa-file-invoice\"></i> View Appointment</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"addRoom.jsp\"><i class=\"fas fa-hospital\"></i> Add Room</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"updateRoom.jsp\"><i class=\"fas fa-pen\"></i> Update Room</a></li>\n");
      out.write("                                <li><a href=\"billing.jsp\"><i class=\"fas fa-money-bill\"></i> Billing</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"patientReport.jsp\"><i class=\"fas fa-file-invoice\"></i> Patient Report</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main_content\">\n");
      out.write("                    <div class=\"info\">\n");
      out.write("                        <div class=\"sign-up-form\">\n");
      out.write("                            <h1 style=\"padding-left:500px;\">Doctor Information</h1>\n");
      out.write("                            <form method=\"get\" >\n");
      out.write("                                <center>\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        \n");
      out.write("                                        ");

                                            try {
                                                
                                                Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsytem","root","");
                                                String query = "SELECT loginid, fullname, address, age, mobilenumber, gender, martialstatus, dateofbirth, qualification, datejoined FROM doctor";
                                                Statement stat = con.createStatement();
                                                ResultSet rs = stat.executeQuery(query);
                                                while(rs.next()){
                                        
      out.write("            \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(rs.getString("loginid"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("fullname"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("age"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("mobilenumber"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("martialstatus"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("dateofbirth"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("qualification"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("datejoined"));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                                }    
                                            } catch (Exception e) {
                                                
                                                System.out.println(e.getMessage());
                                                    
                                            }
                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </center>\n");
      out.write("                            </form>\n");
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
