package college.main;
import college.student.Student;
import college.faculty.Faculty;
import college.department.*;
import static java.lang.Math.*;
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student(1, "Aditya", "CSE", 8.7);
        Faculty f = new Faculty(101, "Dr. Rao", "Java", 75000);
        Department d = new Department(10, "Computer Science", 120);
        double cgRound = round(s.getCg());
        System.out.println("---College Report ---\n");
        System.out.println(s);
        System.out.println("Rounded CGPA: "+ cgRound);
        System.out.println("\n" +f);
        System.out.println("\n"+ d);
    }
}