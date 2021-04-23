<%-- 
    Document   : feedback
    Created on : Apr 22, 2021, 7:00:58 PM
    Author     : azhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Feedback</title>
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
	background-color: #e1dbff;
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
        <style id="dilhani">
            
 body{
 padding: 0;
 margin: 0;
 line-height: 1.5;
 box-sizing: border-box;
 color: #4b4276;
}

#fancy-form{
 background: #e1dbff;
 background-size: cover;
 background-position: center;
 height: 100vh;
}

#fancy-form .container{
  width: 80%;
  margin: auto;
  overflow: hidden;
}

/* main div */
.form-sections{
  margin-top: 5rem;
  display: grid;
  grid-gap: 5rem;
  grid-template-columns: repeat(2, 1fr);
}

/* Form-left styling */
.Form-left h1{
  color: #4b4276;
  padding: 0;
  margin: 0;
}

.Form-left h4{
  padding: 0;
  margin: 0;
  color: #4b4276;
}
.line{
  border-bottom: 2px solid rgb(12, 168, 207);
  width: 8%;
  margin-left: 0;
}
.Form-left span{
  color: grey;
  font-weight: bold;
}

.Form-left hr{
  width: 25rem;
  margin-left: 0;
  border: 1px solid #4b4276;
}


.fa {
  padding: 8px;
  font-size: 18px;
  width: 50px;
  text-align: center;
  text-decoration: none;
 
  color: rgb(187, 182, 182);
}
.fa:hover{
  color: rgb(16, 135, 190);;
}


.Form-right h1{
  color: #4b4276;
  padding: 0;
  margin: 0;
}

form{
  padding-top: 2rem;
}

form h5{
  padding: 0;
  margin: 0;
  color: #4b4276;
}
form input{
  padding:0.6rem;
  width: 27rem;
  border: none;
  background-color: rgba(136, 133, 133, 0.3);
  color: #4b4276;
  font-weight: bold;
  font-size: 18px;
  border: none;
  outline:none;
}

form textarea{
  padding:0.6rem;
  width: 27rem;
  border: none;
  background-color:rgba(136, 133, 133, 0.3);
  color: #4b4276;
  font-weight: bold;
  font-size: 18px;
  border: none;
  outline:none;
 }

 .button{
    width: 9rem;
    background: #4b4276;
    padding: 5px;
    outline: none;
    border-color: transparent;
    color: #fff;
    font-size: 20px;
    font-weight: bold;
    letter-spacing: 2px;
    text-align: center;
    margin-top: 0.9rem;
    border-radius: 50px;
    cursor: pointer;
 }
        </style>
    </head>
    <body>
        <div class="mainContainer">
            <div class="wrapper">
		<div class="sidebar">
			<h2>Feedback</h2>
			<ul>
                                <li><a href="viewAppoinment.jsp"><i class="fas fa-calendar-check"></i>View Appointment</a></li>
				<li><a href="appointment.jsp"><i class="fas fa-book-medical"></i>Book Appointment</a></li>
                                <li><a href="cancelAppointment.jsp"><i class="fas fa-window-close"></i>Cancel Appointment</a></li>
                                <li><a href="feedback.jsp"><i class="fas fa-comments"></i>Feedback</a></li>
			</ul>
		</div>
		<div class="main_content">
                            <form id="loginForm" accept="#">
                                 <section id="fancy-form">
                                    <div class="container">
                                     <div class="form-sections">

                                       <div class="Form-left">
                                         <h1>Get In Touch With Us</h1>
                                         <p>Contact us for new services and updates. subscribe our news letter :)</p><br>

                                          <h4>ADDRESS</h4>
                                          <span>123, Main Street, Colombo</span>
                                          <br><br>


                                         <h4>PHONE</h4>
                                          <span>(+94)77 003 3300</span>
                                          <br><br>

                                        <h4>EMAIL</h4>
                                        <span>ceylonhospital@gmail.com</span>
                                        <br>


                                           <a href="#" class="fa fa-facebook"></a>
                                           <a href="#" class="fa fa-twitter"></a>
                                           <a href="#" class="fa fa-google"></a>
                                           <a href="#" class="fa fa-linkedin"></a>

                                       </div>


                                        <div class="Form-right">
                                        <h1>Contact Us</h1>
                                         

                                         <form action="Feedback" method="post">
                                           <h5>NAME</h5>
                                           <input type="text" id="name" name="name"><br><br>
                                           <h5>EMAIL</h5>
                                           <input type="email" id="email" name="email"><br><br>
                                           <h5>PHONE</h5>
                                           <input type="number" id="number"name="number"><br><br>
                                           <h5>YOUR MESSAGE</h5>
                                           <textarea name="msg" id="msg" name="msg" cols="50" rows="7"></textarea><br>
                                           <input type="submit" class="button" name="submit" id="submit" value="Send">


                                         </form>
                                       </div>
                                     </div>
                                     </div>


                                 <!--<div id= "footer" style="text-align: center>
                                 <ul class="nav-area">
                                 <li><a href="#"   ONCLICK="window.location.href='index2.html'"><b><u>GO BACK</u></b></a></li>
                                 </ul>
                                 </div>-->

                                   </section>
                            </form>
                        </div>
                    </div>
		</div>
            </div>
        </div>
    </body>
</html>