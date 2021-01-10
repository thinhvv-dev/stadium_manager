<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="header.jsp"%>
    <title>THỐNG KÊ NHẬP HÀNG</title>
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
                <h2>THỐNG KÊ NHẬP HÀNG</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">
                        <form class="filter_form" method="GET" action="">
                            <div class="row mb-3">
                                <label for="startTime" class="col-sm-4 col-form-label">Start Date:</label>
                                <div class="col-sm-8">
                                    <input type="date" name="startDate" class="form-control filter_date" id="startDate" value="${startDate}" placeholder="dd/mm/yyyy" disabled>
                                </div>

                            </div>
                            <div class="row mb-3">
                                <label for="endTime" class="col-sm-4 col-form-label">End Date:</label>
                                <div class="col-sm-8">
                                    <input type="date" name="endDate" class="form-control filter_date" id="endDate" value="${endDate}" placeholder="dd/mm/yyyy" disabled>
                                </div>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-primary" disabled>Filter</button>
                            </div>
                        </form>
                    </div>
                </div>
                
            </div>

            <div class="col-8">
                <table class="table table-bordered table-hover border">
                    <thead>
                        <tr class="table-dark">
                            <th class="w-50" scope="col">Ngày nhập</th>
                            <th scope="col">Tổng số mặt hàng nhập</th>
                            <th scope="col">Tổng tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${importList}" var="import" varStatus="loop">
                        <tr data-href="<c:out value="${import.getDate()}"/>">
                            <th><c:out value="${import.getDate()}"/></th>
                            <td><c:out value="${import.getQuantity()}"/></td>
                            <td><c:out value="${import.getPrice()}"/></td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
              </div>
        </div>
        
    </main>
    <!-- end main -->



    <%@include file="footer.jsp"%>
    <script>
        $("tbody tr").click(function() {
            var $this = $(this);
            var supplierID = "${supplierID}";
            var date = $this.data("href");
            var url = "/detail-import/supplier/" + supplierID;

            if (date) {
                url += "?date=" + date;
            }
            $(location).attr('href', url);
        });
        $(".go_back").click(function() {
            window.history.back();
        });
    </script>
</body>
</html>