package Controller;

import Model.Receptionist;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addDoctor extends HttpServlet {

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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        PrintWriter out = response.getWriter();
        Receptionist user = new Receptionist();
        
        user.setName(request.getParameter("fullname"));
        user.setLoginid(request.getParameter("loginId"));
        user.setPassword(request.getParameter("password"));
        user.setAddress(request.getParameter("address"));
        user.setAge(request.getParameter("age"));
        user.setMobilenumber(request.getParameter("mobileNumber"));
        user.setGender(request.getParameter("gender"));
        user.setMartialstatus(request.getParameter("martialStatus"));
        user.setDateofbirth(request.getParameter("dateOfBirth"));
        user.setQualification(request.getParameter("qualification"));
        user.setDatejoined(request.getParameter("dateJoined"));
        
        if(user.registerDoctor(
        )){
            out.println("Success!");
        }else{
            out.println("Fail!");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
