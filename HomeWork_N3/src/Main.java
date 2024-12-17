public class Main {
    public static void main(String[] args) {
        // Task 1: Find the 7th and 10th elements in a string
        System.out.println("=== Task 1: Search for 7th and 10th characters ===");
        String myString = "Hello, Java Programming!";
        if (myString.length() >= 10) {
            char seventhChar = myString.charAt(6);
            char tenthChar = myString.charAt(9);
            System.out.println("7th character: " + seventhChar);
            System.out.println("10th character: " + tenthChar);
        } else {
            System.out.println("The string is too short to access the 7th and 10th characters.");
        }

        // Task 2: Check if one string is a substring of the other
        System.out.println("\n=== Task 2: Check for Substring ===");
        String string1 = "Java Programming";
        String string2 = "Programming";

        if (string1.contains(string2)) {
            System.out.println("'" + string2 + "' is a substring of '" + string1 + "'");
        } else if (string2.contains(string1)) {
            System.out.println("'" + string1 + "' is a substring of '" + string2 + "'");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }

        // Task 3: Create two strings where one contains a part of the other
        System.out.println("\n=== Task 3: Strings with Shared Parts ===");
        String partString1 = "Automation Testing";
        String partString2 = "Testing";

        System.out.println("String 1: " + partString1);
        System.out.println("String 2: " + partString2);
        System.out.println("String 2 is a part of String 1: " + partString1.contains(partString2));
    }
}
