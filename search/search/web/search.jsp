<%-- 
    Document   : search
    Created on : Apr 23, 2021, 5:07:54 PM
    Author     : User
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Appointment</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css">  
          
      
        <style>
         @import url('https://fonts.googleapis.com/css?family=Comfortaa');   
body{   
	margin:0;
	padding:20px;
	font-family: sans-serif;
}

*{
	box-sizing: border-box;
}

.table{
	width: 100%;
	border-collapse: collapse;
        top: 50%;
        
}
.table td,.table th{
  padding:12px 15px;
  border:1px solid #ddd;
  text-align: center;
  font-size:16px;
}

.table th{
	background-color: darkblue;
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
    color:#6A5ACD;
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



<%--
Search 
--%>


*{
	margin: 0;
	padding: 0;
	outline: none;
	box-sizing: border-box;
	font-family: 'Comfortaa', cursive;
}

body{
	
	background-size: cover;
	width: 100%;
	height: 100vh;
}

.wrapper{
    position: absolute;
    top: 10%;
    left: 50%;
    transform: translate(-50%, -50%);
    background: rgba(0, 0, 0,0.6);
    max-width: 700px;
    width: 100%;
    padding: 15px;
    display: flex;
    justify-content: space-between;
    border-radius: 5px;
}

.wrapper .input {
    width: 85%;
    padding: 15px 20px;
    border: none;
    border-radius: 5px;
    font-weight: bold;
}

.searchbtn .fas{
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 18px;
}


 .box{
            width: 96px;
            padding: 13px;
            position: absolute;
            top: 50%;
            left:92%;
            transform: translate(-50%,-50%);
            background: white;
            text-align: center;
            opacity: 0.7;
            font-weight: bold;
           }
        .box h1{
            color: white;
            text-transform: uppercase;
            font-weight: 500;
             }  
        
         .box input[type = "submit"]{
             border:0;
             background: none;
             display: block;
             margin: 20px auto;
             text-align: center;
             border: 2px solid #2ecc71;
             padding: 14px 40px;
             outline: none;
             color: white;
             border-radius: 24px;
             transition: 0.25s;
             cursor: pointer;
             }
        .box input[type = "submit"]:hover{
             background: #2ecc71;
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



.h1{
        height: auto;
	color: #fff;
	width: 100%;
	z-index: 1;
	text-align: center;
	font-size: 5.5em;
	font-weight: 750;
        
}

.p{
        font-weight: bold;
        height: auto;
	color: #ccc;
	width: 100%;
	z-index: 1;
	text-align: center;
	font-size: 1.2em;
	font-weight: 500;
}
.info{
        font-family: sans-serif;
        font-weight: bold;
        position: absolute;
	top: 30%;
	transform: translateY(-50%);
	height: auto;
	width: 100%;
	z-index: 1;
	text-align: center;
}            
             
            
        </style>
    </head>
    <body>
        
           
        <form>
   
   <div class="wrapper">
	<input type="text" class="input" name="idnumber" id ="idnumber"  placeholder="Type Your ID Number......">
        <div class="searchbtn">
        <input type="submit" name="submit" value="Search" class="box"  style="color: black">
        </div>
   </div>          
        </form>  
        
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        
        <form method="get" >
        <center>
            <div class="filter"></div>
           <table class="table" >
               <th>ID Number</th>
               <th>Name</th>
               <th>Age</th>
               <th>Phone Number</th>
               <th>Blood Group</th>
               <th>Category</th>
               <th>Appointment Date</th>
               <th>Appointment Time</th>
     
        
   <%    
       
          try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patien","root","");
             Statement stat = con.createStatement();
             
             String idnumber = request.getParameter("idnumber");
             String sqlstr = "select * from appointment where idnumber='"+idnumber+"' ";
             ResultSet rs = stat.executeQuery(sqlstr);
             while(rs.next()){
            
             %>
                 <tr>
                     <td><%=rs.getString("idnumber")%></td>
                     <td><%=rs.getString("name")%></td>
                     <td><%=rs.getInt("age")%></td>
                     <td><%=rs.getInt("tele")%></td>
                     <td><%=rs.getString("group")%></td>
                     <td><%=rs.getString("categery")%></td>
                     <td><%=rs.getString("date")%></td>
                     <td><%=rs.getString("time")%></td>
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
    </body>
    
 
    <br>  
    <br>
    <br>  
    <br>
    <br>
    <br>
    <br>
    <br>   
    <br>  
    <br>
    <br>  
    <br>
    <br> 
    <br>
    <br>
    <br> 
<div id= "footer" style="text-align: center">	
<ul class="nav-area">
<li><a href="#"   ONCLICK="window.location.href='index2.html'"><b><u>GO BACK</u></b></a></li>
</ul>
</div>     
</html>
