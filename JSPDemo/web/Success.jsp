<%-- 
    Document   : Success
    Created on : 21-Jan-2019, 15:03:43
    Author     : sparrow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fn" 
   uri = "http://java.sun.com/jsp/jstl/functions" %>
<%--<%@page errorPage = "Error.jsp" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= "Hello " + "world" %><br>
        
        <p>${pageContext.request.queryString}
        <p> Hello, ${sessionScope.name} </p>
        
        <% 
//            String name = (String)session.getAttribute("name");
            String age = application.getInitParameter("age");
            
            out.println("\nYou are "+age);
            
//            try {
//                int a = 10/0;
//            }
//            catch(Exception e) {
//                request.getRequestDispatcher("/Error").forward(request,response);
//            }
        %><br>
        <% out.println("You are a "+pageContext.getAttribute("gender",PageContext.SESSION_SCOPE)); %>
        <%-- throw new RuntimeException("Error condition!!!"); --%>
        

        
    </body>
</html>
