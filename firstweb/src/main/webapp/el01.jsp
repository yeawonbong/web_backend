<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 11:47 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  pageContext.setAttribute("p1", "page scope value");
  request.setAttribute("r1", "request scope value");
  session.setAttribute("s1", "session scope value");
  application.setAttribute("a1", "application scope value");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--JSP로 출력하는 경우-->
pageContext.getAttribute("p1") : <%=pageContext.getAttribute("p1")%> <br>
<!--EL로 출력하는 경우-->
pageContext.getAttribute("p1") : ${pageScope.p1} <br>
request.getAttribute("r1") : ${requestScope.r1} <br>
session.getAttribute("s1") : ${sessionScope.s1} <br>
application.getAttribute("a1") : ${applicationScope.a1} <br>

pageContextt.getAttribute("p1") : ${p1} <br> <!--key가 겹치지 않는다면 이렇게도 가능, 근데 명시적이지 않음..-->

</body>
</html>
