import java.util.*;
class Person {
    String n;
    int a;
    Person(String n, int a) {
        this.n = n;
        this.a = a;
    }
    void display() {
        System.out.println("Name : " + n);
        System.out.println("Age : " + a);
    }
}
class Teacher extends Person {
    String sub;
    Teacher(String n, int a, String sub) {
        super(n, a);
        this.sub = sub;
    }
    void displayRole() {
        System.out.println("Role : Teacher");
    }
    void display() {
        displayRole();
        super.display();
        System.out.println("Subject : " + sub);
        System.out.println();
    }
}
class Student extends Person {
    String g;
    Student(String n, int a, String g) {
        super(n, a);
        this.g = g;
    }
    void displayRole() {
        System.out.println("Role : Student");
    }
    void display() {
        displayRole();
        super.display();
        System.out.println("Grade : "+g);
        System.out.println();
    }
}
class Staff extends Person {
    String d;
    Staff(String n, int a, String d) {
        super(n, a);
        this.d = d;
    }
    void displayRole() {
        System.out.println("Role : Staff");
    }
    void display() {
        displayRole();
        super.display();
        System.out.println("Department : "+d);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons : ");
        int n = sc.nextInt();
        sc.nextLine();
        Person[] arr = new Person[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter role (teacher/student/staff) : ");
            String r = sc.nextLine().toLowerCase();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter age : ");
            int age = sc.nextInt();
            sc.nextLine();
            if(r.equals("teacher")) {
                System.out.print("Enter subject : ");
                String sub = sc.nextLine();
                arr[i] = new Teacher(name, age, sub);
            }
            else if(r.equals("student")) {
                System.out.print("Enter grade : ");
                String g = sc.nextLine();
                arr[i] = new Student(name, age, g);
            }
            else {
                System.out.print("Enter department : ");
                String d = sc.nextLine();
                arr[i] = new Staff(name, age, d);
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++) arr[i].display();
        sc.close();
    }
}
