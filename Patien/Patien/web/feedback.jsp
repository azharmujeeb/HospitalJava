<%-- 
    Document   : feedback
    Created on : Mar 17, 2021, 8:30:28 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FeedBack</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
<style>
            
 body{
 padding: 0;
 margin: 0;
 line-height: 1.5;
 box-sizing: border-box;
 color:rgba(248, 248, 248, 0.938);
 
}


#fancy-form{
 background: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.6)),url(https://png.pngtree.com/thumb_back/fh260/back_our/20190619/ourmid/pngtree-hospital-oral-care-tooth-display-board-background-material-image_133707.jpg);
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
  color: #fff;
  padding: 0;
  margin: 0;
}

.Form-left h4{
  padding: 0;
  margin: 0;
  color: rgb(243, 235, 235);
}
.line{
  border-bottom: 2px solid rgb(12, 168, 207);
  width: 8%;
  margin-left: 0;
}
.Form-left span{
  color: rgb(187, 182, 182);
  font-weight: bold;
}

.Form-left hr{
  width: 25rem;
  margin-left: 0;
  border: 1px solid rgb(53, 52, 52);
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
  color: #fff;
  padding: 0;
  margin: 0;
}

form{
  padding-top: 2rem;
}

form h5{
  padding: 0;
  margin: 0;
  color: rgb(228, 218, 218);
}
form input{
  padding:0.6rem;
  width: 27rem;
  border: none;
  background-color:rgba(136, 133, 133, 0.3);
  color:white;
  border: none;
  outline:none;
}

form textarea{
  padding:0.6rem;
  width: 27rem;
  border: none;
  background-color:rgba(136, 133, 133, 0.3);
  color:white;
  border: none;
  outline:none;
 }

 .button{
    width: 9rem;
    background: rgb(12, 168, 207);
    padding: 5px;
    outline: none;
    border-color: transparent;
    color: #fff;
    font-size: 15px;
    font-weight: bold;
    letter-spacing: 2px;
    text-align: center;
    margin-top: 0.9rem;
    border-radius: 50px;
    cursor: pointer;
 }


 
   @media (max-width: 968px){

     #fancy-form .form-sections{
       display: block;
       width: 100%;
       text-align: left;
          }

    
      #fancy-form{
        background: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.9)),url(../imgs/particles.jpg);
        background-size: cover;
        background-position: center;
        height: auto;
        width: 100%;
         }

      .form-sections .Form-right{
        margin-top: 2rem;
        margin-bottom: 2rem;
         }

   
        .fa{
         padding: 8px;
         font-size: 18px;
         width: 30px;
         text-align: center;
         text-decoration: none;
         color: rgb(187, 182, 182);
             }
          }
  
          
          
          
 
.nav-area {
		text-align:left;
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
	float: left;
	list-style: none;
	margin-top: 30px;
}
.nav-area li {
	display: inline-block;
}
.nav-area li a {
	color:#FFDEAD;
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
        
 <section id="fancy-form">
   <div class="container">
    <div class="form-sections">
   
      <div class="Form-left">
        <h1>Get In Touch</h1>
        <div class="line"></div> 
        <p>Contact us for new services and updates. subscribe our news letter :)</p><br>

         <h4>ADDRESS</h4>
         <span>123, Main Street, Colombo</span>
         <hr><br><br>

        
        <h4>PHONE</h4>
         <span>(+94)123 456 7890</span>
         <hr><br><br>

        <h4>EMAIL</h4>
         <span>helth@gmail.com</span>
         <hr> <br>

        
          <a href="#" class="fa fa-facebook"></a>
          <a href="#" class="fa fa-twitter"></a>
          <a href="#" class="fa fa-google"></a>
          <a href="#" class="fa fa-linkedin"></a>
          
      </div>

    
      <div class="Form-right">
        <h1>Contact Us</h1>
        <div class="line"></div>
      
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
     
     
<div id= "footer" style="text-align: center">	
<ul class="nav-area">
<li><a href="#"   ONCLICK="window.location.href='index2.html'"><b><u>GO BACK</u></b></a></li>
</ul>
</div>   

  </section>
    </body>
</html>
