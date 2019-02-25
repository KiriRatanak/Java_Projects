package singleton;

public class Main {
    public static void main(String[] args) {
        
        Singleton s = Singleton.getInstance();
        Singleton s12 = Singleton.getInstance();
    
        s.setId(1);
        s.setName("Vex");
   
        System.out.println(s12.getId() +" : "+s12.getName());             
    }
}
