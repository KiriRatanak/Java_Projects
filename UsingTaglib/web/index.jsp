<%-- 
    Document   : index
    Created on : 05-Feb-2019, 14:05:10
    Author     : sparrow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Connect" name="insert" value="1">
            <input type="text" placeholder="Student ID" name="student_name" /><br> 
            <input type="text" placeholder="Name" name="student_id" /><br> 
            <input type="submit" value="Create"/><br>
        </form>
        <form action="Connect" name="retrieve" value="2">
            <input type="submit" value="Retrieve"/>
        </form>
    </body>
</html>
