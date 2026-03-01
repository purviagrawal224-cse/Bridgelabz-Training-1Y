import java.util.Scanner;
import com.university.department.cse.Course;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String n = sc.nextLine();
        System.out.print("Enter course code: ");
        int c = sc.nextInt();
        Course obj = new Course(n, c);
        System.out.println("\n--Course Details-- ");
        obj.show();
        sc.close();
    }
}
