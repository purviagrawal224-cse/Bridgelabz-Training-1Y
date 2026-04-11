import java.util.*;
public class NumericSum {
    static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        List<Double> ld = new ArrayList<>();
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) li.add(sc.nextInt());
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) ld.add(sc.nextDouble());
        System.out.println(sumNumbers(li));
        System.out.println(sumNumbers(ld));
    }
}
