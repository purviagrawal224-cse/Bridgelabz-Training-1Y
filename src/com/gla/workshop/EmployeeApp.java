import java.util.Scanner;
class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}
class Manager extends Employee {
    String dept;
    Manager(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }
    String generateEmail() {
        return name.toLowerCase() + "." + dept.toLowerCase() + "@company.com";
    }
}
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type (1-Employee, 2-Manager): ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        Employee e = null;
        if (ch == 1) e = new Employee(id, name);
        else if (ch == 2) {
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            e = new Manager(id, name, dept);
        }
	else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Email: " + e.generateEmail());
        sc.close();
    }
}