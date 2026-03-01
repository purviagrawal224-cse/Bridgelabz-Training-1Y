package com.company.hr;
public class Employee {
    private int i;
    private String n;
    private String d;
    private double s;
    public Employee(int i, String n, String d, double s) {
        this.i = i;
        this.n = n;
        this.d = d;
        this.s = s;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public String getN() {
        return n;
    }
    public void setN(String n) {
        this.n = n;
    }
    public String getD() {
        return d;
    }
    public void setD(String d) {
        this.d = d;
    }
    public double getS() {
        return s;
    }
    public void setS(double s) {
        this.s = s;
    }
    public void show() {
        System.out.println("ID         : " + i);
        System.out.println("Name       : " + n);
        System.out.println("Department : " + d);
        System.out.println("Salary     : " + s);
    }
}