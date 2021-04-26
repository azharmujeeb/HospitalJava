
package Model;

import java.sql.*;

public class AddPatientModel {
    
    DBCon con = new DBCon();
    
    private String fullname, loginid, password, address, age, mobilenumber, bloodgroup, martailstatus, gender, dateofbirth, deceased;
    
    public boolean registerPatient(){
        
        int x=0;
        
        try {
            
            PreparedStatement ps = con.createConnection().prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, this.fullname);
            ps.setString(2, this.loginid);
            ps.setString(3, this.password);
            ps.setString(4, this.address);
            ps.setString(5, this.age);
            ps.setString(6, this.mobilenumber);
            ps.setString(7, this.bloodgroup);
            ps.setString(8, this.martailstatus);
            ps.setString(9, this.gender);
            ps.setString(10, this.dateofbirth);
            ps.setString(11, this.deceased);
            
            x=ps.executeUpdate();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return x==1;
        
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getMartailstatus() {
        return martailstatus;
    }

    public void setMartailstatus(String martailstatus) {
        this.martailstatus = martailstatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getDeceased() {
        return deceased;
    }

    public void setDeceased(String deceased) {
        this.deceased = deceased;
    }
    
    
}
