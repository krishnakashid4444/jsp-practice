<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%@page import="Bean.RegisterDao"%>  
    <jsp:useBean id="obj" class="Bean.User"/>  
      
    <jsp:setProperty property="*" name="obj"/>  
      
    <%
    int status=RegisterDao.register(obj);
    if(status>0)
    out.print("You are successfully registered");
    
    %>  

</body>
</html>