import java.util.*;
public class NumericSum {
    static double sumNumbers(List<? extends Number> l) {
        double s = 0;
        for (Number n : l) {
            s += n.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        System.out.println(sumNumbers(l1));
        List<Double> l2 = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println(sumNumbers(l2));
    }
}