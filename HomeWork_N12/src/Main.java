import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona");

    //Task 1
        //Negative index version
        Utils.getNearestValidIndex(students, -1);
        //Too large index version
        Utils.getNearestValidIndex(students, 7);
        //Correct index version
        Utils.getNearestValidIndex(students, 4);

    //Task 2
        //Negative size array
        int[] myArray = Utils.createArrayWithSize(-5);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Print the array contents
        System.out.println("Array data:");
        for (int value : myArray) {
            System.out.println(value);
        }

    //Task 3
        // After processing, print the final updated array with valid values
        String[] stringArray = {"10", "20", "abc", "30", "50", "xyz"};

        Utils.convertAndFixArray(stringArray);
    }
}