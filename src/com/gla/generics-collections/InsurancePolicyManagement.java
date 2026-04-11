import java.util.*;
import java.time.*;
class Policy implements Comparable<Policy> {
    int id;
    String name;
    LocalDate exp;
    String type;
    double premium;
    Policy(int id, String name, LocalDate exp, String type, double premium) {
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.type = type;
        this.premium = premium;
    }
    public int compareTo(Policy o) {
        return this.exp.compareTo(o.exp);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return id == p.id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return id + " " + name + " " + exp + " " + type + " " + premium;
    }
}
public class InsurancePolicyManagement {
    static void display(Set<Policy> s) {
        for (Policy p : s) System.out.println(p);
    }
    static void expiringSoon(Set<Policy> s) {
        LocalDate now = LocalDate.now();
        LocalDate next = now.plusDays(30);
        for (Policy p : s) {
            if (!p.exp.isBefore(now) && !p.exp.isAfter(next)) System.out.println(p);
        }
    }
    static void byType(Set<Policy> s, String t) {
        for (Policy p : s) {
            if (p.type.equalsIgnoreCase(t)) System.out.println(p);
        }
    }
    public static void main(String[] args) {
        Set<Policy> h = new HashSet<>();
        Set<Policy> l = new LinkedHashSet<>();
        Set<Policy> t = new TreeSet<>();
        Policy p1 = new Policy(1, "A", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(2, "B", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(3, "C", LocalDate.now().plusDays(20), "Home", 4000);
        Policy p4 = new Policy(1, "D", LocalDate.now().plusDays(5), "Health", 6000);
        Collections.addAll(h, p1, p2, p3, p4);
        Collections.addAll(l, p1, p2, p3, p4);
        Collections.addAll(t, p1, p2, p3, p4);
        System.out.println("All Policies (HashSet):");
        display(h);
        System.out.println("Expiring Soon:");
        expiringSoon(h);
        System.out.println("Health Policies:");
        byType(h, "Health");
        long start, end;
        start = System.nanoTime();
        h.contains(p2);
        end = System.nanoTime();
        System.out.println("HashSet search: " + (end - start));
        start = System.nanoTime();
        l.contains(p2);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search: " + (end - start));
        start = System.nanoTime();
        t.contains(p2);
        end = System.nanoTime();
        System.out.println("TreeSet search: " + (end - start));
    }
}