package college.faculty;
public class Faculty {
    private String n;
    private String s;
    public Faculty(String n, String s) {
        this.n = n;
        this.s = s;
    }
    public void show() {
        System.out.println("Faculty Name : " + n);
        System.out.println("Subject      : " + s);
    }
}