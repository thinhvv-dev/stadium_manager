<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="header.jsp"%>
    <title>Quản lý sân bóng mini</title>

</head>
<body>
    <!-- navbar -->
    <%@include file="navbar.jsp"%>
    <!-- End navbar -->

    <!-- main -->
    <main class="container my-5">
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Quản lý sân bóng của bạn</h1>
                <p class="lead text-muted">Quản lý với các chức năng đầy đủ và tiện lợi phù hợp cho sân bóng mini.</p>
            </div>
        </section>
        <div class="row d-flex justify-content-around mb-3 text-center">
            <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="${pageContext.request.contextPath}/static/image/carousel1.jpg" alt="">
                <div class="card-body">
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab architecto atque beatae consectetur dicta ex iste labore magnam minus mollitia nihil nobis numquam recusandae repellat sapiente suscipit, vel, veniam? Accusantium?</p>
                </div>
            </div>
            <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="${pageContext.request.contextPath}/static/image/carousel2.jpg" alt="">
                <div class="card-body">
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab architecto atque beatae consectetur dicta ex iste labore magnam minus mollitia nihil nobis numquam recusandae repellat sapiente suscipit, vel, veniam? Accusantium?</p>
                </div>
            </div>
            <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="${pageContext.request.contextPath}/static/image/carousel3.jpg" alt="">
                <div class="card-body">
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab architecto atque beatae consectetur dicta ex iste labore magnam minus mollitia nihil nobis numquam recusandae repellat sapiente suscipit, vel, veniam? Accusantium?</p>
                </div>
            </div>
        </div>
    </main>
    <!-- end main -->

    <%@include file="footer.jsp"%>
</body>
</html>