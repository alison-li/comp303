/**
 * Prototype Pattern Demo
 * This class plays the role of the Client, asking the Prototype to clone itself.
 */
public class TeaFactory {
    public static void main(String[] args) {
        OolongTea sampleTea = new OolongTea();

        OolongTea clonedTea = (OolongTea) sampleTea.clone();

        // Will have different hashcodes
        System.out.println(sampleTea);
        System.out.println(clonedTea);
    }
}