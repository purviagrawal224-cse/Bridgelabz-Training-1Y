import java.util.*;
public class FindFreq {
    static Map<String, Integer> findFreq(List<String> l) {
        Map<String, Integer> m = new HashMap<>();
        for (String s : l) {
            m.put(s, m.getOrDefault(s, 0) + 1);
        }

        return m;
    }
    public static void main(String[] args) {
        List<String> l = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(findFreq(l));
    }
}