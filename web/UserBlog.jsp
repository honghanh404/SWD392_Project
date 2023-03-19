<%-- 
    Document   : UserBlog
    Created on : Mar 18, 2023, 2:18:29 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog</title>
    </head>
    <style>
        .header-strip {
            height: 102px;
            background: linear-gradient(to right, #071489, transparent);
        }

        .content-container {
            margin: 50px 400px;
        }

        .individual-content {
            display: flex;
            background: rgba(158, 51, 51, 0.38);
            border-radius: 20px;
            padding: 20px;
            margin: 50px 0px;
        }
    </style>

    <body style="margin: 0;background: rgb(232, 213, 41, 6%);">
        <div class="header-strip">
            <p style="color: white;font-size: 40px;margin: 0;">BLOG</p>
        </div>
        <div class="content-container">
            
            <c:forEach items="${blogList}" var="b">
                <div class="individual-content">
                    <div class="imgbox" style="height: 300px;">
<!--                        <img src="https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"
                             style="height: 300px;border-radius: 20px;">-->
                        <img src="${b.imageURL}"
                             style="height: 300px;border-radius: 20px;">
                    </div>
                    <div class="txtbox" style="margin-left: 70px;">
                        <!--<p style="font-size: 40px;">Top 3 Most Rented Houses</p>-->
                        <p style="font-size: 40px;">${b.title}</p>
                        <!--<p style="font-size: 28px;">10/10/2019</p>-->
                        <p style="font-size: 28px;">${b.date}</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>

</html>
