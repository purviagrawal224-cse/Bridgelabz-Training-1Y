import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3);
        m2.put("C", 4);
        for (Map.Entry<String, Integer> e : m2.entrySet()) {
            String k = e.getKey();
            int v = e.getValue();
            m1.put(k, m1.getOrDefault(k, 0) + v);
        }
        System.out.println(m1);
    }
}