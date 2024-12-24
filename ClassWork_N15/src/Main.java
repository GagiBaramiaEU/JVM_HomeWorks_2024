import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventorySystem system = new InventorySystem();
        int choice;

        do {
            System.out.println("\nProduct Inventory System");
            System.out.println("1. Add Product");
            System.out.println("2. Sell Product");
            System.out.println("3. List Products");
            System.out.println("4. Find Product by ID");
            System.out.println("5. List Products Sorted by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productID = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Product newProduct = new Product(productName, productID, quantity, price);
                    system.addProduct(productID, newProduct);
                    break;

                case 2:
                    System.out.print("Enter Product ID to sell: ");
                    String sellProductID = scanner.nextLine();
                    System.out.print("Enter Quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    scanner.nextLine();

                    system.sellProduct(sellProductID, sellQuantity);
                    break;

                case 3:
                    System.out.println("Listing all products:");
                    system.listProducts();
                    break;

                case 4:
                    System.out.print("Enter Product ID to find: ");
                    String findProductID = scanner.nextLine();
                    Product foundProduct = system.findProductByID(findProductID);
                    if (foundProduct != null) {
                        System.out.println(foundProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Listing products sorted by name:");
                    system.listSortedProductsByName();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
