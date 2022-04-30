/**
 * Leaf
 */
public class MilkTea implements Tea {
    public String getDescription() {
        return "Milk oolong tea";
    }

    public double getCost() {
        System.out.println("Cost of milk tea: " + 3.50);
        return 3.50;
    }
}