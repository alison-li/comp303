/**
 * Concrete Decorator
 */
public class Jelly extends TeaDecorator {
    public Jelly(Tea pTea) {
        super(pTea);
    }

    public String getDescription() {
        return tempTea.getDescription() + ", jelly";
    }

    public double getCost() {
        System.out.println("Cost of jelly: " + 0.25);
        return tempTea.getCost() + 0.25;
    }
}