abstract class University {
    private String name;
    private String location;
    private int id;
    private int gpi;

    public University(String name, String location, int id, int gpi) {
        this.name = name;
        this.location = location;
        this.id = id;
        this.gpi = gpi;
    }

    public abstract void displayDetails();
    public abstract int getTotalStudents();

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public int getGpi() {
        return gpi;
    }
}
