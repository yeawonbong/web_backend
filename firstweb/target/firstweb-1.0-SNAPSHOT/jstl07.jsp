<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 4:40 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="t" value="<script type='text/javascript'>alert(1);</script>"/>

<c:out value="${t}" escapeXml="true"/>
<%--${t}--%>
</body>
</html>
