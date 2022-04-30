/**
 * Concrete Class
 */
public class Church extends Building {
    public void constructFoundation() {
        System.out.println("Foundation: Wood");
    }

    public void constructWalls() {
        System.out.println("Walls: Stone");
    }

    public void constructWindows() {
        System.out.println("Windows: Painted Glass");
    }
}