<%-- 
    Document   : ConnectToDB
    Created on : 05-Feb-2019, 14:05:58
    Author     : sparrow
--%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource 
            var="ds" 
            driver="com.mysql.jdbc.Driver" 
            url="jdbc:mysql://localhost:8889/mydb" 
            user="root" 
            password="root"/>
        
            <sql:update var="ins" dataSource="${ds}">
                insert into student values(${param.student_name},${student_id});
            </sql:update>
        
        
            <sql:query var="rs" dataSource="${ds}">
                select * from student;
            </sql:query>
        
        
    </body>
</html>
