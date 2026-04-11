import java.util.*;
public class MaximumOfThree {
    static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch == 1) {
            Integer x = sc.nextInt();
            Integer y = sc.nextInt();
            Integer z = sc.nextInt();
            System.out.println(maximum(x, y, z));
        } 
        else if (ch == 2) {
            Double x = sc.nextDouble();
            Double y = sc.nextDouble();
            Double z = sc.nextDouble();
            System.out.println(maximum(x, y, z));
        } 
        else if (ch == 3) {
            String x = sc.next();
            String y = sc.next();
            String z = sc.next();
            System.out.println(maximum(x, y, z));
        }
    }
}
