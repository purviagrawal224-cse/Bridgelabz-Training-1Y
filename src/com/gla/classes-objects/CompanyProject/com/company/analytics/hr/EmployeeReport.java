package com.company.analytics.hr;
public class EmployeeReport {
    private String n;
    private String p;
    public EmployeeReport(String n, String p) {
        this.n = n;
        this.p = p;
    }
    public void show() {
        System.out.println("Employee : " + n);
        System.out.println("Performance : " + p);
    }
}