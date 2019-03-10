<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>


<table border="1">
	<c:forEach items="${ list }" var="book">
	<tr>
		<td>${ book.title }</td>
		<td>${ book.price }</td>
		<td>
			<a href="edit/${ book.id }">编辑</a>
		</td>
		<td>
			<form action="listPage/${ book.id }" method="post">
				<input type="hidden" name="_method" value="DELETE">
				<input type="submit" value="删除">
			</form>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td>
			<a href="listPage?start=0">首页</a>
		</td>
		<td>
			<a href="listPage?start=${ page.start-page.page_count }">上一页</a>
		</td>
		<td>
			<a href="listPage?start=${ page.start+page.page_count }">下一页</a>
		</td>
		<td>
			<a href="listPage?start=${ page.end }">尾页</a>
		</td>
	</tr>
</table>

<form action="listPage" method="post">
	<input type="text" name="id"><br>
	<input type="text" name="title"><br>
	<input type="text" name="type"><br>
	<input type="text" name="price"><br>
	<input type="submit" value="新增">
</form>
</body>
</html>