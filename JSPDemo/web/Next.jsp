<%-- 
    Document   : Next
    Created on : 21-Jan-2019, 13:56:14
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
        <% 
            String name = request.getParameter("user");
            
            session.setAttribute("name", name);
            
            pageContext.setAttribute("gender","male",PageContext.SESSION_SCOPE);
            
            request.getRequestDispatcher("Success.jsp").forward(request, response);
        %>
        
        <!--Print out the value of attribute 'user'-->
    </body>
</html>
