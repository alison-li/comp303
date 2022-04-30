/**
 * Decorator Pattern Demo
 */
public class TeaMaker {
    public static void main(String[] args) {
        Tea myTea = new Jelly(new Pearls(new MilkTea()));

        System.out.println("Description: " + myTea.getDescription());
        System.out.println("Total Cost: " + myTea.getCost());
    }
}