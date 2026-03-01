import java.util.Scanner;
import college.student.Student;
import college.faculty.Faculty;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String sn = sc.nextLine();
        System.out.print("Enter roll number: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter faculty name: ");
        String fn = sc.nextLine();
        System.out.print("Enter subject: ");
        String sub = sc.nextLine();
        Student s = new Student(sn, r);
        Faculty f = new Faculty(fn, sub);
        System.out.println("\n--- Details ---");
        s.show();
        f.show();
        sc.close();
    }
}