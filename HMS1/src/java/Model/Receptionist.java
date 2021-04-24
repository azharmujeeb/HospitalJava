package Model;

import java.sql.PreparedStatement;

public class Receptionist {
    
    DBCon con = new DBCon();
    
    private String name;
    private String loginid;
    private String password;
    private String address;
    private String age;
    private String mobilenumber;
    private String gender;
    private String martialstatus;
    private String dateofbirth;
    private String qualification;
    private String datejoined;
    
    //All auto generated getters and setters
    public DBCon getCon() {
        return con;
    }

    public void setCon(DBCon con) {
        this.con = con;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMartialstatus() {
        return martialstatus;
    }

    public void setMartialstatus(String martialstatus) {
        this.martialstatus = martialstatus;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDatejoined() {
        return datejoined;
    }

    public void setDatejoined(String datejoined) {
        this.datejoined = datejoined;
    }
    
    
    //Register Doctor from Receptionist folder
    public boolean registerDoctor(){
        int x=0;
        
        try {
                PreparedStatement ps = con.createConnection().prepareStatement("insert into doctor(fullname, loginid, password, address, age, mobilenumber, gender, martialstatus, dateofbirth, qualification, datejoined)value(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, this.name);
                ps.setString(2, this.loginid);
                ps.setString(3, this.password);
                ps.setString(4, this.address);
                ps.setString(5, this.age);
                ps.setString(6, this.mobilenumber);
                ps.setString(7, this.gender);
                ps.setString(8, this.martialstatus);
                ps.setString(9, this.dateofbirth);
                ps.setString(10, this.qualification);
                ps.setString(11, this.datejoined);
                
                x = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x == 1;
    }
    
    
    
}
