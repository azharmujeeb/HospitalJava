<%-- 
    Document   : viewappointment1
    Created on : Apr 4, 2021, 11:01:08 AM
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
        
        <style>
            
            
body{   background: url("https://media.istockphoto.com/photos/black-stethoscope-on-blue-background-picture-id1179610553?k=6&m=1179610553&s=612x612&w=0&h=v6Wj8AcJx6YppS-ulxEx_g4dihKHCFQv3qEht7aLIOE=");
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
        top: 45%;
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

            
        </style>
    </head>
    <body>
        <h2>Your Appointment Detail is ...</h2>
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
