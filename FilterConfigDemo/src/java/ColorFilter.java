
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
public class ColorFilter implements Filter {

    FilterConfig filterConfig = null;
    
    @Override
    public void destroy() {
        Filter.super.destroy(); 
    }
    
    @Override
    public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, res);
        res.getWriter().println(filterConfig.getInitParameter("color"));
        System.out.println(filterConfig.getInitParameter("color"));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); 
        this.filterConfig = filterConfig;
        
    }
    
    
}
