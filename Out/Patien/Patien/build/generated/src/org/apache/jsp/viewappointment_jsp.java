package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class viewappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Appointment</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("body{   background: url(\"https://media.istockphoto.com/photos/black-stethoscope-on-blue-background-picture-id1179610553?k=6&m=1179610553&s=612x612&w=0&h=v6Wj8AcJx6YppS-ulxEx_g4dihKHCFQv3qEht7aLIOE=\");\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:20px;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*{\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("        top: 45%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table td,.table th{\n");
      out.write("  padding:12px 15px;\n");
      out.write("  border:1px solid #ddd;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size:16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table th{\n");
      out.write("\tbackground-color: darkblue;\n");
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
      out.write("    color:#6A5ACD;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Your Appointment Detail is ...</h2>\n");
      out.write("        <form method=\"get\" >\n");
      out.write("        <center>\n");
      out.write("            <div class=\"filter\"></div>\n");
      out.write("           <table class=\"table\" >\n");
      out.write("               <th>ID Number</th>\n");
      out.write("               <th>Name</th>\n");
      out.write("               <th>Age</th>\n");
      out.write("               <th>Phone Number</th>\n");
      out.write("               <th>Blood Group</th>\n");
      out.write("               <th>Category</th>\n");
      out.write("               <th>Appointment Date</th>\n");
      out.write("               <th>Appointment Time</th>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("   ");
    
       
          try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patien","root","");
             Statement stat = con.createStatement();
             
             String idnumber = request.getParameter("idnumber");
             String sqlstr = "select * from appointment where idnumber='"+idnumber+"' ";
             ResultSet rs = stat.executeQuery(sqlstr);
             while(rs.next()){
            
             
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                     <td>");
      out.print(rs.getString("idnumber"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getInt("age"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getInt("tele"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getString("group"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getString("categery"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getString("time"));
      out.write("</td>\n");
      out.write("                 </tr>\n");
      out.write("           ");
      
             }
}
             catch(Exception e){
                     
                     System.out.println(e.getMessage());

                     
                     }
                 
     
      out.write("   \n");
      out.write("           </table>                                                                 \n");
      out.write("         </center>  \n");
      out.write("        </form>    \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    <br>  \n");
      out.write("    <br>\n");
      out.write("    <br>  \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>   \n");
      out.write("    <br>  \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>     \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br> \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br> \n");
      out.write("<div id= \"footer\" style=\"text-align: center\">\t\n");
      out.write("<ul class=\"nav-area\">\n");
      out.write("<li><a href=\"#\"   ONCLICK=\"window.location.href='index2.html'\"><b><u>GO BACK</u></b></a></li>\n");
      out.write("</ul>\n");
      out.write("</div>     \n");
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
