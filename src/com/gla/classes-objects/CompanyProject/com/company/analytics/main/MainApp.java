package com.company.analytics.main;
import com.company.analytics.sales.*;
import com.company.analytics.hr.*;
public class MainApp {
    public static void main(String[] args) {
        SalesReport s = new SalesReport("North", 250000);
        EmployeeReport e = new EmployeeReport("Aditya", "Excellent");
        System.out.println("---Company Report ---\n");
        System.out.println("Sales Section");
        s.show();
        System.out.println();
        System.out.println("HR Section");
        e.show();
    }
}