<%-- 
    Document   : appointment
    Created on : Apr 22, 2021, 6:59:50 PM
    Author     : azhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Book Appointment</title>
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
	width: 68%;
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
			<h2>Book Appointment</h2>
			<ul>
                                <li><a href="viewAppoinment.jsp"><i class="fas fa-calendar-check"></i>View Appointment</a></li>
				<li><a href="appointment.jsp"><i class="fas fa-book-medical"></i>Book Appointment</a></li>
                                <li><a href="cancelAppointment.jsp"><i class="fas fa-window-close"></i>Cancel Appointment</a></li>
                                <li><a href="feedback.jsp"><i class="fas fa-comments"></i>Feedback</a></li>
                    </ul>
		</div>
		<div class="main_content">
                    <div class="info">
                        <div class="sign-up-form">
                            <h1>Book Appointment</h1>
                            <form method="post" action="${pageContext.request.contextPath}/Book_Appointment">
                                <input type="text" class="input-box" name="loginid" placeholder="Login ID">
                                <input type="text" class="input-box" name="fullname" placeholder="Full Name">
                                <input type="text" class="input-box" name="age" placeholder="Age">
                                <input type="number" class="input-box" name="mobilenumber" placeholder="Mobile Number">
                                <input type="text" class="input-box" name="bloodgroup" placeholder="Blood Group">
                                <select name="typeofsickness" placeholder="Category" class="input-box" style="padding-left: 150px; color: grey;">
                                    <option>Type of Sickness</option>
                                    <option value="allergies">Allergies</option>
                                    <option value="Cold And Flu">Colds and Flu</option>
                                    <option value="conjuctivitis">Conjunctivitis</option>
                                    <option value="diarrhea">Diarrhea</option>
                                    <option value="headaches">Headaches</option>
                                    <option value="stomachAches">Stomach Aches</option>
                                    <option value="other">Other</option>
                                </select>
                                <input type="text" class="input-box" name="appointmentdate" placeholder="Appointment Date" onfocus="(this.type='date')" onblur="(this.type='text')" style="text-align: center; color: grey;">
                                <input type="text" class="input-box" name="appointmnettime" placeholder="Appointment Time" onfocus="(this.type='time')" onblur="(this.type='text')" style="text-align: center; color: grey;">
                                <button type="submit" id="addDoctor" class="signup-btn">Book Appointment</button>
                            </form>
                        </div>
                    </div>
		</div>
            </div>
        </div>
    </body>
</html>
