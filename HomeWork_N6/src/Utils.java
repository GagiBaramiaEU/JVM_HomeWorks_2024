import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Utils {
    public static void actionsOnProducts(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an action: \n1-Add Product \n2-Remove Product \n3-Search Product \n4-Print Products Sorted \n5-Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    boolean isDuplicate = products.stream()
                            .anyMatch(p -> p.getName().equalsIgnoreCase(name));

                    if (isDuplicate) {
                        System.out.println(name + " - this product is already added.");
                    } else {
                        System.out.print("Enter product price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        products.add(new Product(name, price));
                        System.out.println("Product added successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String toRemove = scanner.nextLine();
                    boolean removed = products.removeIf(p -> p.getName().equalsIgnoreCase(toRemove));
                    System.out.println(removed ? "Product removed successfully." : "Product not found.");
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String toSearch = scanner.nextLine();
                    Optional<Product> foundProduct = products.stream()
                            .filter(p -> p.getName().equalsIgnoreCase(toSearch))
                            .findFirst();

                    if (foundProduct.isPresent()) {
                        System.out.println("Product found: " + foundProduct.get());
                        System.out.println("Do you want to update the product name? Press 1 for Yes");
                        String changeChoice = scanner.nextLine();
                        if (changeChoice.equals("1")) {
                            System.out.print("Enter new product name: ");
                            String newName = scanner.nextLine();
                            foundProduct.get().setName(newName);
                            System.out.println("Product name updated successfully!");
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.println("Choose sorting option: \n1-Sort by Name \n2-Sort by Price");
                    int sortChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    if (sortChoice == 1) {
                        products.sort(Comparator.comparing(Product::getName));
                    } else if (sortChoice == 2) {
                        products.sort(Comparator.comparingDouble(Product::getPrice));
                    } else {
                        System.out.println("Invalid sorting option.");
                        break;
                    }
                    System.out.println("Sorted Products: ");
                    products.forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
