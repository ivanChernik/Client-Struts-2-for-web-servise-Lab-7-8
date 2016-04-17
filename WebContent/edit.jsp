<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css" >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit defenition</title>
</head>
<body>
	<form action="handleEdit" align="center" method="POST">
	<div class="text-style">
		<s:textfield  class="input-text-name" name="nameDefenition" label="Enter name defenition"/><br>
		<s:textarea  class="input-text-name" name="bodyDefenition" label="Enter body defenition"/><br>
	</div>
		<s:submit class="button" align="center" name = "addButton" value="Add"/><br>
		<s:submit class="button" align="center" name = "updateButton"  value="Update"/><br>
		<s:submit class="button" align="center" name = "deleteButton" value="Delete"/><br>
	</form>

</body>
</html>