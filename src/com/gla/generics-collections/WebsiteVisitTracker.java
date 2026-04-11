import java.util.*;
public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String page = sc.nextLine();
            map.put(page, map.getOrDefault(page, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> e : list) System.out.println(e.getKey() + " " + e.getValue());
        String top = "";
        int max = 0;
        for (Map.Entry<String, Integer> e : list) {
            if (e.getValue() > max) {
                max = e.getValue();
                top = e.getKey();
            }
        }
        System.out.println("Most visited: " + top);
    }
}