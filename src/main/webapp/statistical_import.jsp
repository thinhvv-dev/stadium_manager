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
                <h2>THỐNG KÊ NHÀ CUNG CẤP</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">
                        <form action="">
                            <div class="row mb-3">
                                <label for="startTime" class="col-sm-4 col-form-label">Start Date:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control" id="startDate" placeholder="dd/mm/yyyy" disabled>
                                </div>
                                
                            </div>
                            <div class="row mb-3">
                                <label for="endTime" class="col-sm-4 col-form-label">End Date:</label>
                                <div class="col-sm-8">
                                    <input type="date" class="form-control" id="endDate" placeholder="dd/mm/yyyy" disabled>
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
                            <th class="w-50" scope="col">Ngày nhập</th>
                            <th scope="col">Tổng số mặt hàng nhập</th>
                            <th scope="col">Tổng tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th>00:00 - 02:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">02:00 - 04:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">04:00 - 06:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">06:00 - 08:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">08:00 - 10:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">10:00 - 12:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">12:00 - 14:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">14:00 - 16:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">16:00 - 18:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">18:00 - 20:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">20:00 - 22:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                        <tr>
                            <th scope="row">22:00 - 00:00</th>
                            <td>Mark</td>
                            <td>Otto</td>
                        </tr>
                    </tbody>
                </table>
              </div>
        </div>
        
    </main>
    <!-- end main -->



    <%@include file="footer.jsp"%>
    <script>
        $("tbody tr").click(function() {
            $(location).attr('href', 'detail_import.html');
        });
        $(".go_back").click(function() {
            window.history.back();
        });
    </script>
</body>
</html>