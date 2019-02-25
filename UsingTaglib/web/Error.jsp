<%-- 
    Document   : Error
    Created on : 06-Feb-2019, 14:05:23
    Author     : sparrow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= exception.printStackTrace() %>
    </body>
</html>
