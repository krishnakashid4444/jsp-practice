<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%@page import="Dao.userDao"%>��
    <jsp:useBean id="u" class="Bean.User"></jsp:useBean>��
    <jsp:setProperty property="*" name="u"/>��
    ��
    <%
    int i=userDao.save(u);
    if(i>0){
    response.sendRedirect("adduser-success.jsp");
    }else{
    response.sendRedirect("adduser-error.jsp");
    }
    %>��

</body>
</html>