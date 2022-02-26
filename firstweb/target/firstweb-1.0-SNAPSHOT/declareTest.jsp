<%--
  Created by IntelliJ IDEA.
  User: yeawonbong
  Date: 2022/02/23
  Time: 12:40 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>sum10</title>
</head>
<body>

선언한 메서드를 이용해 id 출력 : <%=getId()%>
<%!
    String id = "u001"; //멤버변수 선언
    public String getId() { //메서드 선언
        return id;
    }
%>
</body>
</html>
