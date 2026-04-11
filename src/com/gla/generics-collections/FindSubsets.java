import java.util.*;
public class FindSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) s1.add(sc.nextInt());
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) s2.add(sc.nextInt());
        System.out.println(s2.containsAll(s1));
    }
}
