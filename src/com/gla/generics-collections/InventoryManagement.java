import java.util.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                String name = sc.nextLine();
                int qty = sc.nextInt();
                sc.nextLine();
                map.put(name, map.getOrDefault(name, 0) + qty);
            } 
            else if (ch == 2) {
                String name = sc.nextLine();
                int qty = sc.nextInt();
                sc.nextLine();
                if (map.containsKey(name)) {
                    int left = map.get(name) - qty;
                    if (left <= 0) map.remove(name);
                    else map.put(name, left);
                }
            } 
            else if (ch == 3) {
                String name = sc.nextLine();
                int qty = sc.nextInt();
                sc.nextLine();
                map.put(name, map.getOrDefault(name, 0) + qty);
            } 
            else if (ch == 4) {
                String name = sc.nextLine();
                if (map.containsKey(name)) System.out.println(map.get(name));
                else System.out.println("not stocked");
            }
        }

        for (String k : map.keySet()) {
            if (map.get(k) == 0) System.out.println(k);
        }
    }
}