<%-- 
    Document   : ViewRequest
    Created on : Mar 18, 2023, 8:27:14 PM
    Author     : tcc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    .request-list {
        list-style: none;
        padding: 0;
    }

    .request {
        border: 1px solid #ccc;
        margin-bottom: 10px;
        padding: 10px;
    }

    .request-name {
        margin: 0;
    }

    .request-description {
        margin: 10px 0;
    }

    .request-author {
        margin: 0;
        font-style: italic;
        color: #999;
    }
</style>
<a>List Request</a>
<ul class="request-list">
    <c:forEach items="${listR}" var="o">
        <li class="request">
            <h2 class="request-name">AccountName : ${o.accountName}</h2>
            <p class="request-description">Decription : ${o.decription}</p>
            <p class="request-author">HouseName : ${o.houseName}</p>
        </li>
    </c:forEach>
</ul>