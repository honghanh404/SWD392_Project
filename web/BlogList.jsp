<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
       
            
            <div class="container">
                <div class="col-md-12">       
<!--                <img style="width: 100%; margin: 45px;hight:10%" src="https://img3.thuthuatphanmem.vn/uploads/2019/07/13/hinh-anh-nha-trang-ve-dem-dep_085938969.jpg" >-->
                <div class="spotlight">
                <h2 class="card-title show_txt">Những item bạn nhất định không nên bỏ lỡ</h2>
                <p>Bạn đang cần 1 căn nhà vừa đẹp vừa tiện nghi lại còn giá cả hợp lý.Vậy thì ngại gì mà không đến với trang web của chúng tôi</p>
                </div>
            </div>
                <div class="row">
               

                    <div class="col-sm-9">
                        <div class="row">
                        <c:forEach items="${blogList}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.imageURL}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="#" title="View Product">${o.title}</a></h4>
                                        <p class="card-text show_txt">${o.content}
                                        </p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger">${o.date}</p>
                                            </div>
                                        
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>

            </div>
        </div>

 

     
    </body>
</html>

