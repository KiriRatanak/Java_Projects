
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sparrow
 */
public class SessionCounter implements HttpSessionListener {
    
    private static int activeSession = 0;
    
    public void sessionCreated(HttpSessionEvent ev) {
        System.out.println("Session created");
        ++activeSession;
    }
    
    public void sessionDestroyed(HttpSessionEvent ev) {
        System.out.println("Session destroyed");
        --activeSession;
    }
    
    public static int getActiveSession() {
        return activeSession;
    }
}
