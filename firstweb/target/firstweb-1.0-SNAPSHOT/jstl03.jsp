<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 2:01 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    request.setAttribute("score", 3);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${90 <= score}">
        A학점입니다.
    </c:when>
    <c:when test="${80 <= score}">
        B학점입니다.
    </c:when>
    <c:when test="${70 <= score}">
        C학점입니다.
    </c:when>
    <c:when test="${60 <= score}">
        D학점입니다.
    </c:when>
    <c:otherwise>
        F학점입니다.
    </c:otherwise>

</c:choose>
</body>
</html>
