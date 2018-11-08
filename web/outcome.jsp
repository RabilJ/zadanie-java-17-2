<%--
  Created by IntelliJ IDEA.
  User: Jakub
  Date: 08.11.2018
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Outcome</title>
</head>
<body>
<h1>Podliczenie</h1>
<%out.print(request.getParameter("text"));%>
<h1> Ilość słów <%out.print(request.getAttribute("wordNumber"));%></h1>
<h1> Ilość znaków <%out.print(request.getAttribute("charN"));%></h1>
<h1> Ilość znaków(bez spacji) <%out.print(request.getAttribute("charNoBlanksNumber"));%></h1>
<h1> Czy tekst jest palindromem <%out.print(request.getAttribute("isPalindrom"));%></h1>
</body>
</html>
