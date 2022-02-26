<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 1:36 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="value1" scope="request" value="kang"></c:set>
<html>
<head>
    <title>Title</title>
</head>
<body>
성 : ${requestScope.value1} <br>
<c:remove var="value1" scope="request"/> <!--단일태그 가능-->
성 : ${requestScope.value1} <br>
</body>
</html>
