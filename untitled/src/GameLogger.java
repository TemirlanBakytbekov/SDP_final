public class GameLogger {
    private static GameLogger instance;
    public static GameLogger getInstance() {
        if (instance == null) {
            instance = new GameLogger();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("[LOG] " + message);
    }
}
