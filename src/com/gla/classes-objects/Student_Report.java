import java.util.Scanner;
public class Student_Report {
    String n;
    int r;
    int m;
    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        n = sc.nextLine();
        System.out.print("Enter Roll No: ");
        r = sc.nextInt();
        System.out.print("Enter Marks: ");
        m = sc.nextInt();
    }
    String grade() {
        if (m >= 90) return "A";
        else if (m >= 75) return "B";
        else if (m >= 50) return "C";
        else return "Fail";
    }
    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + n);
        System.out.println("Roll No: " + r);
        System.out.println("Marks: " + m);
        System.out.println("Grade: " + grade());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Report s = new Student_Report();
        s.input(sc);
        s.display();
        sc.close();
    }
}
