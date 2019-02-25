
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;




/**
 *
 * @author sparrow
 */
public class LoginListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequestListener.super.requestInitialized(sre); 
        
        
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequestListener.super.requestDestroyed(sre); //To change body of generated methods, choose Tools | Templates.
    }
    
}
