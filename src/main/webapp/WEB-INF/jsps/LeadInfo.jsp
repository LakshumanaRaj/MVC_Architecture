<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING BOOT</title>
</head>
<h2>SPRING BOOT</h2>
<body bgcolor="#625D5D">
<form action="contactdata" method="post">
<pre>
<input type="text" name="id" value="${lead.id}">
first name     :<input type="text" name="fname" value="${lead.fname}">

last name      :<input type="text" name="lname" value="${lead.lname}">

email          :<input type="text" name="email" value="${lead.email}">

mobile         :<input type="text" name="mobile"value="${lead.mobile}">

leadsource     :<input type="text" name="leadSource" value="${lead.leadSource}">

company        :<input type="text" name="companyName" value="${lead.companyName}">

salary         :<input type="text" name="salary" value="${lead.salary}">

location       :<input type="text" name="location" value="${lead.location}">

                           <input type="submit" value="convert">
</pre>
</form>
</body>
</html>