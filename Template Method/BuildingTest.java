/**
 * Template Method Pattern Demo
 */
public class BuildingTest {
    public static void main(String[] args) {
        Church notreDame = new Church();
        System.out.println("The Notre Dame");
        notreDame.constructBuilding();

        System.out.println();

        Tower alisonTower = new Tower();
        System.out.println("The Alison Tower");
        alisonTower.setPublicWork();
        alisonTower.constructBuilding();
    }
}