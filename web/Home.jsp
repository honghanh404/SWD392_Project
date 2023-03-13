<%-- 
    Document   : Home
    Created on : Mar 13, 2023, 8:41:51 PM
    Author     : ASUS
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${sessionScope.account!=null}">
            <p style="color: red" >Hello ${sessionScope.account.getUsername()}</p>
        </c:if>
        
        <h1>Welcome to Homepage</h1>
        <a href="logout">Logout</a>
        
    </body>
</html>
