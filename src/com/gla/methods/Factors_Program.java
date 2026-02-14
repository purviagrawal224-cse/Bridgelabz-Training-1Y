import java.util.Scanner;
public class Factors_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int[] fact = findFactors(num);
        System.out.print("Factors: ");
        for (int f : fact) System.out.print(f + " ");
        System.out.println("\nSum: " + findSum(fact));
        System.out.println("Product: " + findProduct(fact));
        System.out.println("Sum of Squares: " + findSumOfSquares(fact));
        sc.close();
    }
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;
        int[] fact = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) fact[idx++] = i;
        return fact;
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
    public static long findProduct(int[] arr) {
        long prod = 1;
        for (int i : arr) prod *= i;
        return prod;
    }
    public static double findSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr) sum += Math.pow(i, 2);
        return sum;
    }
}
