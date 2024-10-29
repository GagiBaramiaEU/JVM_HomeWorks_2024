class TechnicalUniversity extends University {
    private int totalStudents;

    public TechnicalUniversity(String name, String location, int id, int gpi, int totalStudents) {
        super(name, location, id, gpi);
        this.totalStudents = totalStudents;
    }

    @Override
    public void displayDetails() {
        System.out.println("University Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("ID: " + getId());
        System.out.println("GPI: " + getGpi());
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Type: Technical University");
    }

    @Override
    public int getTotalStudents() {
        return totalStudents;
    }
}