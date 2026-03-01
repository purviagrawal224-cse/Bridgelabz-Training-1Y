package com.company.payroll;
import com.company.hr.Employee;
public class Payroll {
    public double cal(Employee e) {
        double b = e.getS() * 0.10;
        return e.getS() + b;
    }
}