public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password; // Note: Storing passwords like this is not secure, this is just for demo purposes.
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal with email " + email);
    }
}

