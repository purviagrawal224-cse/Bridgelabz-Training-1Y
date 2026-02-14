import java.util.Scanner;
public class Hand_shakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudents = sc.nextInt();
        int res = calculate(totalStudents);
        System.out.println("The maximum number of handshakes is "+res);
    }
    public static int calculate(int n) {
        return (n*(n-1))/2;
    }
}