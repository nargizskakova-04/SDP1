public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        System.out.println("Instance 1 hash:" + instance1.hashCode());

        instance1.message();
    }
}
