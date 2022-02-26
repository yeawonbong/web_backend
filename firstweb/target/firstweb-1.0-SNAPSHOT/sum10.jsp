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

<%
    int total = 0;
    for(int i = 1; i <= 10; i++){
        total = total + i;
    }
%>  <!--서블릿으로 바꿀 때 어떻게 바꿀 지 말해주는 기호-->

1부터 10까지의 합 : <%=total %> <!--응답으로 주는 내용 < % =  out.print(); == < % = % > -->

</body>
</html>
