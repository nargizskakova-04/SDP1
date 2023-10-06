public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void message(){
        System.out.println("It is working");
    }
}
