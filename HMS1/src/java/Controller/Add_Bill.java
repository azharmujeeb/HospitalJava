package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Add_Bill extends HttpServlet {


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
            String daysstayed = request.getParameter("daysstayed");
            String typeofroom = request.getParameter("typeofroom");
            String medicinefees = request.getParameter("medicinefees");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem","root","");
            java.sql.Statement stat = con.createStatement();
            String query = "insert into billing values('"+daysstayed+"','"+typeofroom+"','"+medicinefees+"','"+patientname+"')";
            stat.execute(query);
            System.out.println("Recorded!");
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/billing.jsp");
            req.include(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
            RequestDispatcher req = request.getRequestDispatcher("View/receptionist/billing.jsp");
            req.include(request, response);
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
