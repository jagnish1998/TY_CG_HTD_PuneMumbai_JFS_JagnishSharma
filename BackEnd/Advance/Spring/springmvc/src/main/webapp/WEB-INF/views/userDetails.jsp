<%@page import="com.capgemini.springmvc.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	/* String empID = (String) request.getAttribute("empId");
	String pass = (String)request.getAttribute("pass"); */
	
	UserBean userBean = (UserBean)request.getAttribute("userBean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Entered EmployeeID = <%=empID %> <br>
Entered Password = <%=pass%> --%>
Entered Date = <%=userBean.getDob()%>
Entered EmployeeID = <%=userBean.getEmpId() %> <br>
Entered Password = <%=userBean.getPass()%><br>

</body>
</html>