import java.util.Scanner;
import college.student.Student;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter roll: ");
        int r = sc.nextInt();
        Student s = new Student(n, r);
        System.out.println("\n--Details--");
        s.show();
        sc.close();
    }
}