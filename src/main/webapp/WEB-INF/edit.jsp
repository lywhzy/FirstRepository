<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form:form action="${ pageContext.servletContext.contextPath }/listPage" method="post" modelAttribute="book">
	<input type="hidden" name="_method" value="PUT">
	<form:input path="id"/><br>
	<form:input path="title"/><br>
	<form:input path="type"/><br>
	<form:input path="price"/><br>
	<input type="submit" value="提交">
</form:form>
 <!-- 
<form action="${ pageContext.servletContext.contextPath }/listPage" method="post">
	<input type="hidden" name="_method" value="PUT">
	
	<input type="submit" value="提交">
</form>	
 -->
</body>
</html>