import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String acc = sc.nextLine();
            double bal = sc.nextDouble();
            sc.nextLine();
            map.put(acc, bal);
        }
        int ops = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ops; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            String acc = sc.nextLine();
            double amt = sc.nextDouble();
            sc.nextLine();
            if (map.containsKey(acc)) {
                double bal = map.get(acc);
                if (ch == 1) map.put(acc, bal + amt); 
                else if (ch == 2) {
                    if (amt <= bal) map.put(acc, bal - amt);
                    else System.out.println("Insufficient balance");
                }
            }
        }
        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Double> e : list) System.out.println(e.getKey() + " " + e.getValue());
        int k = Math.min(3, list.size());
        for (int i = 0; i < k; i++) System.out.println("Top: " + list.get(i).getKey());
    }
}