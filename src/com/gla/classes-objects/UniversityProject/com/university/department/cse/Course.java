package com.university.department.cse;
public class Course {
    private String n;
    private int c;
    public Course(String n, int c) {
        this.n = n;
        this.c = c;
    }
    public void show() {
        System.out.println("Course Name  : " + n);
        System.out.println("Course Code  : " + c);
    }
}