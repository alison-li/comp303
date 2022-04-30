public class TestAdapter {
    public static void main(String[] args) {
        Robot R2DTtheRobot = new Robot();
        Attacker R2DTtheAttacker = new RobotAdapter(R2DTtheRobot);

        R2DTtheAttacker.moveForward();
        R2DTtheAttacker.attackWithWeapon();
    }
}