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
                <a class="navbar-brand" href="index.jsp">Stadium Manager</a>
                <ul class="nav justify-content-center">
                    <li class="nav-item">
                      <a class="nav-link" href="./login.jsp">Login</a>
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
                    <a class="nav-link" href="index.jsp">TRANG CHỦ</a>
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

    <!-- main -->
    <main class="container my-5 text-center w-50">
        <form>
            <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
            <div class="my-3">
                <label for="inputEmail" class="visually-hidden">Email address</label>
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="">
            </div>
            <div class="mb-5">
                <label for="inputPassword" class="visually-hidden">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
            </div>
            <div class="checkbox mb-3">
              <label>
                <input type="checkbox" value="remember-me"> Remember me
              </label>
            </div>
            <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
          </form>
    </main>
    <!-- end main -->


    <script src="${pageContext.request.contextPath}/static/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/jquery-3.5.1.min.js"></script>
</body>
</html>