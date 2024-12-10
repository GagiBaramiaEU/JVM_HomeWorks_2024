import java.util.List;

public class Utils {
    public static void getNearestValidIndex(List<?> myList, int index) {
        try {
            System.out.println("You have valid index and on that we have this element: "+myList.get(index));
        } catch (IndexOutOfBoundsException e) {
            if (index >= myList.size()) {
                while (index >= myList.size()) {
                    index--;
                }
                System.out.println("Your index was too large. This is the closest element to your index: " + myList.get(index));
            } else if (index < 0) {
                System.out.println("Index should start with 0. It should not be negative.");
            }
        }
    }

    public static int[] createArrayWithSize(int size) {
        try {
            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative.");
            }

            return new int[size];

        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());

            System.out.println("Using default array size: 5");
            size = Math.abs(size);

            return new int[size];
        }
    }

    public static void convertAndFixArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                int number = Integer.parseInt(array[i]);
                System.out.println("Element at index " + i + " is a valid number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid element at index " + i + ": \"" + array[i] + "\". Fixing it.");

                array[i] = "0";

                System.out.println("Fixed array: ");
                for (String element : array) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Final updated array:");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
