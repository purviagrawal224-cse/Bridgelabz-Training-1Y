package Lambda;
import java.util.*;
import java.util.stream.*;
class C {
    String t;
    double a;
    C(String t, double a) {
        this.t = t;
        this.a = a;
    }
}
public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<C> l = new ArrayList<>();
        System.out.println("Enter number of claims:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter type and amount:");
            String t = sc.next();
            double a = sc.nextDouble();
            l.add(new C(t, a));
        }
        Map<String, Double> m =
                l.stream()
                 .collect(Collectors.groupingBy(
                         c -> c.t,
                         Collectors.averagingDouble(c -> c.a)
                 ));
        m.forEach((k, v) -> System.out.println(k + " " + v));
        sc.close();
    }
}