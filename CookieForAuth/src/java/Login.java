import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    
        Cookie username = new Cookie("username",request.getParameter("username"));
        Cookie password = new Cookie("password",request.getParameter("password"));
        
//        HttpSession session = new Session(); 
        
        response.addCookie(username);
        response.addCookie(password);
        
//        RequestDispatcher rd = request.getRequestDispatcher("/LandingPage");
//        rd.forward(request,response);
        PrintWriter pw = response.getWriter();
        pw.println("<a href='LandingPage'>LOGIN</a>");
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
