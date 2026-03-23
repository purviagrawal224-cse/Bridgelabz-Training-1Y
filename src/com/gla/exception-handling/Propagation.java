import java.util.*;
public class Propagation {
    static void m1(int a, int b){
        int x = a / b;
        System.out.println("Result: " + x);
    }
    static void m2(int a, int b){
        m1(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            m2(a, b);
        }
        catch(ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}