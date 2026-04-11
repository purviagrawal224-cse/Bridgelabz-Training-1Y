import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        System.out.print("Enter size of Map1: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n1; i++) {
            String k = sc.nextLine();
            int v = sc.nextInt();
            sc.nextLine();
            m1.put(k, v);
        }
        System.out.print("Enter size of Map2: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n2; i++) {
            String k = sc.nextLine();
            int v = sc.nextInt();
            sc.nextLine();
            m2.put(k, v);
        }
        for (Map.Entry<String, Integer> e : m2.entrySet()) {
            String k = e.getKey();
            int v = e.getValue();
            m1.put(k, m1.getOrDefault(k, 0) + v);
        }
        System.out.println(m1);
    }
}
