
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
public class AuditFilter implements Filter{
    
    //for visit count
    static int count =0;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("I'm from init");
    }
    
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException{
        System.out.println("I'm from doFilter");
        //This line of code increment count by once each time the LandingPage is visited
        ++count;
        System.out.println("Visited: "+count);
    }
    
    @Override
    public void destroy() {
        System.out.println("I'm from destroy");
    }
    
}
