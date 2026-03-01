package college.department;
public class Department {
    private int id;
    private String name;
    private int total;
    public Department(int id, String name, int total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getTotal() { return total; }
    public String toString() {
        return "Department ID: " + id +
               "\nName: " + name +
               "\nTotal Students: " + total;
    }
}