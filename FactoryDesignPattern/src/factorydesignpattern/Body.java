
package factorydesignpattern;


public class Body implements SumInterface {
    @Override
    public int sum() {
        int a = 10+20;
        return a;
    }
}
