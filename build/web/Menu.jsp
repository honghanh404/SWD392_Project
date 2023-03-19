<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="home">Rent House</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        
        

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <c:if test="${sessionScope.account==1}">
                   <li class="nav-item">
                    <a class="nav-link" href="manager">Manager Blog</a>
                </li> 
   
                </c:if>
                
                 <c:if test="${sessionScope.account!=null}">
                     <li class="nav-item"
                           <p style="color: red" >Hello ${sessionScope.account.getUsername()}</p>
                 </li>  
                 <li class="nav-item">
                    <a class="nav-link" href="#">Logout</a>
                </li>
                 </c:if>
                 <c:if test="${sessionScope.account==null}">
                      <li class="nav-item">
                    <a class="nav-link" href="Login.jsp">Login</a>
                </li>
                 </c:if>
                      </ul>
        </div>
       
    </div>
</nav>

<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">Blog</h1>
        <p class="lead text-muted mb-0">Chào mừng các bạn đã đến với trang web của chúng tôi.Chúc các bạn có một ngày vui vẻ.</p>
    </div>
</section>
<!--end of menu-->
