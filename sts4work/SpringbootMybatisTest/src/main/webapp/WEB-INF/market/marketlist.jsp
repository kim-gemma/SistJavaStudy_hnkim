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
<c:if test="${totalcount==0 }">
	<div>저장된 상품 정보가 없습니다</div>
</c:if>
<c:if test="${totalcount>0 }">
	<div>총 ${totalcount}개의 정보가 있습니다</div>
</c:if>
<button type="button" class="btn btn-info" onclick="location.href='form'">상품정도 입력</button>
<br><br>
<c:forEach var="data" items="${list }">
	<table class="table table-bordered">
		<tr>
		 <td>
		 	<c:if test="${data.photoname!=null }">
		 		<img alt="" src="../photo/${data.photoname}" style="width: 150px;">
		 	</c:if>
		 	<c:if test="${data.photoname==null }">
		 		<img alt="" src="../image/no_image.jpg" style="width: 150px;">
		 	</c:if>
		 	<h4>상품명 ${data.sang }</h4>
		 	<h4>가격 <fmt:formatNumber value="${data.dan }" type="currency"/></h4>
		 	<h4>입고일 <fmt:formatDate value="${data.ipgo}" pattern="yyyy-MM-dd"/>></h4>
 	  		<h4>
               <button type="button" class="btn btn-outline-primary"
               onclick="location.href='updateform?num=${data.num}'">수정</button>
               <button type="button" class="btn btn-outline-danger"
               onclick="location.href='delete?num=${data.num}'">삭제</button>
            </h4>
		 </td>
		</tr>
	</table>
</c:forEach>
</body>
</html>