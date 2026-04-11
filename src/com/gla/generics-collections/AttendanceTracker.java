import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            map.put(name, 0);
        }
        int days = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < days; i++) {
            int p = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < p; j++) {
                String name = sc.nextLine();
                if (map.containsKey(name)) map.put(name, map.get(name) + 1);
            }
        }
        int th = sc.nextInt();
        for (String k : map.keySet()) {
            if (map.get(k) < th) System.out.println(k+" "+map.get(k));
        }
    }
}