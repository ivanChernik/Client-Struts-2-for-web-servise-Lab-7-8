<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css" media="all">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter a defenition</title>
</head>
<body>

	<form action="handleSearch" align="center" method = "POST">
		<s:textfield  class="input-text-name" name="searchDefenition" label="Enter defenition"/>
		<s:submit align="center" class="button" value="Search" /><br>
		<a href ="edit.jsp">
				<input class="button" type="button" name="edit" value="Edit"></input>
		</a>
	</form>

	<p>${sessionScope.resultString}</p>

</body>
</html>