package app;

class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger created.\n");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void print(String message) {
        System.out.println(message);
    }
}
