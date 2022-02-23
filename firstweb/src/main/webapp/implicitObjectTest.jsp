<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/23
  Time: 7:12 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StringBuffer url = request.getRequestURL();
    out.print("url :" + url.toString());
    out.print("<br>");
%>
</body>
</html>
