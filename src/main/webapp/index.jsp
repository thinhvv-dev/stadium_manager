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

    <!-- main -->
    <main class="container my-5">
        <h2 class="d-flex justify-content-center my-5">LỊCH ĐẶT SÂN</h2>
        <table class="table table-dark">
            <thead>
                <tr>
                    <th scope="col">Thời gian</th>
                    <th scope="col">Sân 1</th>
                    <th scope="col">Sân 2</th>
                    <th scope="col">Sân 3</th>
                    <th scope="col">Sân 4</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>00:00 - 02:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">02:00 - 04:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">04:00 - 06:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">06:00 - 08:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">08:00 - 10:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">10:00 - 12:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">12:00 - 14:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">14:00 - 16:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">16:00 - 18:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">18:00 - 20:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">20:00 - 22:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">22:00 - 00:00</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>
            </tbody>
        </table>
    </main>
    <!-- end main -->

    

    <script src="${pageContext.request.contextPath}/static/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/jquery-3.5.1.min.js"></script>
</body>
</html>