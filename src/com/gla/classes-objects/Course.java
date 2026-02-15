import java.util.Scanner;
public class Course {
    String n;
    int d;
    double f;
    static String inst = "ABC Institute";
    Course(String n, int d, double f) {
        this.n = n;
        this.d = d;
        this.f = f;
    }
    void displayCourseDetails() {
        System.out.println("Course: " + n);
        System.out.println("Duration: " + d);
        System.out.println("Fee: " + f);
        System.out.println("Institute: " + inst);
        System.out.println();
    }
    static void updateInstituteName(String name) {
        inst = name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course 1 Name: ");
        String n1 = sc.nextLine();
        System.out.print("Enter Duration: ");
        int d1 = sc.nextInt();
        System.out.print("Enter Fee: ");
        double f1 = sc.nextDouble();
        sc.nextLine();
        Course c1 = new Course(n1, d1, f1);
        System.out.print("Enter Course 2 Name: ");
        String n2 = sc.nextLine();
        System.out.print("Enter Duration: ");
        int d2 = sc.nextInt();
        System.out.print("Enter Fee: ");
        double f2 = sc.nextDouble();
        sc.nextLine();
        Course c2 = new Course(n2, d2, f2);
        System.out.println("\nBefore Updating Institute:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        System.out.print("Enter New Institute Name: ");
        String newInst = sc.nextLine();
        Course.updateInstituteName(newInst);
        System.out.println("\nAfter Updating Institute:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        sc.close();
    }
}
