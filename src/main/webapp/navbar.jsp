<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/29/2020
  Time: 8:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<header>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="/home">Stadium Manager</a>
            <% if (session.getAttribute("user") == null) { %>
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link" href="/login">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sign Up</a>
                </li>
            </ul>
            <% } else { %>
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link" href="/logout">Logout</a>
                </li>
            </ul>
            <% } %>
        </div>
    </nav>
    <div class="border">
        <ul class="nav nav-pills nav-fill justify-content-center">
            <li class="nav-item border">
                <a class="nav-link active" href="/home">TRANG CHỦ</a>
            </li>
            <li class="nav-item border">
                <a class="nav-link" href="#">ĐẶT SÂN</a>
            </li>
            <li class="nav-item border">
                <a class="nav-link" href="#">NHẬP HÀNG</a>
            </li>
            <li class="nav-item border">
                <a class="nav-link" href="/statistical-supplier">THỐNG KÊ</a>
            </li>
        </ul>
    </div>
</header>
