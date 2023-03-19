<%-- 
    Document   : Requests.jsp
    Created on : Mar 18, 2023, 4:08:43 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
        </script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
        </script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
        </script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    </head>
    <style>
        .header-strip {
            height: 102px;
            background: linear-gradient(to right, #071489, transparent);
        }

        .content-container {
            margin: 50px 500px;
        }

        .individual-content {
            display: flex;
            background: rgba(158, 51, 51, 0.38);
            border-radius: 20px;
            padding: 20px;
            margin: 50px 0px;
        }
    </style>

    <body style="margin: 0;background: rgb(232, 213, 41, 6%);">
        <div class="header-strip">
            <p style="color: white;font-size: 40px;margin: 0;">REQUESTS</p>
        </div>
        <div class="content-container">
            <div>
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createRequest">
                    CREATE REQUEST
                </button>
                <div class="modal fade" id="createRequest" tabindex="-1" role="dialog" aria-labelledby="createRequest"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">CREATE REQUEST</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <form action="addrequest" method="POST">
                                    <div class="form-row">
                                        <div class="form-group col-md-12">
                                            <label for="houseID" class="col-form-label col-form-label-lg">House Name</label>
                                            <select class="form-control form-control-lg" id="houseID" name="houseID">
                                                <c:forEach var="h" items="${houseList}">
                                                    <option value="${h.houseID}">${h.houseName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-group col-md-12">
                                            <label for="AccountID" class="col-form-label col-form-label-lg">User Name</label>
                                            <select class="form-control form-control-lg" id="AccountID" name="AccountID">
                                                <c:forEach var="a" items="${accountList}">
                                                    <option value="${a.accountID}">${a.username}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-primary">CREATE REQUEST</button>
                                </form>
                            </div>
                            <!-- <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Save changes</button>
                            </div>
                        </div> -->
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>RequestID</th>
                            <th>HouseID</th>
                            <th>HouseName</th>
                            <th>AccountID</th>
                            <th>Username</th>
                            <th>State</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="r" items="${requestList}">
                            <tr>
                                <td>${r.requestID}</td>
                                <td>${r.houseID}</td>
                                <td>${r.houseName}</td>
                                <td>${r.accountID}</td>
                                <td>${r.userName}</td>
                                <c:if test="${r.state == true}">
                                    <td>Active</td>
                                </c:if>
                                <c:if test="${r.state != true}">
                                    <td>Inactive</td>
                                </c:if>
                                <td>
                                    <a href="#" onClick="showMess(${r.requestID})"><i class="material-icons"
                                                                                      data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
    </body>
    <script>
        function showMess(id) {
            console.log("abcdfd");
            var option = confirm("Are you sure?");
            if (option === true) {
                window.location.href = 'deleterequest?id=' + id;
            }
        }
    </script>
    <script src="js/paginathing.js"></script>
    <script>
        $('table tbody').paginathing({
            perPage: 5,
            limitPagination: false,
            prevNext: true,
            firstLast: true,
            prevText: '&laquo;',
            nextText: '&raquo;',
            firstText: 'First',
            lastText: 'Last',
            containerClass: 'pagination-container',
            ulClass: 'pagination',
            liClass: 'page-item',
            activeClass: 'active',
            disabledClass: 'disabled',
            pageNumbers: false,
            insertAfter: ".table"
        });
    </script>
    <style>
        .pagination-container {
            text-align: center;
            padding: 20px 0;
        }

        .pagination {
            width: fit-content;
            margin: 0 auto;
        }

        .pagination a {
            color: black;
            text-decoration: none;
        }

        .pagination li {
            color: white;
            padding: 0.2rem 0.8rem;
            text-decoration: none;
            border: 1px solid #ddd;
        }

        .pagination .active {
            background-color: #337ab7;
            border: 1px solid #337ab7;
        }

        .active a {
            color: white;
        }

        .disabled a {
            color: darkgrey;
        }

        .pagination li:hover:not(.active) {
            background-color: #ddd;
        }

        .pagination li:first-child {
            border-top-left-radius: 5px;
            border-bottom-left-radius: 5px;
        }

        .pagination li:last-child {
            border-top-right-radius: 5px;
            border-bottom-right-radius: 5px;
        }

    </style>
</html>
