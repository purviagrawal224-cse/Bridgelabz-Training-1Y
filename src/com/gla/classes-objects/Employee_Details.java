import java.util.Scanner;
class Employee_Details {
    String name;
    int id;
    double salary;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Main {
    public static void main(String[] args) {
        Employee_Details e = new Employee_Details();  // ✔ corrected
        e.input();
        e.displayDetails();
    }
}
