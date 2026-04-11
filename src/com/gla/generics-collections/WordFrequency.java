import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase().replaceAll("[^a-z0-9 ]", "");
        String[] arr = s.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String w : arr) {
            if (w.length() > 0) map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        for (String k : map.keySet()) System.out.println(k + " " + map.get(k));
    }
}