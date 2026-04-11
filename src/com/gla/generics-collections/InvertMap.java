import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String k = sc.nextLine();
            int v = sc.nextInt();
            sc.nextLine();
            map.put(k, v);
        }
        Map<Integer, List<String>> inv = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String k = e.getKey();
            int v = e.getValue();
            inv.putIfAbsent(v, new ArrayList<>());
            inv.get(v).add(k);
        }
        System.out.println(inv);
    }
}
