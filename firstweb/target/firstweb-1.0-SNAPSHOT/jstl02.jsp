<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 1:54 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<%--%>
<%--    request.setAttribute("n", 10);--%>
<%--%>--%>
<c:set var="n" scope="request" value="10"/>
<!--둘 다 같은 코드이다-->
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${n == 0}">
    n과 0은 같습니다.
</c:if>
<c:if test="${n == 10}">
    n과 10은 같습니다.
</c:if>
</body>
</html>
