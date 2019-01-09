
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncryptionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException,ServletException,NullPointerException {
        System.out.println("Hello from filter side");
        chain.doFilter(req, res);
        
    }
    
    @Override
    public void destroy() {
        Filter.super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hi");
        
    }
    
}
