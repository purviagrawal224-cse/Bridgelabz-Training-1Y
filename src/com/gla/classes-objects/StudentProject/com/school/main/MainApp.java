package com.school.main;
import java.util.Scanner;
import com.school.data.*;
import com.school.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Marks 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter Marks 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter Marks 3: ");
        double m3 = sc.nextDouble();
        Student s = new Student(n, m1, m2, m3);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        String g = a.findGrade(avg);
        System.out.println("\n---Student Report ---");
        System.out.println(s);
        System.out.println("Average : " + avg);
        System.out.println("Grade   : " + g);
        sc.close();
    }
}