import java.util.*;
public class CompareValues {
    static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch == 1) {
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            System.out.println(isEqual(a, b));
        } 
        else if (ch == 2) {
            Double a = sc.nextDouble();
            Double b = sc.nextDouble();
            System.out.println(isEqual(a, b));
        } 
        else if (ch == 3) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(isEqual(a, b));
        }
    }
}
