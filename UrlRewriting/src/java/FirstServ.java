import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServ extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
        response.setContentType("text/html;charset=UTF-8");
        String param = request.getParameter("user");
        
//        response.getWriter().println("<a href='SecondServ?user="+param+"'>Second</a>");
        response.getWriter().println("<form action='SecondServ'>");
        response.getWriter().println("<input type='hidden' name='user' value='"+param+"'>");
        response.getWriter().println("<input type='submit' value='Login'>");
        response.getWriter().println("</form>");
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
