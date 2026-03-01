package com.company.main;
import java.util.Scanner;
import com.company.hr.Employee;
import com.company.payroll.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Department: ");
        String d = sc.nextLine();
        System.out.print("Enter Salary: ");
        double s = sc.nextDouble();
        Employee e = new Employee(i, n, d, s);
        Payroll p = new Payroll();
        double ns = p.cal(e);
        System.out.println("\n--- Details ---");
        e.show();
        System.out.println("Salary After Bonus : " + ns);
        sc.close();
    }
}