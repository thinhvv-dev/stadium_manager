<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản lý sân bóng mini</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap.min.css">
</head>
<body>
<!-- header -->
<header>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="./index.jsp">Stadium Manager</a>
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sign Up</a>
                </li>
            </ul>
        </div>
    </nav>
    <div class="border">
        <ul class="nav nav-pills nav-fill justify-content-center">
            <li class="nav-item border">
                <a class="nav-link active" href="./index.jsp">TRANG CHỦ</a>
            </li>
            <li class="nav-item border">
                <a class="nav-link" href="#">ĐẶT SÂN</a>
            </li>
            <li class="nav-item border">
                <a class="nav-link" href="#">NHẬP HÀNG</a>
            </li>
            <li class="nav-item border">
                <a class="nav-link" href="./statistical_supplier.html">THỐNG KÊ</a>
            </li>
        </ul>
    </div>
</header>
<!-- End header -->
