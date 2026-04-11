import java.util.Scanner;
public class TestMax {
    static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T m = x;
        if (y.compareTo(m) > 0) m = y;
        if (z.compareTo(m) > 0) m = z;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maximum(a, b, c));
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        System.out.println(maximum(d1, d2, d3));
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.println(maximum(s1, s2, s3));
    }
}