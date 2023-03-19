<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Danh sách nhà</title>
	<style>
		.house-list {
			display: flex;
			flex-wrap: wrap;
			align-items: center;
			justify-content: center;
		}

		.house {
			border: 1px solid #ccc;
			border-radius: 5px;
			padding: 10px;
			text-align: center;
			width: 250px;
			margin: 10px;
			display: flex;
			flex-direction: column;
		}

		.house img {
			width: 100%;
			height: 200px;
			object-fit: cover;
			border-radius: 5px;
			margin-bottom: 10px;
		}

		.house h2 {
			font-size: 1.2rem;
			margin: 10px 0;
		}

		.house p {
			font-size: 1rem;
			margin: 5px 0;
		}

		.house .price {
			font-weight: bold;
			color: #f00;
			font-size: 1.2rem;
			margin-bottom: 10px;
		}

		.house .address {
			font-size: 0.9rem;
			color: #555;
		}
	</style>
</head>
<body>
	<div class="house-list">
            <c:forEach items="${listH}" var="o">
		<div class="house">
			<img src="${o.imageURL}" alt="House Image">
			<h2>${o.houseName}</h2>
                        <p>Description: ${o.description}</p>
			<p class="price">Price: ${o.price}</p>
			<p class="address">Size: ${o.size}</p>
		</div>
            </c:forEach>
		<!-- Thêm các nhà khác vào đây -->
	</div>
</body>
</html>