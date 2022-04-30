/**
 * Concrete Decorator
 */
public class Pearls extends TeaDecorator {
    public Pearls(Tea pTea) {
        super(pTea);
    }

    public String getDescription() {
        return tempTea.getDescription() + ", pearls";
    }

    public double getCost() {
        System.out.println("Cost of pearls: " + 0.50);
        return tempTea.getCost() + 0.50;
    }
}