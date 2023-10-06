import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
    }

    public void checkout(CreditCardStrategy paymentStrategy) {
        double amount = calculateTotal();
        paymentStrategy.processPayment(amount);
    }

}

