<%-- 
    Document   : contactUs
    Created on : Apr 18, 2021, 11:28:24 AM
    Author     : azhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Contact Us</title>
</head>
<style>
	body{
		background:#4b4276

;
	}
	h1{
		color: white;
		text-align: center;
	}
	div.ex1{
		  width: 900px;
		  height: 500px;
  		  margin: auto;
		  border: 3px solid #fff;
		  color: white;
		  font-size: 20px;
		  text-align: center;
		  border-radius: 20px;
	}
</style>
<body>
	<h1>Contact Us</h1>
	<div class="ex1" style="padding-top: 20px;">We're happy to answer any questions ypu have to provide you with an estimate. <br> <br>Just send us a message in the form below with any questions you may have. <br> <br>
	<form>
  <label for="fname" style="padding-right: 500px;">First name:</label><br> 
  <input type="text" style="height: 30px; width: 650px;" id="fname" name="fname"><br>
  <label for="lname" style="padding-right: 500px;">Last name:</label><br>
  <input type="text" id="lname" name="lname" style="height: 30px; width: 650px;" >
  <label for="subject" style="padding-right: 550px;">Subject</label><br> 
  <input type="text" id="lname" name="subject" style="height: 30px; width: 650px;" ><br>
  <label for="subject" style="padding-right: 480px;"> Your Message</label><br> 
  <input type="text" id="lname" name="subject" style="height: 150px; width: 650px;" ><br><br>
  <a href="#" style="color: white;"> Back </a>
</form>
</br>
</div>
</body>
</html>