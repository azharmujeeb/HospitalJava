package Model;

import java.sql.*;

public class DoctorLoginDao {
    
    public static boolean validate(String loginid, String password){
        
        boolean status = false;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String url = "jdbc:mysql://localhost:3306";
        String dbName = "hmsystem";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pass = "";
        
        try {
            
            
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName, userName, pass);
            
            pst = conn.prepareStatement("select * from doctor where loginid = ?, password = ?");
            pst.setString(1, loginid);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
            status = rs.next();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
            
        }
        
        return status;
        
    }
    
}
