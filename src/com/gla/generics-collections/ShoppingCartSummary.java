import java.util.*;
public class ShoppingCartSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            map.put(name, price);
        }
        int ops = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ops; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                String name = sc.nextLine();
                double price = sc.nextDouble();
                sc.nextLine();
                map.put(name, price);
            } 
            else if (ch == 2) {
                String name = sc.nextLine();
                map.remove(name);
            }
        }
        double total = 0;
        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
            total += map.get(k);
        }
        if (total > 5000) total = total * 0.9;
        System.out.println("Total: " + total);
    }
}