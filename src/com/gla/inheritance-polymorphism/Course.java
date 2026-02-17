import java.util.*;
class Course {
    String cn;
    int d;
    Course(String cn, int d) {
        this.cn = cn;
        this.d = d;
    }
    void display() {
        System.out.println("Course Name : " + cn);
        System.out.println("Duration (weeks) : " + d);
    }
}
class OnlineCourse extends Course {
    String p;
    boolean ir;
    OnlineCourse(String cn, int d, String p, boolean ir) {
        super(cn, d);
        this.p = p;
        this.ir = ir;
    }
    void display() {
        super.display();
        System.out.println("Platform : " + p);
        System.out.println("Recorded : " + ir);
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double f;
    double dis;
    PaidOnlineCourse(String cn, int d, String p, boolean ir, double f, double dis) {
        super(cn, d, p, ir);
        this.f = f;
        this.dis = dis;
    }
    void display() {
        super.display();
        double fp = f - (f*dis /100);
        System.out.println("Fee : " +f);
        System.out.println("Discount (%) : "+ dis);
        System.out.println("Final Price : "+fp);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name : ");
        String cn = sc.nextLine();
        System.out.print("Enter duration (weeks) : ");
        int d = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter platform : ");
        String p = sc.nextLine();
        System.out.print("Is recorded (true/false) : ");
        boolean ir = sc.nextBoolean();
        System.out.print("Enter fee : ");
        double f = sc.nextDouble();
        System.out.print("Enter discount (%) : ");
        double dis = sc.nextDouble();
        PaidOnlineCourse ob = new PaidOnlineCourse(cn, d, p, ir, f, dis);
        System.out.println();
        ob.display();
        sc.close();
    }
}
