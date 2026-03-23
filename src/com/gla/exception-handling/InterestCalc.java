import java.util.*;
public class InterestCalc {
    static double c(double a, double r, int y) throws IllegalArgumentException {
        if(a < 0 || r < 0){
            throw new IllegalArgumentException();
        }
        return (a * r * y) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter amount: ");
            double a = sc.nextDouble();
            System.out.print("Enter rate: ");
            double r = sc.nextDouble();
            System.out.print("Enter years: ");
            int y = sc.nextInt();
            double i = c(a, r, y);
            System.out.println("Interest: " + i);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}