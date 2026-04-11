import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Alice", 85.5);
        map.put("Bob", 72.0);
        map.put("Carol", 90.0);
        map.put("Bob", 80.0);
        map.remove("Carol");
        TreeMap<String, Double> sorted = new TreeMap<>(map);
        for (Map.Entry<String, Double> e : sorted.entrySet()) System.out.println(e.getKey() + " " + e.getValue());
    }
}