/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddPatientModel;
import Model.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author azhar
 */
public class Add_Patient extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            String fullname = request.getParameter("fullname");
            String loginid = request.getParameter("loginid");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String age = request.getParameter("age");
            String mobilenumber = request.getParameter("mobilenumber");
            String bloodgroup = request.getParameter("bloodgroup");
            String martialstatus = request.getParameter("martialstatus");
            String gender = request.getParameter("gender");
            String dateofbirth = request.getParameter("dateofbirth");
            String deceased = request.getParameter("deceased");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem","root","");
            java.sql.Statement stat = con.createStatement();
            String query = "insert into patient values('"+fullname+"','"+loginid+"','"+password+"','"+address+"','"+age+"','"+mobilenumber+"','"+bloodgroup+"','"+martialstatus+"','"+gender+"','"+dateofbirth+"','"+deceased+"')";
            stat.execute(query);
            System.out.println("Recorded!");
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/addPatient.jsp");
            req.include(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/addPatient.jsp");
            req.include(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
