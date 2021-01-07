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
    <main class="container my-5">
        <div class="row mb-5">
            <div class="col-md-3">
                <button type="button" class="btn btn-outline-secondary go_back">&#8678; Quay lại</button>
            </div>
            <div class="d-flex justify-content-center col-md-9">
                <h2>CHI TIẾT HÓA ĐƠN</h2>
            </div>
        </div>
        
        <div class="row">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">
                        <div class="row mb-3">
                            <label for="supplier" class="col-sm-4 col-form-label">Nhà cung cấp:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" value="${supplierName}" id="supplier" disabled readonly>
                            </div>
                            
                        </div>
                        <div class="row mb-3">
                            <label for="importID" class="col-sm-4 col-form-label">Ngày nhập hàng:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="importID" value="${date}" disabled readonly>
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>

            <div class="col-8">
                <table class="table table-bordered table-striped border">
                    <thead>
                        <tr class="table-dark">
                            <th style="width:15%" scope="col">ID</th>
                            <th style="width:30%" scope="col">Tên Hàng</th>
                            <th scope="col">Đơn giá</th>
                            <th scope="col">Số lượng</th>
                            <th scope="col">Tổng tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${detailList}" var="detail" varStatus="loop">
                        <tr>
                            <th><c:out value="${detail.get('stockID')}"/></th>
                            <td><c:out value="${detail.get('stockName')}"/></td>
                            <td><c:out value="${detail.get('quantity')}"/></td>
                            <td><c:out value="${detail.get('price')}"/></td>
                            <td><c:out value="${detail.get('total_price')}"/></td>
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
        $(".go_back").click(function() {
            window.history.back();
        });
    </script>
</body>
</html>