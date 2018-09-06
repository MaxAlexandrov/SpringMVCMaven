<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.09.18
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>user</title>
</head>
<body>
<spring:form modelAttribute="userfromserver" method="post" action="/main/users/checker">
    <spring:input path="name"/>
    <spring:input path="password"/>
    <spring:button>check User</spring:button>
</spring:form>
</body>
</html>
