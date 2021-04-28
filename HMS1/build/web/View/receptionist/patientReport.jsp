<%-- 
    Document   : patientReport
    Created on : Apr 20, 2021, 7:06:59 PM
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
            <style>
        h1{
            text-align:center ;
            color: rgb(106, 87, 161);
        }

        .logo {
		float: none;
		width: 30%;
		text-align: center;
		margin: auto;
	}

    .logo {
	float: left; 
    }
    
    .logo img {
	width: 40%;
	padding: 15px 0;
    } 
    

    h5,h4{
        color:rgb(35, 35, 39) ;
        font-family:'Times New Roman', Times, serif ;
        padding: 20px;  
    }
    table{
        width:70% ;
        font-family:'Times New Roman', Times, serif ;
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
	width: 80%;
	box-shadow: 0 0 3px 0 rgba(0,0,0,0.3);
	background: #fff;
	padding: 50px;
	margin: auto;
	text-align: left;
	background-color: white;
}

.sign-up-form h1{
	color: #4b4276;
	margin-bottom: 30px;
}

h1{
	margin-top: 20px;
}

</style>
    </head>
    <body>
        <div class="mainContainer">
            <div class="wrapper">
		<div class="sidebar">
			<h2>Patient Report</h2>
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
                            
                            <h1>Laboratory Report</h1>
                            
                            <div class="wrapper">
                                
                                <div class="logo">
                                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPQBVE8xEzQ9sc0yjRNOn7UyIvPcKztJ6oOA&usqp=CAU"   alt="logo">
                                </div>
                                <h5>Address : No 23, Colombo Road,Vijerama</h5><br>
                                <h5>Tel : +94751234123/ +94771231230</h5><br>
                                <h5>Fax : +94123451234</h5><br>
                                <h5>Email : ceylonhospital@gmail.com</h5><br>
                                <br>
                            </div>
                            
                            <br>
                            <br>

                            <p>
                                <b>
                                    <h4>
                                        &nbsp; &nbsp;  &nbsp; Patient Name &nbsp;<br>
                                        &nbsp; &nbsp;  &nbsp; REF. Doctor  &nbsp; :<br>
                                        &nbsp; &nbsp;  &nbsp; Service REF No &nbsp; :<br>
                                        &nbsp; &nbsp;  &nbsp; Age &nbsp; :<br>
                                        &nbsp; &nbsp;  &nbsp; Sample Collected &nbsp;:<br>
                                        &nbsp; &nbsp;  &nbsp; Printed Date &nbsp;:
                                    </h4>
                                </b>
                            </p>

                         <br>
                         <br>

                         <table align="center">
                            <thead>
                                <th>Test.No</th>
                                <th>Test Name</th>
                                <th>Result</th>
                                <th>Flag</th>
                                <th>REF.Range</th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1.</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>2.</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>3.</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>4.</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                            </tbody>
                        </table>

                        <br>
                        <br>
                        <br>

                        <p > 
                            <h4>
                                Signature   &nbsp  &nbsp : &nbsp.......................<br>
                                Date  &nbsp  &nbsp : &nbsp ....................
                            </h4>
                        </p>
                        </div>
                    </div>
		</div>
            </div>
        </div>
    </body>
</html>
