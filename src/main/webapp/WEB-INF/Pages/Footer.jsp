<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.footer {
	position: fixed;
	left:0;
	bottom: 0;
	width: 100%;
	color: gainsboro;
	display: block;
    box-shadow: 0px 0px 0px 0px #244a4a;
	text-align: center;
	
}
</style>

</head>
<body >


<div class="footer" style="background-color:#e3f2fd;">
  <h6 style="color:#4B0082;">&copy; Copyright <%=Calendar.getInstance().getWeekYear()%> : Rays Technologies</h6>
</div>

</body>
</html>