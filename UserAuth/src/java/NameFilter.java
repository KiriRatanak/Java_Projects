
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author sparrow
 */
public class NameFilter implements Filter {

    public static boolean isValid = false;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("I'm from name filter");
        
        String myPass = "admin";
        
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        
        
            for(int i=0;i<username.length();i++) {
                if(username.charAt(i)>='0' && username.charAt(i)<='9' || username.charAt(i)==' ') {
                    System.out.println("the name contain number");
                    this.isValid = true;
                    request
                            .getRequestDispatcher("Login.jsp")
                            .forward(request,response);   
                    break;
                }
                
            }
            
            if(password != myPass) {
                this.isValid = true;
            }
            
            if(this.isValid) {
                request
                        .getRequestDispatcher("LandingPage")
                        .forward(request,response);   
            }
            
    }

    @Override
    public void destroy() {
        Filter.super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
