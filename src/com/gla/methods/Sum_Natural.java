import java.util.Scanner;
public class Sum_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int res = calculate(n);
        System.out.println("The sum of first " +n+ " natural numbers is "+res);
    }
    public static int calculate(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) sum += i;
        return sum;
    }
}