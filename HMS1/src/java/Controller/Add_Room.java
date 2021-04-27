package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




public class Add_Room extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            String patientname = request.getParameter("patientname");
            String doctorname = request.getParameter("doctorname");
            String typeofsickness = request.getParameter("typeofsickness");
            String typeofroom = request.getParameter("typeofroom");
            String roomjoined = request.getParameter("roomjoined");

            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem","root","");
            java.sql.Statement stat = con.createStatement();
            String query = "insert into room values('"+patientname+"','"+doctorname+"','"+typeofsickness+"','"+typeofroom+"','"+roomjoined+"')";
            stat.execute(query);
            System.out.println("Recorded!");
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/addRoom.jsp");
            req.include(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/addRoom.jsp");
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
