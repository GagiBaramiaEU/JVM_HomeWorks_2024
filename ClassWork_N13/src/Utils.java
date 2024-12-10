import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Utils {

    public static void actionsOnStudents( ArrayList<String> students){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action: 1-Add, 2-Remove, 3-Search, 4-Print Sorted, 5-Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to add student: ");
                    String toAdd = scanner.nextLine();
                    if(students.contains(toAdd)) {
                        System.out.println(toAdd + " - this student is already added");
                    }else {
                        students.add(toAdd);
                    }
                    break;
                case 2:
                    System.out.print("Enter a string to remove student: ");
                    String toRemove = scanner.nextLine();
                    students.remove(toRemove);
                    break;
                case 3:
                    System.out.print("Enter a string to search student: ");
                    String toSearch = scanner.nextLine();
                    System.out.println(students.contains(toSearch) ? "Provided studant has found" : "Provided student has not found");
                    System.out.println("If you want change this student click - 1");
                    String changeStudent = scanner.nextLine();
                    if(Objects.equals(changeStudent, "1")){
                        students.remove(toSearch);
                        System.out.println("Enter new name of student: ");
                        String newStudentName = scanner.nextLine();
                        students.add(newStudentName);
                    }else{
                        break;
                    }
                    break;
                case 4:
                    Collections.sort(students);
                    System.out.println("Sorted List of students: " + students);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


}
