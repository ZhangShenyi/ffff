<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Login Success</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    Login Success<br>
    <td>Seller_Name:${Seller.seller_Name}</td><br>
    <td>Address:${Seller.seller_Address}</td><br>
    <td>Telephone:${Seller.seller_Telephone}</td><br>
    <td>Email:${Seller.seller_Email}</td><br>
    <td>Description:${Seller.seller_Description}</td><br>
    <hr>

		<a href="uploadad.jsp" >upload ad</a>
  </body>
</html>
