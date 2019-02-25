<%-- 
    Document   : index
    Created on : 21-Jan-2019, 13:42:49
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
        <h1>Hello World!</h1>
        <form action="Next.jsp">
            <input type="text" placeholder="Email" name="email"/>
            <input type="text" placeholder="Name" name="user"/>
            <input type="submit" value="Click"/>
        </form>
        
        <%--<jsp:forward page="Next.jsp"/> --%>
        
        <!-- print Next.jsp in index.jsp -->
        <%--<jsp:include page="Next.jsp" />--%> 
        
        
        
    </body>
</html>
