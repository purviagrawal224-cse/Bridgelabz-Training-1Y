import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    double marks;
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }
}
class EngineeringStudent extends Student {
    String branch;
    EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }
    String calculateGrade() {
        name = name + " - " + branch;
        return super.calculateGrade();
    }
}
public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Normal, 2-Engineering): ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter roll no: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        Student s = null;
        if(ch == 1) s = new Student(roll, name, marks);
        else if(ch == 2) {
            System.out.print("Enter branch: ");
            String branch = sc.nextLine();
            s = new EngineeringStudent(roll, name, marks, branch);
        } 
        else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Name: " + s.name);
        System.out.println("Grade: " + s.calculateGrade());
        sc.close();
    }
}