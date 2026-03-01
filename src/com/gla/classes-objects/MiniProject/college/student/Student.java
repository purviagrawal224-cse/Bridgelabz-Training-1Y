package college.student;
public class Student {
    private int id;
    private String name;
    private String dept;
    private double cg;
    public Student(int id, String name, String dept, double cg) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.cg = cg;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getCg() { return cg; }
    public void setCg(double cg) { this.cg = cg; }
    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nDepartment: " + dept +"\nCGPA: " + cg;
    }
}