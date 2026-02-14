import java.util.Scanner;
public class Number_Checker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        System.out.println("Number : " + num);
        System.out.println("Perfect Number : " + isPerfect(num));
        System.out.println("Abundant Number : " + isAbundant(num));
        System.out.println("Deficient Number : " + isDeficient(num));
        System.out.println("Strong Number : " + isStrong(num));
        sc.close();
    }
    public static int sumOfProperDivisors(int n) {
        int sum = 0;
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) sum += i;
        }
        return sum;
    }
    public static boolean isPerfect(int n) {
        return sumOfProperDivisors(n) == n && n != 0;
    }
    public static boolean isAbundant(int n) {
        return sumOfProperDivisors(n) > n;
    }
    public static boolean isDeficient(int n) {
        return sumOfProperDivisors(n) < n;
    }
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while(temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
}
