<%-- 
    Document   : updateRoom
    Created on : Apr 20, 2021, 7:06:20 PM
    Author     : azhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Receptionist</title>
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
			
		</div>
            </div>
        </div>
    </body>
</html>