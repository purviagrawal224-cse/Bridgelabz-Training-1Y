import java.util.*;
public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int r = a / b;
            System.out.println("Result: " + r);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}