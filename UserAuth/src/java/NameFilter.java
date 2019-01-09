
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

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("I'm from name filter");
        
        boolean isRight = true;
        String username = request.getParameter("username").trim();
        
            for(int i=0;i<username.length();i++) {
                if(username.charAt(i)>='0' && username.charAt(i)<='9' || username.charAt(i)==' ') {
                    System.out.println("the name contain number");
                    isRight = false;
                    request
                            .getRequestDispatcher("Login.jsp")
                            .forward(request,response);   
                }
                
            }  
            if(isRight) {
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
