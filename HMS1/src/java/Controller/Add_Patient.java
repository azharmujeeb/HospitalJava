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
        
        //response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        AddPatientModel user = new AddPatientModel();
        
        user.setFullname(request.getParameter("fullname"));
        user.setLoginid(request.getParameter("loginid"));
        user.setPassword(request.getParameter("password"));
        user.setAddress(request.getParameter("address"));
        user.setAge(request.getParameter("age"));
        user.setMobilenumber(request.getParameter("mobilenumber"));
        user.setBloodgroup(request.getParameter("bloodgroup"));
        user.setMartailstatus(request.getParameter("martialstatus"));
        user.setGender(request.getParameter("gender"));
        user.setDateofbirth(request.getParameter("dateofbirth"));
        user.setDeceased(request.getParameter("deceased"));
        
        if (user.registerPatient()) {
            
            out.println("Success!");
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/addPatient.jsp");
            req.include(request, response);
            
        } else {
            
            out.println("Fail to add Patient");
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/addDoctor.jsp");
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
