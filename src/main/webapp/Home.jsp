<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
    <link rel="stylesheet" href="css/Home.css">
    <style>
    /* Style the dropdown button */
    .dropdown {
      display: inline-block;
      position: relative;
    }

    /* Style the dropdown content (hidden by default) */
    .dropdown-content {
      display: none;
      position: absolute;
      background-color: #f9f9f9;
      min-width: 160px;
      box-shadow: 0 8px 16px rgba(0,0,0,0.2);
      z-index: 1;
    }

    /* Style the dropdown links */
    .dropdown-content a {
      color: black;
      padding: 12px 16px;
      text-decoration: none;
      display: block;
    }

    /* Change color on hover */
    .dropdown-content a:hover {
      background-color: #f1f1f1;
    }

    /* Show the dropdown menu on hover */
    .dropdown:hover .dropdown-content {
      display: block;
    }
  </style>
</head>
<body>
	<nav>
        <div class="nav-bar">
            <i class='bx bx-menu sidebarOpen' ></i>
            <span class="logo-navLogo">Placement Management System</span>
                <div class="cutmlogo"><a href="#"><img src="https://thegttech.com/img/icon/cutm_logo.png" alt="cutmLogo"></a></div>
  
            <div class="menu">
                <div class="logo-toggle">
                    <span class="logo"><a href="#">Placement Management System</a></span>
                    <i class='bx bx-x siderbarClose'></i>
                </div>
  
                <ul class="nav-links">
                    <li><a href="home.html">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="feedback.html">Feedback</a></li>
                    <li><a href="feedback.html">Contact</a></li>
                    
                </ul>
            </div>
                
                <div class="dropdown">
    <span>Register</span>
    <div class="dropdown-content">
      <!-- <a href="HrRegistration.jsp">Hr</a> -->
      <a href="AdminRegistration.jsp">Admin</a>
      <a href="Registration.jsp">Student</a>
    </div>
  </div>
  <div class="dropdown">
    <span>Login</span>
    <div class="dropdown-content">
      <a href="HrLogin.jsp">Hr</a>
      <a href="AdminLogin.jsp">Admin</a>
      <a href="Login.jsp">Student</a>
    </div>
  </div>
      
      </div>
      </nav>          
                
        
        
            <div class="img-slider">
                <div class="slide active">
                    <img src="https://cutm.ac.in/wp-content/uploads/2020/01/info-about-banner.jpg" alt="cutmlogo1">
                    <div class="info">
                        <h2>Slide 01</h2>
                        <p>Spread over 40 acres of land in the foothill of Barunei hills, near Jatni town, the campus is adjacent to National Institute of Science, Education and Research (NISER), Indian Institute of Technology (IIT), All India Institute of Medical Sciences (AIIMS) and Xavier University. The famous 11th century Lingaraj temple is about 20 kms from this campus.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://images.shiksha.com/mediadata/images/1578031133phpblrZYi.jpeg" alt="cutmlogo2">
                    <div class="info">
                        <h2>Slide 02</h2>
                        <p>This is the Main entry gate of Centurion University of Technology and Management Bhubaneswar campus , Only one and huse entrance gate is is the entire University.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://cdn-eu.aglty.io/sunstoneuniversity/Attachments/NewItems/4-1-2_20230508084325_0.jpg" alt="cutmlogo3">
                    <div class="info">
                        <h2>Slide 03</h2>
                        <p>Centurion University have Four Large Buildings for Studying and this is the Main Building , in which All oficial works and all type of CSE Department is here .</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://theacademicinsights.com/wp-content/uploads/2020/12/cutm-1.jpeg" alt="cutmlogo4">
                    <div class="info">
                        <h2>Slide 04</h2>
                        <p>This is the Coutilya Building in which Management department , Media Department and Library is theere.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://cutm.ac.in/wp-content/uploads/2020/03/Library-2-scaled.jpg" alt="cutmlogo5">
                    <div class="info">
                        <h2>Slide 05</h2>
                        <p>Centurion University have a Big Library with Digital Facilities, Here all types and all departments Book available the Library open at 9.30 am to 10pm . We have large Reading area and News reading area also included here all types of news paper are available per day and stored the old news paper.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://cutm.ac.in/wp-content/uploads/school-slider/Paramedics-Allied-Health-Sciences/para-scaled.jpg" alt="cutmlogo6">
                    <div class="info">
                        <h2>Slide 06</h2>
                        <p>university have modern Farmacitical lab with embaded all new technology for Practic.</p>
                    </div>
                </div>
                <div class="navigation">
                    <div class="btn active"></div>
                    <div class="btn"></div>
                    <div class="btn"></div>
                    <div class="btn"></div>
                    <div class="btn"></div>
                    <div class="btn"></div>
                </div>
            </div>
    

    <script src="js/Home.js"></script>
</body>
</html>