import java.util.*;
import java.util.Scanner;
public class WordFreqCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase().replaceAll("[^a-z ]", "");
        String[] arr = s.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String w : arr) {
            if (w.length() == 0) continue;
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println(map);
    }
}