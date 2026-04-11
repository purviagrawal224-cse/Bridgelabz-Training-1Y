import java.util.*;
public class VotingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        String winner = "";
        int max = 0;
        for (String k : map.keySet()) {
            int v = map.get(k);
            System.out.println(k + " " + v);
            if (v > max) {
                max = v;
                winner = k;
            }
        }
        System.out.println("Winner: " + winner);
    }
}