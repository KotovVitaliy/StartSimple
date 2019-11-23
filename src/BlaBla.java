public class BlaBla {
    private static BlaBla ourInstance = new BlaBla();

    public static BlaBla getInstance() {
        return ourInstance;
    }

    private BlaBla() {
    }
}
