public class Main {
    public static void main(String[] args) {
        EuropeanUniversity euUniversity = new EuropeanUniversity("European University", "Paris", 201, 90, 3000);
        TechnicalUniversity techUniversity = new TechnicalUniversity("Technical University", "Berlin", 202, 95, 2500);

        euUniversity.displayDetails();
        System.out.println();
        techUniversity.displayDetails();
        System.out.println();

        compareUniversities(euUniversity, techUniversity);
    }

    public static void compareUniversities(University uni1, University uni2) {
        System.out.println("Comparison between " + uni1.getName() + " and " + uni2.getName() + ":");

        if (uni1.getGpi() > uni2.getGpi()) {
            System.out.println(uni1.getName() + " has a higher GPI: " + uni1.getGpi());
        } else if (uni1.getGpi() < uni2.getGpi()) {
            System.out.println(uni2.getName() + " has a higher GPI: " + uni2.getGpi());
        } else {
            System.out.println("Both universities have the same GPI: " + uni1.getGpi());
        }

        if (uni1.getTotalStudents() > uni2.getTotalStudents()) {
            System.out.println(uni1.getName() + " has more students: " + uni1.getTotalStudents());
        } else if (uni1.getTotalStudents() < uni2.getTotalStudents()) {
            System.out.println(uni2.getName() + " has more students: " + uni2.getTotalStudents());
        } else {
            System.out.println("Both universities have the same number of students: " + uni1.getTotalStudents());
        }
    }
}
