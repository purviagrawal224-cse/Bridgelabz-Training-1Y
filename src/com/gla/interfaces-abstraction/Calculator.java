import java.util.Scanner;
@FunctionalInterface
interface Calc {
    /**
     * Performs operation on two numbers.
     * @param a first value
     * @param b second value
     * @return result
     */
    double op(double a, double b);
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("1 Add, 2 Multiply: ");
        int c = sc.nextInt();
        Calc add = (x, y) -> x + y;
        Calc mul = (x, y) -> x * y;
        if (c == 1) System.out.println("Result: " + add.op(a, b));
        else if (c == 2) System.out.println("Result: " + mul.op(a, b));
        else System.out.println("Invalid choice");
    }
}