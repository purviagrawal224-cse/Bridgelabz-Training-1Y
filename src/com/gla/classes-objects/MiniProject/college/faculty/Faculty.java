package college.faculty;
public class Faculty {
    private int id;
    private String name;
    private String sub;
    private double sal;
    public Faculty(int id, String name, String sub, double sal) {
        this.id = id;
        this.name = name;
        this.sub = sub;
        this.sal = sal;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSub() { return sub; }
    public double getSal() { return sal; }
    public String toString() {
        return "Faculty ID: " + id +
               "\nName: " + name +
               "\nSubject: " + sub +
               "\nSalary: " + sal;
    }
}