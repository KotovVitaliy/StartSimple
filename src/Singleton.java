public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Работает конструктор");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static int five() {
        return 5;
    }
}
