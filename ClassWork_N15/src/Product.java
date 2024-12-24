public class Product {
    String productName;
    String productID;
    int quantity;
    double price;

    public Product(String productName, String productID, int quantity, double price) {
        this.productName = productName;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productID + ", Name: " + productName + ", Quantity: " + quantity + ", Price: $" + price;
    }
}
