import java.util.*;
public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            int cnt = sc.nextInt();
            sc.nextLine();
            map.put(code, cnt);
        }
        int ops = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ops; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            String code = sc.nextLine();
            int val = sc.nextInt();
            sc.nextLine();
            if (map.containsKey(code)) {
                if (ch == 1) map.put(code, map.get(code) + val);
                else if (ch == 2) {
                    int x = map.get(code) - val;
                    if (x < 0) x = 0;
                    map.put(code, x);
                }
            }
        }
        for (String k : map.keySet()) {
            int v = map.get(k);
            if (v >= 50) System.out.println("Full: " + k + " " + v);
            else if (v < 5) System.out.println("Low: " + k + " " + v);
        }
    }
}