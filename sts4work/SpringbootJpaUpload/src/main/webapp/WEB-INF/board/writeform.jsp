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
<div style="margin:100px;">
<form action="write" method="post" enctype="multipart/form-data" >
  <table class="table table-bordered" style="width: 400px;">
     <caption align="top"><b>자동차정보입력</b></caption>
     <tr>
       <th class="table-info">작성자</th>
       <td>
         <input type="text" name="writer" class="form-control"
         style="width: 120px;" required="required">
       </td>
     </tr>
     <tr>
       <th class="table-info">제목</th>
       <td>
         <input type="text" name="subject" class="form-control"
         style="width: 250px;">
       </td>
     </tr>
     <tr>
       <th class="table-info">사진</th>
       <td>
         <input type="file" name="upload" class="form-control"
         style="width: 150px;">
       </td>
     </tr>
     <tr>
       <td colspan="2">
       <textarea rows="" cols="" style="width: 480px; height: 100px;" name="content" class="form-control" 
       required="required"></textarea>
       </td>
     </tr>
     <tr>
       <td colspan="2" align="center">
         <button type="submit" class="btn btn-success btn-lg">서버저장</button>
         <button type="button" class="btn btn-success btn-lg" onclick="location.href='list'">목록이동</button>
       </td>
     </tr>
  </table>
</form>
</div>
</body>
</html>