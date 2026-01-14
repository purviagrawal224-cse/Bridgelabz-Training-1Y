import java.util.Scanner;

public class Km_To_Miles_By_User {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter km : ");
        double km = in.nextDouble();

        double miles = km * 0.621371;
        System.out.println("The total miles is " + miles +" mile for the given"+ km +"km");
    }
}
