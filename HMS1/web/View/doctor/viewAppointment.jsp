<%-- 
    Document   : viewAppointment
    Created on : Apr 22, 2021, 12:40:09 PM
    Author     : azhar
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Appointment</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/ea60233838.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Receptionist.css">
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
        
        <style id="dilhani">
.wrapper2{
    position: absolute;
    top: 30%;
    left: 50%;
    transform: translate(-50%, -50%);
    background:#4b4276;
    max-width: 750px;
    max-height: 60px;
    width: 100%;
    padding: 10px;
    display: flex;
    justify-content: space-between;
    border-radius: 8px;
}

.wrapper2 .input {
    width: 85%;
    padding-left: 15px ;
    border: none;
    border-radius: 5px;
    font-weight: bold;
    font-size: 18px;
}

.searchbtn .fas{
    position: absolute;
    transform: translate(-50%, -50%);
    font-size: 18px;
}

/*button{
    background-color: #e1dbff;
    font-weight: bold;
    font-size: 20px;
    border-radius: 35px;
    padding: 8px 15px;
    border: none;
    outline: none;
    cursor: pointer;
}*/

/*button{
	background-color: #e1dbff;
	color: black;
	font-weight: bold;
	width: 100%;
	padding: 0 60px;
        padding-left: 20px;
        padding-right: 20px;
	border-radius: 20px;
	font-size: 19px;
	margin: 12PX;
	border: none;
	outline: none;
	cursor: pointer;
}*/

*{
	box-sizing: border-box;
}

.table{
    margin-top: 40px;
	width: 100%;
	border-collapse: collapse;
        top: 45%;
}

.table td,.table th{
  padding:12px 15px;
  border:1px solid white;
  text-align: center;
  font-size:16px;
}

.table th{
	background-color: #4b4276;
	color:#ffffff;
}

.table tbody tr:nth-child(even){
	background-color: #f5f5f5;
}



@media(max-width: 500px){
	.table thead{
		display: none;
	}

	.table, .table tbody, .table tr, .table td{
		display: block;
		width: 100%;
	}
	.table tr{
		margin-bottom:15px;
	}
	.table td{
		text-align: right;
		padding-left: 50%;
		text-align: right;
		position: relative;
	}
	.table td::before{
		content: attr(data-label);
		position: absolute;
		left:0;
		width: 50%;
		padding-left:15px;
		font-size:15px;
		font-weight: bold;
		text-align: left;
	}
}

h2{
    color: #6A5ACD;
}

.nav-area {
       text-align:right;
	}
 .nav-area li a {
		padding: 5px;
		font-size: 15px;
	}
 .nav-area {
		float: none;
		margin-top: 0; 
	}
.nav-area {
	float: right;
	list-style: none;
	margin-top: 30px;
}
.nav-area li {
	display: inline-block;
}
.nav-area li a {
	color:#0000CD;
	text-decoration: none;
	padding: 5px 20px;
	font-family: poppins;
	font-size: 16px;
	text-transform: uppercase;
}
.nav-area li a:hover {
	background: #fff;
	color: #333;
}
        </style>
    </head>
    <body>
        <div class="mainContainer">
            <div class="wrapper">
		<div class="sidebar">
			<h2>View Appointment</h2>
			<ul>
				<li><a href="updateProfile.jsp"><i class="fas fa-pen-alt"></i>Update Profile</a></li>
                                <li><a href="viewAppointment.jsp"><i class="far fa-calendar-check"></i> View Appointment</a></li>
                                <li><a href="viewPatient.jsp"><i class="fas fa-user-injured"></i>View Patient</a></li>
                                <li><a href="viewRoom.jsp"><i class="fas fa-hospital-alt"></i>View Room</a></li>
                                <li><a href="dischargePatient.jsp"><i class="fas fa-eject"></i>Discharge Patient</a></li>
			</ul>
		</div>
		<div class="main_content">
                    <div class="info">
                        <div class="sign-up-form">
                            <form method="get" >
                                    <center>
                                        <div class="filter"></div>
                                       <table class="table" >
                                           <th>Login ID</th>
                                           <th>Full Name</th>
                                           <th>Age</th>
                                           <th>Mobile Number</th>
                                           <th>Blood Group</th>
                                           <th>Type of Sickness</th>
                                           <th>Appointment Date</th>
                                           <th>Appointment Time</th>


                                        <%    
                                      try{
                                         Class.forName("com.mysql.jdbc.Driver");
                                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsystem","root","");
                                         Statement stat = con.createStatement();
                                         
                                         String sqlstr = "select * from appointment";
                                         ResultSet rs = stat.executeQuery(sqlstr);
                                         while(rs.next()){

                                         %>
                                             <tr>
                                                 <td><%=rs.getString("loginid")%></td>
                                                 <td><%=rs.getString("fullname")%></td>
                                                 <td><%=rs.getInt("age")%></td>
                                                 <td><%=rs.getInt("mobilenumber")%></td>
                                                 <td><%=rs.getString("bloodgroup")%></td>
                                                 <td><%=rs.getString("typeofsickness")%></td>
                                                 <td><%=rs.getString("appointmentdate")%></td>
                                                 <td><%=rs.getString("appointmenttime")%></td>
                                             </tr>
                                       <%      
                                         }
                            }
                                         catch(Exception e){
                                                 System.out.println(e.getMessage());
                                                 }
                                 %>   
                                       </table>                                                                 
                                     </center>  
                                </form>
                        </div>
                    </div>
		</div>
            
        </div>
    </body>
</html>
