import java.util.Scanner;
public class Division_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();
        int[] res = findRemAndQuot(num, div);
        System.out.println("Quotient : " + res[0]);
        System.out.println("Remainder : " + res[1]);
    }
    public static int[] findRemAndQuot(int n, int d) {
        int quot = n/d;
        int rem = n%d;
        return new int[]{quot,rem};
    }
}