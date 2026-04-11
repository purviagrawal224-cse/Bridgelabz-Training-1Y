import java.util.*;
import java.time.*;
class Policy implements Comparable<Policy> {
    String num, name, type;
    LocalDate exp;
    double amt;
    Policy(String num, String name, LocalDate exp, String type, double amt) {
        this.num = num;
        this.name = name;
        this.exp = exp;
        this.type = type;
        this.amt = amt;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return num.equals(p.num);
    }
    public int hashCode() {
        return Objects.hash(num);
    }
    public int compareTo(Policy o) {
        return this.exp.compareTo(o.exp);
    }
    public String toString() {
        return num + " " + name + " " + exp + " " + type + " " + amt;
    }
}
public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Policy> hash = new HashSet<>();
        Set<Policy> linked = new LinkedHashSet<>();
        Set<Policy> tree = new TreeSet<>();
        List<Policy> duplicates = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String num = sc.nextLine();
            String name = sc.nextLine();
            LocalDate date = LocalDate.parse(sc.nextLine());
            String type = sc.nextLine();
            double amt = sc.nextDouble();
            sc.nextLine();
            Policy p = new Policy(num, name, date, type, amt);
            if (!hash.add(p)) duplicates.add(p);
            else{
                linked.add(p);
                tree.add(p);
            }
        }
        for (Policy p : hash) System.out.println(p);
        for (Policy p : linked) System.out.println(p);
        for (Policy p : tree) System.out.println(p);
        LocalDate now = LocalDate.now();
        for (Policy p : tree) {
            if (!p.exp.isBefore(now) && p.exp.isBefore(now.plusDays(30))) System.out.println(p);
        }
        String search = sc.nextLine();
        for (Policy p : hash) {
            if (p.type.equalsIgnoreCase(search)) System.out.println(p);
        }
        for (Policy p : duplicates) System.out.println(p);
        long t1 = System.nanoTime();
        hash.containsAll(hash);
        long t2 = System.nanoTime();
        long t3 = System.nanoTime();
        linked.containsAll(linked);
        long t4 = System.nanoTime();
        long t5 = System.nanoTime();
        tree.containsAll(tree);
        long t6 = System.nanoTime();
        System.out.println(t2 - t1);
        System.out.println(t4 - t3);
        System.out.println(t6 - t5);
    }
}
