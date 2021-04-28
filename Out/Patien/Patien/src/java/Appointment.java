/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Shape;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class Appointment extends HttpServlet {
    
      Connection con;
      Statement stat;
      String idnumber,name,group,categery,date,time;
      int age,tele;
   
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Appointment</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Appointment at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
      response.setContentType("text/html; charset=UTF-8");
      try(PrintWriter out = response.getWriter())
      {
          idnumber = request.getParameter("idnumber");
          name = request.getParameter("name");
          age = Integer.parseInt(request.getParameter("age"));
          tele = Integer.parseInt(request.getParameter("tele"));
          group = request.getParameter("group");
          categery = request.getParameter("categery");
          date =  request.getParameter("date");
          time =  request.getParameter("time");
          
          Class.forName("com.mysql.jdbc.Driver");
          con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/patien","root","");
          stat = con.createStatement();
          String query="insert into appointment values('"+idnumber+"','"+name+"','"+age+"','"+tele+"','"+group+"','"+categery+"','"+date+"','"+time+"'); ";
          stat.execute(query);
          System.out.println("Your Appointment is Send");
      }   catch (Exception e) {
              
          e.printStackTrace();
          }

    }
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
