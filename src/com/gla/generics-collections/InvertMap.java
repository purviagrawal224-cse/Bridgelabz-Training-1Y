import java.util.*;
import java.util.Scanner;
public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
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