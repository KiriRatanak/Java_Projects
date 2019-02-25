<%-- 
    Document   : Next
    Created on : 30-Jan-2019, 02:04:22
    Author     : sparrow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Next Page</title>
    </head>
    <body>
        
        <% 
            String email = request.getParameter("email");
            
            session.setAttribute("email", email);
            
            request.getRequestDispatcher("Landing.jsp").forward(request, response);
        %>
        
        
    </body>
</html>
