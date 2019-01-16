
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sparrow
 */
public class MyListener implements ServletRequestAttributeListener {

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        ServletRequestAttributeListener.super.attributeReplaced(srae); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Replaced");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        ServletRequestAttributeListener.super.attributeRemoved(srae); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Removed");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletRequestAttributeListener.super.attributeAdded(srae); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Added");
    }
    
}
