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
                    <li><a href="notification">Notification</a></li>
                    
                </ul>
            </div>
               
                <form action="logoutController">
  <input type ="submit" value="Logout">
  
  </form>
                
      
      </div>
      </nav>          
                
        
        
            <div class="img-slider">
                <div class="slide active">
                    <img src="https://cutm.ac.in/wp-content/uploads/2020/01/info-about-banner.jpg" alt="cutmlogo1">
                    <div class="info">
                        <h2>Slide 01</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio quia quam in suscipit perspiciatis molestias reprehenderit nostrum veritatis qui excepturi voluptatem modi consequatur aspernatur, voluptatibus quasi, repellendus aliquid accusantium? Vero perspiciatis quos ducimus vitae nihil.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://images.shiksha.com/mediadata/images/1578031133phpblrZYi.jpeg" alt="cutmlogo2">
                    <div class="info">
                        <h2>Slide 02</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio quia quam in suscipit perspiciatis molestias reprehenderit nostrum veritatis qui excepturi voluptatem modi consequatur aspern.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://cdn-eu.aglty.io/sunstoneuniversity/Attachments/NewItems/4-1-2_20230508084325_0.jpg" alt="cutmlogo3">
                    <div class="info">
                        <h2>Slide 03</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio quia quam in suscipit perspiciatis molestias reprehenderit nostrum veritatis qui excepturi voluptatem modi consequatur aspern.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://theacademicinsights.com/wp-content/uploads/2020/12/cutm-1.jpeg" alt="cutmlogo4">
                    <div class="info">
                        <h2>Slide 04</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio quia quam in suscipit perspiciatis molestias reprehenderit nostrum veritatis qui excepturi voluptatem modi consequatur aspern.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://cutm.ac.in/wp-content/uploads/2020/03/Library-2-scaled.jpg" alt="cutmlogo5">
                    <div class="info">
                        <h2>Slide 05</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio quia quam in suscipit perspiciatis molestias reprehenderit nostrum veritatis qui excepturi voluptatem modi consequatur aspern.</p>
                    </div>
                </div>
                <div class="slide">
                    <img src="https://cutm.ac.in/wp-content/uploads/school-slider/Paramedics-Allied-Health-Sciences/para-scaled.jpg" alt="cutmlogo6">
                    <div class="info">
                        <h2>Slide 06</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio quia quam in suscipit perspiciatis molestias reprehenderit nostrum veritatis qui excepturi voluptatem modi consequatur aspern.</p>
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