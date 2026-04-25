package Lambda;

import java.util.*;
class D {
    String n, s;
    boolean w;
    D(String n, String s, boolean w) {
        this.n = n;
        this.s = s;
        this.w = w;
    }
}
public class DoctorAvailability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<D> l = new ArrayList<>();
        System.out.println("Enter number of doctors:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name specialty weekend(true/false):");
            String name = sc.next();
            String s = sc.next();
            boolean w = sc.nextBoolean();
            l.add(new D(name, s, w));
        }
        l.stream()
         .filter(d -> d.w)
         .sorted((a, b) -> a.s.compareTo(b.s))
         .forEach(d -> System.out.println(d.n + " " + d.s + " " + d.w));
        sc.close();
    }
}