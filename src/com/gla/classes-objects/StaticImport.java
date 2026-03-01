import static java.lang.Math.*;
import java.util.Scanner;
public class StaticImport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("\n--Math Operations--");
        System.out.println("Square Root of first number : " + sqrt(a));
        System.out.println("Power (a^b) : " + pow(a, b));
        System.out.println("Maximum    : " + max(a, b));
        System.out.println("Minimum  : " + min(a, b));
        System.out.println("Absolute value of first : " + abs(a));
        sc.close();
    }
}