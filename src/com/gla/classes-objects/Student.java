import java.util.Scanner;
class Student {
    public int r;
    protected String n;
    private double c;
    Student(int r, String n, double c) {
        this.r = r;
        this.n = n;
        this.c = c;
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
class PostgraduateStudent extends Student {
    PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }
    void show() {
        System.out.println(r);
        System.out.println(n);
        System.out.println(getC());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        double c = sc.nextDouble();
        PostgraduateStudent p = new PostgraduateStudent(r, n, c);
        p.show();
        sc.close();
    }
}
