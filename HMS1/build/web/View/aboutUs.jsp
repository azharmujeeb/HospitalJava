<%-- 
    Document   : aboutUs
    Created on : Apr 18, 2021, 11:26:59 AM
    Author     : azhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>About Us</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="aboutUs.css">
        <style id="aboutUs">
            body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #4b4276;
  color: white;
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #4b4276;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #000;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}
        </style>
    </head>
    <body>
        <div class="about-section">
            <h1>Ceylon Hospital</h1>
            <p>Welcome to Ceylon Hospital.</p>
            <p>Our doctors and staff ensure that your needs are carefully and lovingly looked after.</p>
        </div>

        <h2 style="text-align:center">Our Team</h2>
        <div class="row">
            <div class="column">
              <div class="card">
                <img src="Mujeeb.jpeg" alt="J A Mujeeb" style="width:100%">
                <div class="container">
                  <h2>J A Mujeeb</h2>
                  <p class="title">Project Leader</p>
                  <p>Plymout ID : 10707284</p>
                  <p>10707284@students.plymouth.ac.uk</p>
                  <p>amujeeb@students.nsbm.ac.lk</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>

            <div class="column">
              <div class="card">
                <img src="" alt="G M D D Ratnayake" style="width:100%">
                <div class="container">
                  <h2>G M D D Ratnayake</h2>
                  <p class="title">Receptionist and Admin</p>
                  <p>Plymout ID : 10707351</p>
                  <p>10707351@students.plymouth.ac.uk</p>
                  <p>gmddratnayake@students.nsbm.ac.lk</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>

            <div class="column">
              <div class="card">
                <img src="" alt="S O Perera" style="width:100%">
                <div class="container">
                  <h2>S O Perera</h2>
                  <p class="title">Report Module</p>
                  <p>Plymout ID : 10707315</p>
                  <p>10707315@students.plymouth.ac.uk</p>
                  <p>soperera@students.nsbm.ac.lk</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>
            
            <div class="column">
              <div class="card">
                <img src="Dewni.jpeg" alt="M D A Medhavi" style="width:100%">
                <div class="container">
                  <h2>M D A Medhavi</h2>
                  <p class="title">Doctor</p>
                  <p>Plymout ID : 10707278</p>
                  <p>10707278students.plymouth.ac.uk</p>
                  <p>mdamedhavi@students.nsbm.ac.lk</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>
            
            <div class="column">
              <div class="card">
                <img src="" alt="S S N S Nevins" style="width:100%">
                <div class="container">
                  <h2>S S N S Nevins</h2>
                  <p class="title">Bill Module</p>
                  <p>Plymout ID : 10707291</p>
                  <p>10707291@students.plymouth.ac.uk</p>
                  <p>snsnevins@students.nsbm.ac.lk</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>
            
            <div class="column">
              <div class="card">
                <img src="" alt="P L Dilhani" style="width:100%">
                <div class="container">
                  <h2>P L Dilhani</h2>
                  <p class="title">Patient</p>
                  <p>Plymout ID : 10709402</p>
                  <p>10709402@students.plymouth.ac.uk</p>
                  <p>pldilhani@students.nsbm.ac.lk</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>
          </div>
    </body>
</html>
