import java.util.Scanner;
public class Chocolate_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemAndQuot(chocolates, children);
        System.out.println("Each child gets : "+res[0]);
        System.out.println("Remaining chocolates : "+res[1]);
    }
    public static int[] findRemAndQuot(int n, int d) {
        int each = n/d;
        int remaining = n%d;
        return new int[]{each,remaining};
    }
}