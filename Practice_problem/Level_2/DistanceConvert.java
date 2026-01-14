package Level_2;

import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double d_F = input.nextDouble();
        double d_Y = d_F / 3.0;
        double d_M = d_Y / 1760.0;

        System.out.println("The distance of " + d_F + " feet is " + d_Y + " yards and " + d_M + " miles.");


    }
}
