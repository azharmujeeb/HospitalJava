<%-- 
    Document   : updateRoom
    Created on : Apr 20, 2021, 7:06:20 PM
    Author     : azhar
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Update Room</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/ea60233838.js" crossorigin="anonymous"></script>
        <style id="receptionist">
            @import url('https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@100&display=swap');

*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	list-style: none;
	text-decoration: none;
	font-family: Josefin Sans;
}

body{
	background: #f3f5f9;
        font-weight: bold;
}

.wrapper{
	display: flex;
	position: relative;
}

.wrapper .sidebar{
	position: fixed;
	width: 200px;
	height: 100%;
	background: #4b4276;
	padding: 30px 0;
}

.wrapper .sidebar h2{
	color: #fff;
	text-transform: uppercase;
	text-align: center;
	margin-bottom: 30px;
}

.wrapper .sidebar ul li{
	padding: 15px;
	border-bottom: 1px solid rgba(0,0,0,0.05);
	border-top: 1px solid rgba(225,225,225,0.05);
}

.wrapper .sidebar ul li a{
	color: #bdb8d7;
	display: block;
}

.wrapper .sidebar ul li a .fas{
	width: 25px;
}

.wrapper .sidebar ul li:hover{
	background: #594f8d
}

.wrapper .sidebar ul li:hover a{
	color: #fff;
}

.wrapper .main_content{
	width: 100%;
	margin-left: 200px;
	font-weight: bold;
}

.wrapper .main_content .header{
	padding: 20px;
	background: #fff;
	color: #717171;
	border-bottom: 1px solid #e0e4e8;
}

.wrapper .main_content .info{
	margin: 20px;
	color: #717171;
	line-height: 25px;
}

.wrapper .main_content .info div{
	margin-bottom: 20px;
}
        </style>
                <style id="main_content">
        .main_content{
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background-color: rgb(243,245,249);
}

.sign-up-form{
	width: 500px;
	box-shadow: 0 0 3px 0 rgba(0,0,0,0.3);
	background: #fff;
	padding: 50px;
	margin: auto;
	text-align: center;
	background-color: white;
}

.sign-up-form h1{
	color: #4b4276;
	margin-bottom: 30px;
}

.input-box{
    background-color: rgb(243,245,249);
	border-radius: 20px;
	padding: 8px;
	margin: 5px 0;
	width: 100%;
	border: 1px solid #999;
	outline: none;
	font-weight: bold;
        font-size: 19px
}

select{
    color: grey;
}

h1{
	margin-top: 20px;
}

::placeholder{
	color: 4b4276;
        text-align: center;
}

button{
	background-color: #4b4276;
	color: white;
	font-weight: bold;
	width: 100%;
	padding: 10px;
	border-radius: 20px;
	font-size: 19px;
	margin: 14px 0;
	border: none;
	outline: none;
	cursor: pointer;
}
        </style>
    </head>
    <body>
        <div class="mainContainer">
            <div class="wrapper">
		<div class="sidebar">
			<h2>Update Room</h2>
			<ul>
				<li><a href="addPatient.jsp"><i class="fas fa-user-plus"></i> Add Patient</a></li>
				<li><a href="patientInfo.jsp"><i class="fas fa-users"></i> Patient Information</a></li>
				<li><a href="updatePatient.jsp"><i class="fas fa-pen"></i> Update Patient</a></li>
                                <li><a href="addDoctor.jsp"><i class="fas fa-user-nurse"></i> Add Doctor</a></li>
                                <li><a href="updateDoctor.jsp"><i class="fas fa-pen"></i> Update Doctor</a></li>
                                <li><a href="doctorInfo.jsp"><i class="fas fa-users"></i>Doctor Information</a></li>
                                <li><a href="viewAppointment.jsp"><i class="fas fa-file-invoice"></i> View Appointment</a></li>
				<li><a href="addRoom.jsp"><i class="fas fa-hospital"></i> Add Room</a></li>
				<li><a href="updateRoom.jsp"><i class="fas fa-pen"></i> Update Room</a></li>
                                <li><a href="billing.jsp"><i class="fas fa-money-bill"></i> Billing</a></li>
				<li><a href="patientReport.jsp"><i class="fas fa-file-invoice"></i> Patient Report</a></li>
			</ul>
		</div>
		<div class="main_content">
                    <div class="info">
                        <div class="sign-up-form">
                            <h1>Update Room</h1>
                            <form method="post" action="${pageContext.request.contextPath}/Update_Room">
                                
                                <select class="input-box" name="patientname" style="padding-left :130px;  color: black;">
                                    <option>Select Patient</option>
                                    <%
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem","root","");
                                            Statement st = con.createStatement();
                                            String query = "select fullname from patient";
                                            ResultSet rs = st.executeQuery(query);
                                            while(rs.next()){
                                                %>
                                                <option><%=rs.getString("fullname")%></option>
                                                <%
                                            }
                                            
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    %>
                                </select>
                                
                                <!--<input type="text" class="input-box" name="doctorname" placeholder="Doctor Name">-->
                                <select class="input-box" name="doctorname" style="padding-left :130px;  color: black;">
                                    <option>Select Doctor</option>
                                    <%
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem","root","");
                                            Statement st = con.createStatement();
                                            String query = "select fullname from doctor";
                                            ResultSet rs = st.executeQuery(query);
                                            while(rs.next()){
                                                %>
                                                <option><%=rs.getString("fullname")%></option>
                                                <%
                                            }
                                            
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    %>
                                </select>
                                
                                <select name="typeofsickness" placeholder="Type Of Sickness" class="input-box" style="padding-left :130px; color: black; font-weight: bold;">
                                    <option>Type Of Sickness</option>
                                    <option value="allergies">Allergies</option>
                                    <option value="coldAndFlu">Colds and Flu</option>
                                    <option value="conjuctivitis">Conjunctivitis</option>
                                    <option value="diarrhea">Diarrhea</option>
                                    <option value="headaches">Headaches</option>
                                    <option value="stomachAches">Stomach Aches</option>
                                    <option value="other">Other</option>
                                </select>
                                
                                <select name="typeofroom" placeholder="Type Of Room" class="input-box" style="padding-left :140px; color: black; font-weight: bold;">
                                    <option>Type Of Room</option>
                                    <option value="vip">VIP Room</option>
                                    <option value="normal">Normal Room</option>
                                    <option value="doubleRoom">Double Room</option>
                                </select>
                                
                                <!--<input type="text" class="input-box" name="roomjoined" placeholder="Room Joined" onfocus="(this.type='date')" onblur="(this.type='text')">-->
                                <input type="text" class="input-box" name="roomjoined" placeholder="Room Joined" style="color: black; font-weight: bold;">
                                
                                <button type="submit" id="updateRoom" class="signup-btn">Update Room</button>
                            </form>
                        </div>
                    </div>
		</div>
            </div>
        </div>
    </body>
</html>