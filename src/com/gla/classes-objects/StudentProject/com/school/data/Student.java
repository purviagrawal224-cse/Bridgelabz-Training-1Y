package com.school.data;
public class Student {
    private String n;
    private double m1;
    private double m2;
    private double m3;
    public Student(String n, double m1, double m2, double m3) {
        this.n = n;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public String getN() {
        return n;
    }
    public double getM1() {
        return m1;
    }
    public double getM2() {
        return m2;
    }
    public double getM3() {
        return m3;
    }
    public String toString() {
        return "Name   : " + n +
               "\nMarks1 : " + m1 +
               "\nMarks2 : " + m2 +
               "\nMarks3 : " + m3;
    }
}