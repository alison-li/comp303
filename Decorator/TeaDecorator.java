/**
 * Decorator
 * Note: We went with an abstract class as a type of decorator. 
 * The key point is that it still implements the same interface as the object we are decorating does.
 */
public abstract class TeaDecorator implements Tea {
    protected Tea tempTea;

    public TeaDecorator(Tea pTea) {
        tempTea = pTea;
    }

    public String getDescription() {
        return tempTea.getDescription();
    }

    public double getCost() {
        return tempTea.getCost();
    }
}