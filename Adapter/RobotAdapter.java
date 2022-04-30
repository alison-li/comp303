/**
 * Adapter
 */
public class RobotAdapter implements Attacker {
    private Robot aRobot;
    
    public RobotAdapter(Robot pRobot) {
        aRobot = pRobot;
    }

    public void moveForward() {
        aRobot.walkForward();
    }

    public void attackWithWeapon() {
        aRobot.destroyWithDrill();
    }
}