package Lambda;
import java.util.*;
class S {
    String n;
    double p;

    S(String n, double p) {
        this.n = n;
        this.p = p;
    }
}
public class StockPriceLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<S> l = new ArrayList<>();
        System.out.println("Enter number of stocks:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and price:");
            String name = sc.next();
            double p = sc.nextDouble();
            l.add(new S(name, p));
        }
        l.forEach(s -> System.out.println(s.n + " " + s.p));
        sc.close();
    }
}