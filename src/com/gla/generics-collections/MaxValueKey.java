import java.util.*;
public class MaxValueKey {
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
        String ans = "";
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(ans);
    }
}
