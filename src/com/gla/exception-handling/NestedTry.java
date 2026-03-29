import java.util.*;
public class NestedTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            try {
                System.out.print("Enter divisor: ");
                int d = sc.nextInt();
                int r = a[i] / d;
                System.out.println("Result: " + r);
            }
            catch(ArithmeticException e){
                System.out.println("Cannot divide by zero!");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }
    }
}