
package Model;

import java.sql.*;

public class PatientLoginDao {
    
    private String loginid, password;

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate(String loginid, String password) throws ClassNotFoundException, SQLException{
        boolean status = false;
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem", "root", "");
                com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("select * from patient where loginid = ? and password = ?")) 
        {
                ps.setString(1, this.loginid);
                ps.setString(2, this.password);
            
            System.out.println("prepareStatement");
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return status;
        
    }
    
}

