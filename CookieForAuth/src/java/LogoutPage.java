/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sparrow
 */
@WebServlet(urlPatterns = {"/LogoutPage"})
public class LogoutPage extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Cookie cookies[] = request.getCookies();
        Cookie cookie;
        for(int i=0;i<cookies.length;i++) {
            cookie= new Cookie(cookies[i].getName(),"");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        request.getRequestDispatcher("index.html").forward(request,response);
        
        try (PrintWriter out = response.getWriter()) {    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogoutPage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Logged out</h1>");
//            out.println("<a href='/CookieForAuth/'>LOGIN</a>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
