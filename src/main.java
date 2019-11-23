public class main
{
    public static void main(String[] args) {
        System.out.println("Начало программы");

        Singleton.five();

        System.out.println("Тут мы добрались до объекта");
        Singleton S = Singleton.getInstance();
    }
}