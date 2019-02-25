<%-- 
    Document   : Success
    Created on : 30-Jan-2019, 02:11:40
    Author     : sparrow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Landing Page</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="com.beans.MyBean">
            <jsp:setProperty name="myBean" property="name" value="${param.user}"/>
        </jsp:useBean>
        <h1>Welcome, <jsp:getProperty name="myBean" property="name"/></h1>
        <h3>Your Email : ${sessionScope.email}</h3>
    </body>
</html>
 