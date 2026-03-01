package college.student;
public class Student {
    private String n;
    private int r;
    public Student(String n, int r) {
        this.n = n;
        this.r = r;
    }
    public void show() {
        System.out.println("Student Name : " + n);
        System.out.println("Roll Number  : " + r);
    }
}