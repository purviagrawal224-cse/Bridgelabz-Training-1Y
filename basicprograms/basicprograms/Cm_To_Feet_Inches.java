import java.util.Scanner;

public class Cm_To_Feet_Inches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height : ");
        double h = input.nextDouble();

        double total_Inches = h / 2.54;

        int feet = (int) (total_Inches / 12);
        double inches = total_Inches % 12;

        System.out.println("Your Height in cm is " + h+" while in feet is "+feet+" and inches is "+inches);
    }
}
