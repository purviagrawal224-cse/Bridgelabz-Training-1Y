import java.util.*;
public class CountryCapitalLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String country = sc.nextLine();
            String capital = sc.nextLine();
            map.put(country, capital);
        }
        String query = sc.nextLine();
        if (map.containsKey(query)) System.out.println(map.get(query));
        else System.out.println("Unknown country");
        TreeMap<String, String> tm = new TreeMap<>(map);
        for (String k : tm.keySet()) System.out.println(k + " " + tm.get(k));
        }
    }
}