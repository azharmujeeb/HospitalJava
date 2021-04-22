<%-- 
    Document   : signup
    Created on : Mar 16, 2021, 12:41:17 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,700&display=swap" rel="stylesheet">
        <title>Sign Up</title>
        <style>
            
            *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    text-decoration: none;
}

body{
    font-family: 'Raleway', sans-serif;
    background: #000;
}

.background{
    background: url(https://theirishbalanceblog.files.wordpress.com/2019/03/stethoscope-2617701_1280.jpg?w=1180&h=610&crop=1) no-repeat;
    background-size: cover;
    background-size: 100%;
    display: flex;
}

.text{
    margin-top: 45vh;
    flex: 1;
}

.box{
    margin-top: 10vh;
    flex: 1;
}

.text{
    margin-left: 10%;
    font-weight: 300px;
}

.box{
    margin-left: 25%;
}

.text h1{
    font-size: 70px;
    color: blue;
    font-weight: 500;
    margin-top: 27vh;
}

.text p{
    font-size: 20px;
    color: blue;
    font-weight: 300;
}

.text p a{
    color: blue;
    font-weight: 700;
}

.form{
    background: transparent;
    color: black;
    box-sizing: border-box;
    display: flex;
    flex-direction: column;
    width: 250px;
    font-weight: bold;
}

input{
    margin: 20px 0;
    padding: 10px;
    background: transparent;
    border: none;
    outline: none;
    color: black;
    font-family: 'Raleway', sans-serif;
}

.username, .password, .fullname, .age, .address, .tele, .sex{
    border-bottom: 1px solid blueviolet;
    font-weight: bold;
}

.button{
    background: transparent;
    border: 1px solid #fff;
    color: black;
    font-size: 18px;
    font-weight: bold;
}

.button:hover{
    background: #fff;
    color: #000;
}
  


.fileUpload {
  float: left;
  position: relative;
  overflow: hidden;
  background-color: #4068E0;
  color: white;
  height: 30px;
  width: 120px;
  text-align: center;
  border: 2px solid #4068E0;
  border-radius: 20px;
  box-shadow: 2px 2px 1px 1px rgba(0, 0, 0, 0.4);
  -webkit-transition: prop 0.4s;
  -moz-transition: prop 0.4s;
  -ms-transition: prop 0.4s;
  -o-transition: prop 0.4s;
  transition: prop 0.4s;
}
.fileUpload:after {
  content: "";
  background: #85b7e8;
  display: block;
  position: absolute;
  opacity: 0;
  transition: all 0.8s;
  padding-top: 300%;
  padding-left: 350%;
  margin-left: -20px!important;
  margin-top: -120%;
  font-size: 20px;
  cursor: pointer;
  filter: alpha(opacity=0);
  height: 100%;
  text-align: center;
}

.fileUpload:active:after {
  padding: 0;
  margin: 0;
  opacity: 1;
  transition: 0s
}
.fileUpload input.upload {
  position: absolute;
  top: 0;
  right: 0;
  margin: 0;
  padding: 0;
  font-size: 20px;
  cursor: pointer;
  opacity: 0;
  filter: alpha(opacity=0);
  height: 100%;
  text-align: center;
}

.fileName {
  margin: 2px 0 0 130px;
  width: auto;
}

.updLabel {
  line-height: 30px;
  font-weight: bold;
}

#uploadFile {
  border: none;
  width: 150px;
  height: 30px;
}
        </style>
    </head>
    <body>
        
          <main>
        <div class="background">
            <div class="text">
                <h1>Sign Up</h1>
                <p>Have Account? <a href="Sign_in.jsp">Sign In</a></p>
            </div>
            <div class="box">
                <form class="form" action="Signup" method="post">
                    <input type="text" class="fullname" id="fullname" placeholder="Full Name" required>
                    <input type="text" class="age"  id="age" placeholder="Age" required>
                    <input type="text" class="address"  id="address" placeholder="Address" required>
                    <input type="text" class="tele"  id="tele" placeholder="Telephone Number" required>
                    <input type="text" class="sex" id="sex" placeholder="Sex" required>
                    
                    
                    <input type="text" class="username" id="username" placeholder="Username" required>
                    <input type="password" class="password" id="username" placeholder="Password" required>
              
                    <input type="submit" class="button" id="submit" value="Sign Up">
                </form>
            </div>
        </div>
    </main>
        
    </body>
</html>
