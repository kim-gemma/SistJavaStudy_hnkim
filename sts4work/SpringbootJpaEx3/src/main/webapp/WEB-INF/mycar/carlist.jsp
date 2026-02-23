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
<style type="text/css">
  .box{
    width: 30px;
    height: 30px;
    border: 1px solid gray;
    border-radius: 100px;
  }
</style>
</head>
<body>
<div style="margin: 100px 100px; width: 800px;">

 <img alt="" src="../image/flower_ani/s6.JPG" width="100">

<button type="button" class="btn btn-danger"
onclick="location.href='addform'">정보입력</button>
<br><br>
<b>총${count } 개의 자동차정보가 있습니다</b>

<table class="table table-bordered">
   <caption align="top"><b>자동차 정보 목록</b></caption>
   <tr class="table-success">
     <th width="80">번호</th>
     <th width="180">자동차명</th>
     <th width="180">색상</th>
     <th width="180">가격</th>
     <th width="200">구입날짜</th>
     <th width="200">편집</th>
   </tr>
   <c:forEach var="dto" items="${list }" varStatus="i">
     <tr>
       <td align="center">${i.count }</td>
       <td align="center">${dto.carname }</td>
       <td align="center">
          <div class="box" style="background-color: ${dto.carcolor};"></div>
       </td>
       <td>${dto.carprice }</td>
       <td>${dto.guipday }</td>
       <td align="center">
         <i class="bi bi-pencil-square" onclick="location.href='updateform?num=${dto.num}'"></i>&nbsp;&nbsp;&nbsp;&nbsp;
         <i class="bi bi-trash-fill" onclick="location.href='delete?num=${dto.num}'"></i>
       </td>
     </tr>
   </c:forEach>
</table>

</div>
</body>
</html>