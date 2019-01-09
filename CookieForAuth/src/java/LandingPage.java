import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LandingPage extends HttpServlet {
    public static int user = 0;
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
        user += 1;
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LandingPage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Visited User: "+user+"</p>");
//           for(int i=0;i<cookies.length;i++) {
//               cookie = cookies[i];
//               response.addCookie(cookie);
//               out.println("<p>Name: "+cookie.getName()+"</p>");
//               out.println("<p>Value: "+cookie.getValue()+"</p>");
//           }
            out.println("<a href='LogoutPage'>LOGOUT</a>");
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
