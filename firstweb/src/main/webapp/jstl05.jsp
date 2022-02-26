<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/26
  Time: 4:27 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="http://localhost:8080/firstweb_war/jstlValue.jsp" var="urlValue" scope="request"/>
<c:import url="https://google.co.kr" var="google" scope="request"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
${urlValue}
${google}
</body>
</html>
