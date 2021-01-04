<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                <h2>THỐNG KÊ NHẬP HÀNG</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">
                        <form class="filter_form" method="GET" action="/statistical-supplier">
                            <div class="row mb-3">
                                <label for="startTime" class="col-sm-4 col-form-label">Start Date:</label>
                                <div class="col-sm-8">
                                    <input type="date" name="startDate" class="form-control filter_date" id="startDate" placeholder="dd/mm/yyyy">
                                </div>
                                
                            </div>
                            <div class="row mb-3">
                                <label for="endTime" class="col-sm-4 col-form-label">End Date:</label>
                                <div class="col-sm-8">
                                    <input type="date" name="endDate" class="form-control filter_date" id="endDate" placeholder="dd/mm/yyyy">
                                </div>
                            </div>
                            <div class="text-center">
                            <button type="submit" class="btn btn-primary">Filter</button>
                            </div>
                        </form>
                    </div>
                </div>
                
            </div>

            <div class="col-8">
                <table class="table table-bordered table-hover border">
                    <thead>
                        <tr class="table-dark">
                            <th scope="col">Mã</th>
                            <th class="w-50" scope="col">Tên</th>
                            <th scope="col">Tổng số hàng nhập</th>
                            <th scope="col">Tổng tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${supplierList}" var="supplier" varStatus="loop">
                        <tr>
                            <th><c:out value="${supplier.get('code')}"/></th>
                            <td><c:out value="${supplier.get('name')}"/></td>
                            <td><c:out value="${supplier.get('total_quantity')}"/></td>
                            <td><c:out value="${supplier.get('total_price')}"/></td>
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
            $(location).attr('href', 'statistical_import.jsp');
        });

        $(".go_back").click(function() {
            window.history.back();
        });

        $(".filter_date").change(function() {
            var $this = $(this);

            if ($this.prop("id") === "startDate") {
                var startDate = $this.val();
                $("#endDate").attr("min", startDate);
            } else if ($this.prop("id") === "endDate") {
                var endDate = $this.val();
                $("#startDate").attr("max", endDate);
            }
        });

        // $(".filter_form").submit(function () {
        //     var startDate = $("#startDate").val();
        //     var endDate = $("#endDate").val();
        //     if (startDate || endDate) {
        //         var params = "?start=" + startDate + "&end=" + endDate;
        //         window.location.href = window.location.href.split('?')[0] + params;
        //     } else {
        //         window.location.reload();
        //     }
        // })
    </script>
</body>
</html>