import java.util.Scanner;
public class TestEqual {
    static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(isEqual(x, y));
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isEqual(s1, s2));
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println(isEqual(d1, d2));
    }
}