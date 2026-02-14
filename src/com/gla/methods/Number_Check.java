import java.util.Scanner;
public class Number_Check {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            if (isPositive(num[i])) {
                if (isEven(num[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            }
            else System.out.println("Negative");
        }
        int res = compare(num[0], num[4]);
        if (res == 1) System.out.println("First element is greater");
        else if (res == 0) System.out.println("Both elements are equal");
        else System.out.println("Last element is greater");
        sc.close();
    }
}
