/**
 * Singleton Pattern Demo
 */
public class GameEngine {
    private static final GameEngine CURRENT_GAME_ENGINE = new GameEngine();

    private GameEngine() {}

    public static GameEngine getGameEngine() {
        return CURRENT_GAME_ENGINE;
    }
}