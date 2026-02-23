<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Nanum+Myeongjo&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post" enctype="multipart/form-data" >
<input type="hidden" name="num" value="${dto.num}">
  <table class="table table-bordered" style="width: 400px;">
     <caption align="top"><b>상품정보입력</b></caption>
     <tr>
       <th class="table-info">상품명</th>
       <td>
         <input type="text" name="sang" class="form-control"
         style="width: 120px;" required="required" value="${dto.sang}">
       </td>
     </tr>
     <tr>
       <th class="table-info">가격</th>
       <td>
         <input type="text" name="dan" class="form-control"
         style="width: 250px;" value="${dto.dan}">
       </td>
     </tr>
     <tr>
       <th class="table-info">사진</th>
       <td>
         <input type="file" name="photo" class="form-control"
         style="width: 150px;">
       </td>
     </tr>
     <tr>
       <td colspan="2" align="center">
         <button type="submit" class="btn btn-success btn-lg">수정</button>
         <button type="button" class="btn btn-success btn-lg" onclick="location.href='list'">목록이동</button>
       </td>
     </tr>
  </table>
</form>
</body>
</html>