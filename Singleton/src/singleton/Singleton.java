package singleton;
public class Singleton {
    
    private String name = null;
    private int id = 0;

    private static Singleton s = new Singleton();
    
    private Singleton(){}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static Singleton getInstance() {
        return s;
    }
    
    
}
