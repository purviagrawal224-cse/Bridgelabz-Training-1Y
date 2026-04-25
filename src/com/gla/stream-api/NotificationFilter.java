package Lambda;
import java.util.*;
import java.util.function.Predicate;
class A {
    String t;
    int p;
    A(String t, int p) {
        this.t = t;
        this.p = p;
    }
}
public class NotificationFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<A> l = new ArrayList<>();
        System.out.println("Enter number of alerts:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter type and priority:");
            String t = sc.next();
            int p = sc.nextInt();
            l.add(new A(t, p));
        }
        Map<Integer, Predicate<A>> m = new HashMap<>();
        m.put(1, a -> a.t.equalsIgnoreCase("critical"));
        m.put(2, a -> a.p >= 5);
        m.put(3, a -> a.t.equalsIgnoreCase("critical") && a.p >= 5);
        System.out.println("1.Critical 2.HighPriority 3.Both");
        int ch = sc.nextInt();
        if (m.containsKey(ch)) {
            Predicate<A> f = m.get(ch);
            for (A a : l) {
                if (f.test(a)) System.out.println(a.t + " " + a.p);
            }
        }
	else System.out.println("Invalid choice");
        sc.close();
    }
}