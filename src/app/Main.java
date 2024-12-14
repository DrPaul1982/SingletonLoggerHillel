package app;


public class Main extends NewLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.print("Hello from first created logger.");
        Logger logger2 = Logger.getInstance();
        logger2.print("Hello from second created logger.");
        Logger logger3 = Logger.getInstance();
        logger3.print("Hello from third created logger.");
        Logger logger4 = Logger.getInstance();
        logger4.print("Hello from fourth created logger.");
        anotherLogger.print("Hello from Another logger.\n");

        System.out.println("Checking is Logger the same." +
                "\nFirst and Second created Loggers are the same Logger = " + (logger1 == logger2) +
                "\nSecond and Third created Loggers are the same Logger = " + (logger2 == logger3) +
                "\nThird and Fourth created Loggers are the same Logger = " + (logger3 == logger4) +
                "\nFirst and Another created Loggers are the same Logger = " + (logger1 == anotherLogger));


    }
}
