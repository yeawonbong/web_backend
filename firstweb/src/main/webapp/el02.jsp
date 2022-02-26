<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 12:43 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="true" %>
<%
    request.setAttribute("k", 10);
    request.setAttribute("m", true);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>EL연산</h3>
k: ${k} <br>
k + 5 : ${k + 5} <br>
k * 5 : ${k * 5} <br>
k / 5 : ${k / 5} <br>
<h3>EL비교논리연산</h3>
k : ${k} <br>
k > 5 : ${k>5} <br>
k < 5 : ${k<5} <br>
m : ${m} <br>
!m : ${!m} <br>
</body>
</html>
