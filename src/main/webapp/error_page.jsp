<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="header.jsp"%>
    <title>Quản lý sân bóng mini</title>
    <style>
        tbody tr {
            cursor: pointer;
        }
    </style>
</head>
<body>
    <!-- header -->
    <%@include file="navbar.jsp"%>
    <!-- End header -->

    <!-- main -->
    <main class="container my-5">
        <div class="row mb-5">
            <div class="col-md-3">
                <button type="button" class="btn btn-outline-secondary go_back">&#8678; Quay lại</button>
            </div>
            <div class="d-flex justify-content-center col-md-9">
                <h3 class="text-danger">${error}</h3>
            </div>
        </div>
        
    </main>
    <!-- end main -->



    <%@include file="footer.jsp"%>
    <script>
        $(".go_back").click(function() {
            window.history.back();
        });
    </script>
</body>
</html>