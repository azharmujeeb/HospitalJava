/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class Cancel extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cancel</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cancel at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      response.setContentType("text/html; charset=UTF-8");
      try(PrintWriter out = response.getWriter())
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/patien","root","");
          Statement stat = con.createStatement();
             
             String idnumber = request.getParameter("idnumber");
             String sqlstr = "delete * from appointment where idnumber='"+idnumber+"' ";
             ResultSet rs = stat.executeQuery(sqlstr);
             System.out.println("Your Appointment is Deteted");
      }
       catch (Exception e) {
            e.printStackTrace();
       }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
