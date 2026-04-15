package Lambda;
import java.util.*;
import java.time.*;
class M {
    String n;
    LocalDate d;
    M(String n, LocalDate d) {
        this.n = n;
        this.d = d;
    }
}
public class ExpiringMemberships {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<M> l = new ArrayList<>();
        System.out.println("Enter number of members:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and expiry date (yyyy-mm-dd):");
            String name = sc.next();
            String dt = sc.next();
            l.add(new M(name, LocalDate.parse(dt)));
        }
        LocalDate now = LocalDate.now();
        LocalDate next = now.plusDays(30);
        l.stream()
         .filter(m -> !m.d.isBefore(now) && !m.d.isAfter(next))
         .forEach(m -> System.out.println(m.n + " " + m.d));
        sc.close();
    }
}