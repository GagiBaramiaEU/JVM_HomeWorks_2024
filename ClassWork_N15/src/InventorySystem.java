import java.util.*;

public class InventorySystem {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(String productID, Product product) {
        inventory.put(productID, product);
        System.out.println("Product added: " + product);
    }

    public void sellProduct(String productID, int quantity) {
        Product product = inventory.get(productID);
        if (product != null) {
            if (product.quantity >= quantity) {
                product.quantity -= quantity;
                System.out.println("Sold " + quantity + " units of " + product.productName + ". Remaining quantity: " + product.quantity);
            } else {
                System.out.println("Not enough stock to sell. Available quantity: " + product.quantity);
            }
        } else {
            System.out.println("Product not found with ID: " + productID);
        }
    }

    public void listProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        Iterator<Map.Entry<String, Product>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Product> entry = iterator.next();
            System.out.println(entry.getValue());
        }
    }

    public Product findProductByID(String productID) {
        return inventory.get(productID);
    }

    public void listSortedProductsByName() {
        List<Product> productList = new ArrayList<>(inventory.values());
        productList.sort(Comparator.comparing(product -> product.productName));
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
