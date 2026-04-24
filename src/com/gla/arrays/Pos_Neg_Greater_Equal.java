package com.gla.arrays;

import java.util.Scanner;

public class Pos_Neg_Greater_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        System.out.println("Enter the number");
        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (number[i] > 0) {
                System.out.println("Number is positive");
                if (number[i] % 2 == 0) System.out.println("it is even");
                else System.out.println("it is odd");
            } else if (number[i] == 0) System.out.println("it is zero");
            else System.out.println("it is negative");
        }
        int c = number[0] - number[4];
        if (c == 0) System.out.print("equal");
        else if (c > 0) System.out.print("first number is greater");
        else System.out.print("Second number is greater");
        sc.close();
    }
}
