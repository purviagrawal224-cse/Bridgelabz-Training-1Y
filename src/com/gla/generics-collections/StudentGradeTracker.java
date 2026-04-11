import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double marks = sc.nextDouble();
            sc.nextLine();
            map.put(name, marks);
        }
        System.out.print("Enter student name to update: ");
        String u = sc.nextLine();
        if (map.containsKey(u)) {
            System.out.print("Enter new marks: ");
            double m = sc.nextDouble();
            map.put(u, m);
            sc.nextLine();
        }
        System.out.print("Enter student name to remove: ");
        String r = sc.nextLine();
        map.remove(r);
        TreeMap<String, Double> sorted = new TreeMap<>(map);
        System.out.println("Final List:");
        for (Map.Entry<String, Double> e : sorted.entrySet()) System.out.println(e.getKey() + " " + e.getValue());
    }
}
