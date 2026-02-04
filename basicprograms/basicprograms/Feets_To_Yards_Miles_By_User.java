import java.util.Scanner;

public class Feets_To_Yards_Miles_By_User {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();


        double yards = feet / 3;
        double miles = yards / 1760;


        System.out.print("Distance in feet is " + feet);
        System.out.print("Distance in yards is " + yards);
        System.out.print("Distance in miles is " + miles);
    }
}