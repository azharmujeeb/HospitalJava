<%-- 
    Document   : appoinment
    Created on : Mar 30, 2021, 10:43:20 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointment Page</title>
        
        
        
        <style>
body{
          margin:0 auto;
	  padding:0;
	  background-size:cover;
          background-color:  #2a0df4;
          
}

h1{
    color:black;
    text-align:center;
    font-size:40px;
}

h2{
	 color:black;
}

 #login{
		       background-image:url("http://2.bp.blogspot.com/-3NmrvZWsIsI/UYHJZ1qsevI/AAAAAAAAt9Q/S83pTkMWD-k/s1600/Health+HD+Wallpaper+(1).jpeg");
      }

 #form{
		           height:650px;
			   width:550px;
			   font-size:15px;
			   background-color:black;
			   margin-top:-20px;
			   margin-left:440px;
			   opacity:0.8;
			   font-family: 'Ubuntu', sans-serif;
			   color:white;
			   font-weight:bold;
	  }
	  
.container{
	                 margin-left:1100px;
			 margin-top:-60px;
          }
	  
	  h3{
	           text-align:center;
		   color:green;
            }
	  
	  .b{
	          height:30px;
		  width:250px;
		  margin-top:10px;
		  margin-left:-10px;
	  }
	  
	  .c{
	          height:30px;
		  width:250px;
		  margin-top:10px;
		  margin-left:-10px;
		  color:white;
		  background-color:green;
                  text-align: center;
	  }
	   
	  a{
		 text-decoration:none;
		 color:green;
	 } 
	 
	 .link{
	         background-color:green;
		 padding:20px 30px;
		 opacity:0.9;
		 border:none;
		 display:inline-block;
		 font-size:16px;
		 margin:4px 2px;
		 cursor:pointer;
}

.link a{
	         color:white;
		 text-decoration:none;
		 text-align:left;
        }
        </style>
    </head>
    <body>
        
        
        
<body background="http://2.bp.blogspot.com/-3NmrvZWsIsI/UYHJZ1qsevI/AAAAAAAAt9Q/S83pTkMWD-k/s1600/Health+HD+Wallpaper+(1).jpeg" >
<h1>Book Appointment</h1>
    <div id="login">
	<div class="container">  
        <div class="link">
	  <h2>Back To</h2>
          <a href="index2.html" ><p>Home Page</p></a>
		 
      </div>
  </div>
	    <div id="form">
		<pre>
		
		<form action="Appointment" method="post">
		     <input type="text" name="idnumber" id="idnumber" placeholder=" Your ID Number" class="b" required><br>         
		     <input type="text" name="name" id="name" placeholder=" Your  Name" class="b" required><br> 
                     <input type="text" name="age" id="age" placeholder=" Your Age" class="b"  required><br> 
                     <input type="text" name="tele" id="tele" placeholder=" Your Telephone Number"  class="b"  required><br> 
                     <input type="text" name="group" id="group" placeholder=" Your Blood Group" class="b" required><br>                      
        	     <select name="categery" name="categery" id="categery" placeholder="Category" class="b" required>
        	     	<option>Category </option>
                        <option value="Bone">Bone</option>
        	     	<option value="Heart">Heart</option>
        	     	<option value="Dentistry">Dentistry</option>
                        <option value="mental">Mental Health</option>
        	     	<option value="Surgery">Surgery</option>
        	     </select><br>           
		     <input type="text" name="date" id="date" placeholder="Appointment Date" class="b" required><br>            
		     <input type="text" name="time" id="time" class="b" placeholder="Appointment Time" required><br>
                     <input type="submit" class="c" name="submit" id="submit" value="Book">
                     
                </form>	
		</pre>	
		</div>
	</div>
       
    </body>
</html>
