public class ShoppingCartDemo {
    public static void main(String[] args) {
        // Create some products
        Product apple = new Product("Apple", 0.50, 5);
        Product book = new Product("Book", 10, 2);

        // Add products to shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(apple);
        cart.addProduct(book);

        // Display cart contents and total
        System.out.println("Cart total: $" + cart.calculateTotal());

        // Select a payment strategy and checkout
        CreditCardStrategy creditCard = new CreditCardStrategy("1234567812345678", "123");
        cart.checkout(creditCard);
        
    }
}
