<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
        <style id="bg">
            body{
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	/*background-image: url(signup.jpg);
	background-size: cover;
	background-position: center;*/
	background-color: #4b4276;
}

.sign-up-form{
	width: 300px;
	box-shadow: 0 0 3px 0 rgba(0,0,0,0.3);
	background: #fff;
	padding: 20px;
	margin: 8% auto 0;
	text-align: center;
	background-color: rgb(243,245,249);
	border-radius: 15px;
}

.sign-up-form h1{
	color: #4b4276;
	margin-bottom: 30px;
}

.input-box{
	border-radius: 20px;
	padding: 10px;
	margin: 10px 0;
	width: 90%;
	border: 1px solid #999;
	outline: none;
}

input[type="text"]:focus,input[type="password"]:focus{
	border-bottom: 3.5px solid #b2a9de;
	border-bottom-right-radius: 20px;
	color: black;
	transition: 0.2s ease;
}

h1{
	margin-top: 20px;
}

::placeholder{
	color: #7f77a6;
	font-weight: bold;
}

button{
	background-color: #4b4276;
	color: white;
	font-weight: bold;
	width: 100%;
	padding: 10px;
	border-radius: 20px;
	font-size: 15px;
	margin: 10px 0;
	border: none;
	outline: none;
	cursor: pointer;
}
        </style>
</head>
    <body>
            <div class="wrapper">
                    <div class="main_content">
                            <div class="info">
                                    <div class="sign-up-form">
                                            <h1>Receptionist Login</h1>
                                            <form method="post" action="${pageContext.request.contextPath}/Receptionist_Signin">
                                                    <input type="text" class="input-box" name="loginid" placeholder="Login Id">
                                                    <input type="password" class="input-box" name="password" placeholder="Enter your password">
                                                    <p><span><input type="checkbox"></span> I agree to the terms and conditions.</p>
                                                    <button type="submit" id="loginbtn" class="signup-btn">Login</button>
                                            </form>
                                    </div>
                            </div>
                    </div>
            </div>
    </body>
</html>
