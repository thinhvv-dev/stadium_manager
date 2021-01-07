<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="header.jsp"%>
    <title>Quản lý sân bóng mini</title>
</head>
<body>
    <!-- header -->
    <%@include file="navbar.jsp"%>
    <!-- End header -->

    <!-- main -->
    <main class="container my-5 text-center w-50">
        <form action="/login" method="POST">
            <h1 class="h3 mb-3 fw-normal">Hãy đăng nhập để sử dụng:</h1>
            <div class="my-3">
                <label for="inputUsername" class="visually-hidden">Tài khoản</label>
                <input type="text" id="inputUsername" class="form-control" placeholder="Tài khoản" name="userName" required="" autofocus="">
            </div>
            <div class="mb-5">
                <label for="inputPassword" class="visually-hidden">Mật khẩu</label>
                <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Mật khẩu" required="">
            </div>

            <span class="text-danger">
                ${errorMessage}
            </span>

            <button class="w-100 btn btn-lg btn-primary" type="submit">Đăng nhập</button>
          </form>
    </main>
    <!-- end main -->


    <%@include file="footer.jsp"%>
</body>
</html>