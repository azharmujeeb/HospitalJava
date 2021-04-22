<%-- 
    Document   : Sign_in
    Created on : Mar 16, 2021, 11:45:24 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,700&display=swap" rel="stylesheet">
         <title>Sign In</title>
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
    height: 100vh;
    display: flex;
}

.text, .box{
    margin-top: 45vh;
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
    color:blue;
    font-weight: 700;
}

.form{
    background: transparent;
    color: black;
    box-sizing: border-box;
    display: flex;
    flex-direction: column;
    width: 250px;
}

input{
    margin: 20px 0;
    padding: 10px;
    background: transparent;
    border: none;
    outline: none;
    color: #fff;
    font-family: 'Raleway', sans-serif;
}

.username, .password{
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
            
        </style>
    </head>
    <body>
            
         <main>
           <div class="background">
            <div class="text">
                <h1>Sign In</h1>
                <p>No Account? <a href="signup.jsp">Sign up</a></p>
            </div>
            <div class="box">
                <form class="form">
                    <input type="text" class="username" id="username"placeholder="Username" required>
                    <input type="password" class="password"id="username" placeholder="Password" required>
                    <input type="submit" class="button" id="submit" value="Sign In">
                </form>
            </div>
          </div>
        </main>
    
    </body>
</html>
