<%-- 
    Document   : Register
    Created on : Mar 13, 2023, 9:24:29 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
        
    </head>
    <body style="background-color: #f6f0e9">
        <!-- Register Section Begin -->
    <div class="register-login-section spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 offset-lg-3">
                    <div class="register-form">
                        <h2>Register</h2>
                        <c:if test="${requestScope.mess!=null}">
                            <h3 style="color: red">${requestScope.mess}</h3>
                        </c:if>
                        <form action="register" method="post">
                            <div class="group-input">
                                <input type="text" name="firstName" id="con-pass" required placeholder="First Name">
                            </div>
                            <div class="group-input">
                                <input type="text" name="lastName" id="con-pass" required placeholder="Last Name">
                            </div>
                            <div id="select" style="font-size: 20px">
                                <label for="con-pass">Gender: </label>
                                <input type="radio" name="gender" checked id="male" value="male">Male
                                <input type="radio" name="gender" id="female" value="female">Female
                            </div>
                            <div class="group-input">
                                <input type="text" name="phone" id="con-pass" required placeholder="Phone">
                            </div>
                            <div class="group-input">
                                <input type="email" name="email" id="con-pass" required placeholder="Email">
                            </div>
                            
                            <div class="group-input">
                                <input type="text" name="address"id="con-pass" required placeholder="Address">
                            </div>
                            <div class="group-input">
                                <input type="text" name="uname" id="username" required placeholder="Username">
                            </div>
                            <div class="group-input">
                                <input type="password" name="pass" id="pass" required placeholder="Password">
                            </div>
                            <div class="group-input">
                                <input type="password" name="conpass" id="con-pass" required placeholder="Confirm Password">
                            </div>
                            <button type="submit" class="site-btn register-btn">REGISTER</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Register Form Section End -->
    
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.countdown.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery.zoom.min.js"></script>
    <script src="js/jquery.dd.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>
    </body>
</html>
