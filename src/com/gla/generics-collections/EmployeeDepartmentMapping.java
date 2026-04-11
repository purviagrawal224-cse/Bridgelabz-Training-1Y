import java.util.*;
public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String dept = sc.nextLine();
            map.put(id, dept);
        }
        int ops = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ops; i++) {
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                int id = sc.nextInt();
                sc.nextLine();
                String dept = sc.nextLine();
                if (map.containsKey(id)) {
                    map.put(id, dept);
                }
            } 
            else if (ch == 2) {
                String dept = sc.nextLine();
                for (int k : map.keySet()) {
                    if (map.get(k).equals(dept)) System.out.println(k);
                }
            }
        }

        Map<String, Integer> count = new HashMap<>();
        for (String d : map.values()) count.put(d, count.getOrDefault(d, 0) + 1);
        for (String d : count.keySet()) System.out.println(d+" "+count.get(d));
    }
}