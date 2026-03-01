package com.bank.main;
import java.util.Scanner;
import com.bank.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        InterestCalculator ic = new InterestCalculator();
        double si = ic.si(p, r, t);
        double ci = ic.ci(p, r, t);
        System.out.println("\n--- Interest Details ---");
        System.out.println("Simple Interest   : " + si);
        System.out.println("Compound Interest : " + ci);
        sc.close();
    }
}