package Lambda;
import java.util.*;
class M {
    String n;
    int r, y;
    M(String n, int r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }
}
public class TopMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<M> l = new ArrayList<>();
        System.out.println("Enter number of movies:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name rating year:");
            String name = sc.next();
            int r = sc.nextInt();
            int y = sc.nextInt();
            l.add(new M(name, r, y));
        }
        System.out.println("Enter minimum rating:");
        int min = sc.nextInt();
        l.stream()
         .filter(m -> m.r >= min)
         .sorted((a, b) -> {
             if (b.r != a.r) return b.r - a.r;
             else return b.y - a.y;
         })
         .limit(5)
         .forEach(m -> System.out.println(m.n + " " + m.r + " " + m.y));
        sc.close();
    }
}