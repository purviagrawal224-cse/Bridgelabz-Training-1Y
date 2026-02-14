import java.util.Scanner;
public class Factors_Of_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        for(int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Greatest Factor : " + greatestFactor(factors));
        System.out.println("Sum of Factors : " + sumOfFactors(factors));
        System.out.println("Product of Factors : " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors : " + productOfCubes(factors));
        sc.close();
    }
    public static int[] findFactors(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors[idx] = i;
                idx++;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }
    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for(int f : arr) sum += f;
        return sum;
    }
    public static long productOfFactors(int[] arr) {
        long prod = 1;
        for(int f : arr) prod *= f;
        return prod;
    }
    public static long productOfCubes(int[] arr) {
        long prod = 1;
        for(int f : arr) prod *= (long)Math.pow(f, 3);
        return prod;
    }
}
