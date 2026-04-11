import java.util.*;
public class ExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Map<String, Integer>> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String sub = sc.nextLine();
            int m = sc.nextInt();
            sc.nextLine();
            Map<String, Integer> inner = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String name = sc.nextLine();
                int marks = sc.nextInt();
                sc.nextLine();
                inner.put(name, marks);
            }
            map.put(sub, inner);
        }
        for (String sub : map.keySet()) {
            Map<String, Integer> inner = map.get(sub);
            String top = "";
            int max = 0;
            int sum = 0;
            boolean flag = false;
            for (String name : inner.keySet()) {
                int marks = inner.get(name);
                sum += marks;
                if (marks > max) {
                    max = marks;
                    top = name;
                }

                if (marks > 90) flag = true;
            }
            double avg = (double) sum / inner.size();
            System.out.println(sub + " Topper: " + top);
            System.out.println(sub + " Avg: " + avg);
            if (flag) System.out.println("Above90: " + sub);
        }
    }
}