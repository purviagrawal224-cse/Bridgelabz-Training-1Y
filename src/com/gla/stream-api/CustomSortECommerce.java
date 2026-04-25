package Lambda;
import java.util.*;
class P {
    String n;
    int pr, rt, d;
    P(String n, int pr, int rt, int d) {
        this.n = n;
        this.pr = pr;
        this.rt = rt;
        this.d = d;
    }
}
public class CustomSortECommerce{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<P> l = new ArrayList<>();
        System.out.println("Enter number of products:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name price rating discount:");
            String name = sc.next();
            int pr = sc.nextInt();
            int rt = sc.nextInt();
            int d = sc.nextInt();
            l.add(new P(name, pr, rt, d));
        }
        System.out.println("1.Price 2.Rating 3.Discount");
        int ch = sc.nextInt();
        if (ch == 1) l.sort((a, b) -> a.pr - b.pr);
        else if (ch == 2) l.sort((a, b) -> b.rt - a.rt);
        else if (ch == 3) l.sort((a, b) -> b.d - a.d);
        else System.out.println("Invalid choice");
        for (P p : l) System.out.println(p.n + " " + p.pr + " " + p.rt + " " + p.d);
        sc.close();
    }
}