/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class Signup extends HttpServlet {
 int age,tele;
 String fullname,address,sex,username,password;
  Connection con;
  Statement stat;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Signup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Signup at " + request.getContextPath() + "</h1>");
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
            fullname = request.getParameter("fullname");
            age = Integer.parseInt(request.getParameter("age"));
            address = request.getParameter("address");
            tele = Integer.parseInt(request.getParameter("tele"));
            sex = request.getParameter("sex");
            username = request.getParameter("username");
            password = request.getParameter("password");
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patien","root","");
            stat= con.createStatement();
            String query = "insert into signup values('"+fullname+"','"+age+"','"+address+"','"+tele+"','"+sex+"','"+username+"','"+password+"') ";
            stat.execute(query);
            
            
           /** ps.setString(1,fullname );
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.setInt(4, tele);
            ps.setString(5, sex);
            ps.setString(6, username);
            ps.setString(7, password);
            
            ps.executeUpdate();
         */  
            
            
        } 
        catch (Exception e) {
            System.out.println("send");
           
        } 
      
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
